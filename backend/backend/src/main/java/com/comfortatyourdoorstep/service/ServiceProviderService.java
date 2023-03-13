package com.comfortatyourdoorstep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.entities.ServiceProvider;
import com.comfortatyourdoorstep.repository.ServiceProviderRepository;

@Service
public class ServiceProviderService {

	@Autowired
	private ServiceProviderRepository serviceProviderRepository;
	
	public ServiceProvider addEmployee(ServiceProvider emp) {
		ServiceProvider result= serviceProviderRepository.save(emp);
		return result;
	}

	public List<ServiceProvider> getAllAdmin() {
		List<ServiceProvider> list=serviceProviderRepository.findAll();
        return list;
	}

	public void deleteemp(int id) {
		serviceProviderRepository.deleteById(id);
	}

	public ServiceProvider getEmp(int id) {
		ServiceProvider result= serviceProviderRepository.findByProviderId(id);		
		return result;
	}
}
