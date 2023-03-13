package com.comfortatyourdoorstep.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.comfortatyourdoorstep.dto.ForgotPasswordDto;
import com.comfortatyourdoorstep.dto.SignupDto;
import com.comfortatyourdoorstep.entities.Address;
import com.comfortatyourdoorstep.entities.Signup;
import com.comfortatyourdoorstep.exception.ResourceNotFoundException;
import com.comfortatyourdoorstep.service.Email;
import com.comfortatyourdoorstep.service.SignupService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SingupController {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private SignupService signupService;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private Email email;

	@GetMapping("/serviceprovider")
	public ResponseEntity<?> getServiceprovider() {

		List<Signup> list = signupService.getAllserviceprovider();
		if (list.size() <= 0) {
			// return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			throw new ResourceNotFoundException("list is empty");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}

	@PostMapping("/signup")
	// @ResponseBody
	public ResponseEntity<?> addserviceprovider(@Valid @RequestBody SignupDto dto) {

		Signup obj = mapper.map(dto, Signup.class);
		obj.setPassword(passwordEncoder.encode(obj.getPassword()));
		System.out.println(obj);

		Address address = mapper.map(dto, Address.class);

		obj.setAddress(address);

		Signup result = this.signupService.addserviceProvider(obj);

		email.simpleEmail(dto.getEmail(), "Welcome to Comfort At your Door Step", 
				"Thankyou for Registering");

		return ResponseEntity.ok(result);
	}

	@PostMapping("/login")
	@ResponseBody
	public ResponseEntity<?> login(@RequestBody Signup serviceProviderSignup) {

		String email = serviceProviderSignup.getEmail();
		String password = serviceProviderSignup.getPassword();

		Signup result = this.signupService.loginUser(email);

		boolean var = passwordEncoder.matches(password, result.getPassword());

		if (var) {
			return ResponseEntity.ok(result);
		}
		return ResponseEntity.badRequest().body("invalid username and password");

	}

	@PostMapping("/forgotpass")
	@ResponseBody
	public ResponseEntity<?> forgotpass(@Valid @RequestBody ForgotPasswordDto dto) {

		String hobby = dto.getHobby();
		//String password = dto.getNewpassword();
		
		String password = passwordEncoder.encode(dto.getNewpassword());

		List<Integer> addressid = this.signupService.getid(hobby);

		for (int i = 0; i < addressid.size(); i++)
			System.out.println(addressid.get(i));

		for (int i = 0; i < addressid.size(); i++) {
			System.out.println("inside the function");

			Signup result = this.signupService.getpass(addressid.get(i));

			if (result != null) {

				System.out.println("result null a raha hai" + result);

				signupService.setMyNewPass(result.getPassword(), password);

				Signup updatedresult = this.signupService.getpass(addressid.get(i));

				System.out.println(updatedresult.getPassword());

				if (updatedresult.getPassword() != result.getPassword())
					return ResponseEntity.ok("password changed");
			}

		}

		return ResponseEntity.ok("enter valid password");

	}

	@PostMapping("/resetpass")
	@ResponseBody
	public String reset(@Valid @RequestBody ForgotPasswordDto forgotPassword) {

		String oldpassword = forgotPassword.getOldpassword();
		String newpassword = forgotPassword.getNewpassword();

		Signup result = signupService.setNewPass(oldpassword, newpassword);
		if (result == null)
			throw new ResourceNotFoundException("Enter valid information");

		Signup updatedresult = this.signupService.getResult(newpassword);
		if (updatedresult.getPassword() != oldpassword)
			return "password changed";
		return "Enter valid password";
	}

}
