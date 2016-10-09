package com.micro.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Main class
 * @author Rafa
 *
 */
@SpringBootApplication
@EnableWebMvc
@EnableEurekaClient
@Configuration
public class MicroServiceCarApp {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCarApp.class, args);
	}
}
