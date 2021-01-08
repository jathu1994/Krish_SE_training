package com.jatha.projectmanager.taskservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.projectmanager.commondao.model.Task;
import com.jatha.projectmanager.taskservice.service.TaskServiceImpl;

@RestController
@RequestMapping(value = "/services")
public class TaskController {
	
	@Autowired 
	TaskServiceImpl taskServiceImpl;
	
	
	@RequestMapping(value = "/task",method = RequestMethod.POST)
	public Task save(@RequestBody Task task) {
		
		
		return taskServiceImpl.save(task);
		
	}
	
	@RequestMapping(value = "/task",method = RequestMethod.GET)
	public List<Task> findAll() {
		
		return taskServiceImpl.findAll();
		
	}
	
	@RequestMapping(value = "/task/{id}",method = RequestMethod.GET)
	public Optional<Task> findById(@PathVariable(value="id") String id) {
		
		return taskServiceImpl.findById(id);
		
	}

}
