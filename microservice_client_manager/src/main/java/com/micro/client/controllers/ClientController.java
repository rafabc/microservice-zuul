package com.micro.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.client.dto.Car;
import com.micro.client.services.ClientService;


@RestController
@EnableDiscoveryClient
public class ClientController {
	
	
	@Autowired
	private ClientService service;
	
	
	
	@RequestMapping("/")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping(value = "/cliente-car/{id}", method = RequestMethod.GET, produces = "application/json") 
	public Car getCar(@PathVariable String id) {
		
		return service.getCar(id);
	}
	

}
