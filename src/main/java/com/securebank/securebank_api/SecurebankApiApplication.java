package com.securebank.securebank_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SecurebankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurebankApiApplication.class, args);
	}

}