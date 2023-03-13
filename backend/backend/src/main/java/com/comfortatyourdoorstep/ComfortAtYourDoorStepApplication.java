package com.comfortatyourdoorstep;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComfortAtYourDoorStepApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(ComfortAtYourDoorStepApplication.class, args);
		
		
	}
	
	
	
	
	
	@Bean
	public ModelMapper mapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
