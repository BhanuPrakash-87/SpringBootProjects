package com.example.componentbeandemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComponentbeandemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentbeandemoApplication.class, args);
	}
	
	@Bean
	public Employee getEmployee () {
		return new Employee();
		
	}
}
