package com.jatha.projectmanager.taskservice.service;

import java.util.List;
import java.util.Optional;

import com.jatha.projectmanager.commondao.model.Task;

public interface TaskService {
	
	Task save(Task task);
	List<Task> findAll();
	Optional<Task> findById(String id);

}
