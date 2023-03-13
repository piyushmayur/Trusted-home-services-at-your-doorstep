package com.comfortatyourdoorstep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@Component
public class MyConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService getUserDetailsService(){
		return new UserDetailsServiceImpl();
	}
		
		@Bean
		public BCryptPasswordEncoder PasswordEncoder() {
			
			return new BCryptPasswordEncoder();
		}
		
		@Bean
		public DaoAuthenticationProvider authenticationProvider() {
			
			DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
			daoAuthenticationProvider.setUserDetailsService(this.getUserDetailsService());
			daoAuthenticationProvider.setPasswordEncoder(PasswordEncoder());
			
			return daoAuthenticationProvider;
		}
		
		//methods configuration

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.authenticationProvider(authenticationProvider());
			//auth.inMemoryAuthentication();===>second option
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			/*
			http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/user/**").hasRole("user")
			.antMatchers("/**").permitAll();  
			http.csrf().disable();  */
		    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/**").hasRole("USER")
			.antMatchers("/**").permitAll().and().csrf().disable();
		}
		
		
		
		
		
		
		
		
		
	}
	

