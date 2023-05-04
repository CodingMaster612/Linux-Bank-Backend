package com.backend.Booster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.backend")
public class BoosterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoosterApplication.class, args);
	}

}
