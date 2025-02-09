package com.example.springbootbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBaseApplication.class, args);
	}

}
