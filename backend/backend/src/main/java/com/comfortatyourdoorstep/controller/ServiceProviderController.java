package com.comfortatyourdoorstep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comfortatyourdoorstep.entities.ServiceProvider;
import com.comfortatyourdoorstep.service.ServiceProviderService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ServiceProviderController {
	
	@Autowired
	private ServiceProviderService  serviceProviderService; 
	
	@GetMapping("/admin/get-emp")
    public ResponseEntity<List<ServiceProvider>> getEmp() {

        List<ServiceProvider> list = serviceProviderService.getAllAdmin();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
        
       
    }
	
	
	@PostMapping("/add-emp")
	public ServiceProvider addEmployee(@RequestBody ServiceProvider emp) {
		
		System.out.println(emp);
		
		
		ServiceProvider result=serviceProviderService.addEmployee(emp);
		return result;
	}
	
	
	@DeleteMapping("/deleteemp/{id}")
    public ResponseEntity<Void> deleteemp(@PathVariable("id") int id) {
        try {
            this.serviceProviderService.deleteemp(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
	

}
