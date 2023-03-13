package com.comfortatyourdoorstep.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comfortatyourdoorstep.dto.ServiceDto;
import com.comfortatyourdoorstep.entities.ServiceProvider;
import com.comfortatyourdoorstep.entities.Services;
import com.comfortatyourdoorstep.service.ServiceService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceController {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ServiceService serviceService;

	@GetMapping("/getservice")
	public ResponseEntity<?> getServices() {

		//List<Services> list = serviceService.getAllServices();
		List<Services> list = serviceService.getServicesAndEmployees();
		
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}

	@PostMapping("/addservice")
	// @ResponseBody
	public ResponseEntity<?> addserviceprovider(@Valid@RequestBody ServiceDto servicedto) {

		Services service = mapper.map(servicedto, Services.class);
		
		int amount=Integer.parseInt(service.getServicecharge());
		int total=amount+500;
		
		service.setServicecharge(Integer.toString(total));

		ServiceProvider emp = mapper.map(servicedto, ServiceProvider.class);

		service.setEmployee(emp);

		Services result = serviceService.addService(service);

		return ResponseEntity.ok(result);

	}
	
	@PutMapping("/updateservice/{id}")
	// @ResponseBody
	public ResponseEntity<?> updateserviceprovider(@PathVariable("id")int id,@Valid @RequestBody ServiceDto servicedto) {
		System.out.println("dto == >"+servicedto);
		Services service = mapper.map(servicedto, Services.class);
		service.setServiceid(id);
		ServiceProvider emp = mapper.map(servicedto, ServiceProvider.class);
		emp.setId(servicedto.getEmpid());
		System.out.println("employee =="+emp);
		service.setEmployee(emp);
		Services result = serviceService.addService(service);
		return ResponseEntity.ok(result);

	}

	@DeleteMapping("/deleteservice/{id}")
	public ResponseEntity<?> deleteemp(@PathVariable("id") int id) {
		try {
			this.serviceService.deleteservice(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@GetMapping("/getservicebyid/{id}")
	public ResponseEntity<?> getservicebyid(@PathVariable("id") int id) {
			Services result=this.serviceService.getservicebyid(id);
			
			if (result==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	@PostMapping("/updatesingleemployee")
	public ResponseEntity<?>updateServices1(@Valid@RequestBody ServiceDto servicedto) {
		Services service = mapper.map(servicedto, Services.class);

		ServiceProvider emp = mapper.map(servicedto, ServiceProvider.class);

		service.setEmployee(emp);

		Services result = serviceService.addService(service);

		return ResponseEntity.ok(result);
	}

	
	
	@PutMapping("/updatesingleemployee")
	public ResponseEntity<?>updateServices(@Valid@RequestBody ServiceDto servicedto) {
		Services service = mapper.map(servicedto, Services.class);

		ServiceProvider emp = mapper.map(servicedto, ServiceProvider.class);

		service.setEmployee(emp);

		Services result = serviceService.addService(service);

		return ResponseEntity.ok(result);
	}

}