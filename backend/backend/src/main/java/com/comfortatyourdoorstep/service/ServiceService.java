package com.comfortatyourdoorstep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.Services;
import com.comfortatyourdoorstep.repository.ServiceRepository;

@Service
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepository;

	public Services addService(Services service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}

	public List<Services> getAllServices() {
		return serviceRepository.findAll();
	}

	public void deleteservice(int id) {
		serviceRepository.deleteById(id);
	}

	public List<Services> getServicesAndEmployees() {
		return serviceRepository.findAll();
	}

	public Services getservicebyid(int id) {
		Services service= serviceRepository.findById(id).get();
		return service;
	}



}
