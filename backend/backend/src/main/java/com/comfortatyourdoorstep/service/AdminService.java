package com.comfortatyourdoorstep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAllAdmin() {
        List<Admin> list=(List<Admin>)this.adminRepository.findAll();
        return list;
    }
	
	public Admin validate(String userid,String pwd) {
		Optional<Admin> admin= adminRepository.findByEmailAndPassword(userid,pwd);
		return admin.isPresent()?admin.get():null;
	}

}
