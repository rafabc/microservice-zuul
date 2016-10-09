package com.micro.car;

import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.micro.car.controllers.CarController;
import com.netflix.discovery.EurekaClient;

/**
 * JUnit test class
 * @author Rafa
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceCarApplicationTests {
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private CarController carController;

	/**
	 * Test for context
	 */
	@Test
	public void contextLoads() {
		assertThat(carController).isNotNull();
	}
	
	@Test
	public void serviceIsEureka() {
		assertTrue("eurekaClient is wrong type: " + eurekaClient, eurekaClient instanceof EurekaClient);
	}

}
