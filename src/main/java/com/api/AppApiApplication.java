package com.api;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(AppApiApplication.class, args);
		SpringApplication app = new SpringApplication(AppApiApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
		app.run(args);
	}
}
