package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoV0Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoV0Application.class, args);
	}

}
