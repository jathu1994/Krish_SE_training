package com.jatha.projectmanager.projectmanagementservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jatha.projectmanager.commondao.model.Project;
import com.jatha.projectmanager.commondao.model.Task;

@RestController
@RequestMapping(value = "/services")
public class ProjectManagementController {

	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/project", method = RequestMethod.POST)
	public Project saveProject(@RequestBody Project projectFromRequest) {
		Project project = restTemplate.postForObject("http://project/services/project/", projectFromRequest,
				Project.class);
		return project;

	}

	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public List<Project> findAllProjects() {

		ResponseEntity<Project[]> response = restTemplate.getForEntity("http://project/services/project/",
				Project[].class);
		Project[] projects = response.getBody();
		List<Project> list = Arrays.asList(projects);
		return list;

	}

	@RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
	public Project findProjectById(@PathVariable(value = "id") String id) {
		Project project = restTemplate.getForObject("http://project/services/project/" + id, Project.class);
		return project;

	}

	@RequestMapping(value = "/task", method = RequestMethod.POST)
	public Task saveTask(@RequestBody Task taskFromRequest) {
		Task task = restTemplate.postForObject("http://task/services/task/", taskFromRequest, Task.class);
		return task;

	}

	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public List<Task> findAllTask() {
		ResponseEntity<Task[]> response = restTemplate.getForEntity("http://task/services/task/", Task[].class);
		Task[] tasks = response.getBody();
		List<Task> list = Arrays.asList(tasks);
		return list;

	}

	@RequestMapping(value = "/task/{id}", method = RequestMethod.GET)
	public Task findTaskById(@PathVariable(value = "id") String id) {
		Task task = restTemplate.getForObject("http://task/services/task/" + id, Task.class);
		return task;

	}

}
