package com.cni.RACHED;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RachedApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RachedApplication.class, args);
	}
    
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder Builder) {
		
		return Builder.sources(RachedApplication.class);
	}
}
