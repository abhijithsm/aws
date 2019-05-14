package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer implements WebApplicationInitializer, ApplicationRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	}
}
