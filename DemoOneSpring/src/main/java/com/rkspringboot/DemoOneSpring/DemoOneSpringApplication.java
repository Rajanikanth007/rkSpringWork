package com.rkspringboot.DemoOneSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOneSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOneSpringApplication.class, args);
		System.out.println("My first simple spring boot program.");
	}

}
