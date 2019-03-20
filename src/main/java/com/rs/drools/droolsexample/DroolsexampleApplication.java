package com.rs.drools.droolsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DroolsexampleApplication {

	public static void main(String[] args) {
		System.setProperty("drools.dialect.mvel.strict", "false");
		SpringApplication.run(DroolsexampleApplication.class, args);
	}

}
