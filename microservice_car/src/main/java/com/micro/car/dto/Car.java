package com.micro.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	
	
	private String idCar;
	private String manufacturer;
	private String model;
	private String color;
	private String year;
	private String hp;
	
	
}
