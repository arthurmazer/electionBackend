package com.mazer.election;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {HomeController.class, LoginController.class})
public class ElectionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectionProjectApplication.class, args);
	}

}
