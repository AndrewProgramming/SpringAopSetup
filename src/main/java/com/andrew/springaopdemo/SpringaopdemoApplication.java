package com.andrew.springaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.andrew")
@SpringBootApplication
public class SpringaopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaopdemoApplication.class, args);
	}
}
