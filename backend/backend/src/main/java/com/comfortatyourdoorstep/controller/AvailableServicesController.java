package com.comfortatyourdoorstep.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comfortatyourdoorstep.dto.AvailableServiceDto;
import com.comfortatyourdoorstep.entities.AvailableServices;
import com.comfortatyourdoorstep.service.AvailableServicesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AvailableServicesController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private AvailableServicesService availableServicesService;
	

	@GetMapping("/getavailableservice")
	public ResponseEntity<?> getavailableserviceetAvailableServices() {

		//List<Services> list = serviceDao.getAllServices();
		List<AvailableServices> list = availableServicesService.getAvailableServices();
		
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}
	
	
	@PostMapping("/addAvailableservice")
	// @ResponseBody
	public ResponseEntity<?> addserviceprovider(@Valid@RequestBody AvailableServiceDto dto) { 
		
		AvailableServices service = mapper.map(dto, AvailableServices.class);

		AvailableServices result = availableServicesService.addAvailableServices(service);

		return ResponseEntity.ok(result);

	}

	

}
