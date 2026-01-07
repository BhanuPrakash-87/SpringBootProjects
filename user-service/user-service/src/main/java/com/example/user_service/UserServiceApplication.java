package com.example.user_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	public static final String USER_SERVICE="userService";

    private static final String BASEURL = "http://localhost:9191/orders";

    private int attempt=1;
    
    

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
