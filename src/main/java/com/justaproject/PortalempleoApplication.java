package com.justaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //está exclusió se llevarà quan se definisca datasource
@SpringBootApplication
//@ComponentScan("com.justaproject.dao")
public class PortalempleoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalempleoApplication.class, args);
				
	}
}
