package com.micro.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.micro.client.controllers.ClientController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceClientManagerApplicationTests {

	@Autowired
	private ClientController clientController;
	
	@Test
	public void contextLoads() {
		assertThat(clientController).isNotNull();
	}

}
