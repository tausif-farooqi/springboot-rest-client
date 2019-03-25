package com.springboot.service.springbootrestclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Simple command line rest client to show how to use Feign and Eureka naming service to invoke a
 * Springboot rest service.
 * 
 * @author Tausif Farooqi
 *
 */
@SpringBootApplication
@EnableFeignClients
public class SpringbootRestClientApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(SpringbootRestClientApplication.class);
	
	@Autowired
	private CompanyServiceProxy companyService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// get all companies
		Object result = companyService.getCompanies();
		logger.info("Companies: {}", result);
		
		// get one company
		result = companyService.getOneCompany("AABA");
		logger.info("One company: {}", result);
	}

}
