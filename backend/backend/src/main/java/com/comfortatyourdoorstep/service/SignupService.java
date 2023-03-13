package com.comfortatyourdoorstep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.Address;
import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.entities.Signup;
import com.comfortatyourdoorstep.repository.SignupRepository;

@Service
public class SignupService {

	@Autowired
	private SignupRepository signupRepository;
	
	public List<Signup> getAllserviceprovider() {
        List<Signup> list=(List<Signup>)this.signupRepository.findAll();
        return list;
    }

	public Signup addserviceProvider(Signup obj) {
		// TODO Auto-generated method stub
		Signup result=signupRepository.save(obj);
		return result;
	}

	
	

	public List<Integer> getid(String hobby) {
		return signupRepository.getId(hobby);
		
	}

	public Signup getpass(int addressid) {
		return signupRepository.getPassword(addressid);

	}

	public Signup setNewPass(String password, String newpassword) {
		
		return signupRepository.setNewPassword(password,newpassword);
		
	}
	
   public void setMyNewPass(String password, String newpassword) {
		
		signupRepository.setMyNewPassword(password,newpassword);
		
	}

	public Signup getResult(String newpassword) {
		
		return signupRepository.getResult(newpassword);
	}

	public Address addAddressr(Address address) {
		return signupRepository.save(address);
		
	}

	
	public Signup getUserByUserName(String username) {
		
		return signupRepository.getUserByUserName( username);
	}

public Signup loginUser(String email) {
	
	return signupRepository.getLoginDetails(email);
}
	
	
	
}
