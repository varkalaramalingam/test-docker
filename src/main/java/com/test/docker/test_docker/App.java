package com.test.docker.test_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("Application Started...");
	}
	
	@GetMapping("/msg/{name}")
	public String greetings(@PathVariable("name") String name) {
		return "Hi "+name;
	}
}
