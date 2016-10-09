package com.micro.admin;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Junit test class
 * @author Rafa
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminDashboardApplicationTests {

	
	@Autowired
	private AdminDashboardApp app;
	
	/**
	 * Test method for context load
	 */
	@Test
	public void contextLoads() {
		assertThat(app).isNotNull();
	}

}
