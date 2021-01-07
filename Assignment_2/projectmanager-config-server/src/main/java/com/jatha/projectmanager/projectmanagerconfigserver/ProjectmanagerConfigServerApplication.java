package com.jatha.projectmanager.projectmanagerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProjectmanagerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectmanagerConfigServerApplication.class, args);
	}

}
