package com.tsk.customersvcs1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CustomerSvcs1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CustomerSvcs1Application.class, args);
	}
	
	public SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(CustomerSvcs1Application.class);
	}

}
