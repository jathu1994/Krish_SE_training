package com.jatha.projectmanager.taskservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jatha.projectmanager.commondao.model.Project;
import com.jatha.projectmanager.commondao.model.Task;
import com.jatha.projectmanager.taskservice.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepository;

	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Task save(Task task) {

		Project project = restTemplate.getForObject("http://project/services/project/" + task.getProjectId(),
				Project.class);

		System.out.println("++++++++++++++++++++++++++++");
		if (project != null) {
			System.out.println(project.getProjectId() + "matched with task project id" + task.getProjectId());
			return taskRepository.save(task);
		} else {
			System.out.println("no records matched with task project id" + task.getProjectId());
			return null;
		}
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public Optional<Task> findById(String id) {
		return taskRepository.findById(id);
	}

}
