package com.stager.feeddgsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FeeddgsjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeeddgsjavaApplication.class, args);
	}

}
