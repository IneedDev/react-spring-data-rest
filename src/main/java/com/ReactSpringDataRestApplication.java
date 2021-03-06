package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class ReactSpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringDataRestApplication.class, args);
	}
}
