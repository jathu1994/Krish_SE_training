package com.jatha.projectmanager.projectmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = "com.jatha.projectmanager.commondao.model")
public class ProjectManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementServiceApplication.class, args);
	}

}
