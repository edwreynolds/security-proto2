package com.epr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Prototype app using Spring Security to force login to page localhost:8099/secured/home
 * but not require authentication to reach default page localhost:8099
 * 
 * Use: Spring Boot(2.13), WebMVC, Security, JPA, Lombok, MySQL, Java 8
 * 
 * MySQL db is used to hold user credentials and roles
 * 
 * @author epr12
 *
 */
@SpringBootApplication
public class SecurityProto2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurityProto2Application.class, args);
	}

}
