package com.comfortatyourdoorstep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.ServiceSeeker;
import com.comfortatyourdoorstep.repository.ServiceSeekerRepository;

@Service
public class ServiceSeekerService {

	@Autowired
	private ServiceSeekerRepository serviceSeekerRepository;

	public ServiceSeeker save(ServiceSeeker ss) {
		ServiceSeeker result = serviceSeekerRepository.save(ss);
		return result;
	}

	public List<ServiceSeeker> getAll() {
		return serviceSeekerRepository.findAll();
	}

	public void deleteMyOrder(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		serviceSeekerRepository.deleteByEmail(id);
	}

	public List<ServiceSeeker> getMyBooking(String email) {
		// TODO Auto-generated method stub
		return serviceSeekerRepository.getMyBooking(email);
	}


}
