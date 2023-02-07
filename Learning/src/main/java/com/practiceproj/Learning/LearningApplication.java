package com.practiceproj.Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class,args);


	}

}
//		ResponseEntity<String> response = callCodatAPI("https://api.codat.io/companies?page=1&pageSize=100");
//		System.out.println(response.getBody());