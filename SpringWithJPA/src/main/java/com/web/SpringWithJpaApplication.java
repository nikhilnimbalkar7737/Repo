package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJpaApplication.class, args);
		System.out.println("Welcome to Spring JPA");
	}

}
