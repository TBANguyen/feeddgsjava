package com.stager.feeddgsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "repository")
//@ComponentScan("com.stager.feeddgsjava.repository")
public class FeeddgsjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeeddgsjavaApplication.class, args);
	}

}
