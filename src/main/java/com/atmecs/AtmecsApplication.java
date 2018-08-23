package com.atmecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.atmecs")
public class AtmecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmecsApplication.class, args);
	}
}
