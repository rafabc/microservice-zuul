package com.micro.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulApp.class, args);
	}
}
