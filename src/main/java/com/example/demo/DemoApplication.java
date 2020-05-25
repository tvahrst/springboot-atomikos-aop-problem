package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean(name = "dataSourceInitializerPostProcessor")
	public String workaround() {
		return "Bean named 'dataSourceInitializerPostProcessor' blocks creation of DataSourceInitializerPostProcessor";
	}
}
