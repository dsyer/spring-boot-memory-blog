package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/greeting")
	public Greeting greeting() {
		return new Greeting("Hello World!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

class Greeting {
	private String message;

	Greeting() {
	}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
