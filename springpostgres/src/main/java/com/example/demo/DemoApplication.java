package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

//TODO: FIGURE OUT MAVEN EMAILSENDER DEPENDENCY ISSUE
//TODO: IT THROWS THIS ERROR "Parameter 0 of constructor in com.example.demo.email.EmailService required a bean of type 'org.springframework.mail.javamail.JavaMailSender' that could not be found.||||Consider defining a bean of type 'org.springframework.mail.javamail.JavaMailSender' in your configuration."
