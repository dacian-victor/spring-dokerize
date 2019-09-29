package com.docker.dokerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DokerizeApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to a Spring Dockerize App!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DokerizeApplication.class, args);
	}

}
