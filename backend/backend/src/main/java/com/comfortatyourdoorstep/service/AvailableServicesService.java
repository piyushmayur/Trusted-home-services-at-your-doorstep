package com.comfortatyourdoorstep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.comfortatyourdoorstep.entities.AvailableServices;
import com.comfortatyourdoorstep.repository.AvailableServicesRepository;

@Service
public class AvailableServicesService {

	@Autowired
	private AvailableServicesRepository availableServicesRepository;

	public List<AvailableServices> getAvailableServices() {
		List<AvailableServices> list = (List<AvailableServices>) availableServicesRepository.findAll();
		return list;
	}

	public AvailableServices addAvailableServices(AvailableServices service) {
		// TODO Auto-generated method stub
		AvailableServices result = availableServicesRepository.save(service);
		return result;
	}

}
