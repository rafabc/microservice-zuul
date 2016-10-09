package com.micro.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.micro.client.dto.Car;


@Component
public class ClientService {

    @Autowired
    private RestTemplate template;
    
    
    private final static String SERVICE_CAR_URL = "http://servicio-car/car/{id}";
	
	
	public Car getCar(String id) {
		
		
		ResponseEntity<Car> response = template.exchange(SERVICE_CAR_URL, HttpMethod.GET, null, new ParameterizedTypeReference<Car>() {}, id);
		return response.getBody();
		
		
		//Car car = template.getForObject(serviceUrl, Car.class);
		//return car;
	}
	
	
	
}
