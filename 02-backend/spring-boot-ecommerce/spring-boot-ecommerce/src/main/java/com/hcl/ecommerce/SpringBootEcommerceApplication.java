package com.hcl.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
@SpringBootApplication


public class SpringBootEcommerceApplication {

	static Logger log = Logger.getLogger(SpringBootEcommerceApplication.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Starting Application");
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

}
