package com.employee.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		System.out.println("Application Started!");//test
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
