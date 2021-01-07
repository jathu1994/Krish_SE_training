package com.jatha.projectmanager.projectservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.projectmanager.commondao.model.Project;
import com.jatha.projectmanager.projectservice.service.ProjectServiceImpl;

@RestController
@RequestMapping(value = "/services")
public class ProjectController {
	
	@Autowired 
	ProjectServiceImpl projectServiceImpl;
	
	
	@RequestMapping(value = "/project",method = RequestMethod.POST)
	public Project save(@RequestBody Project project) {
		
		return projectServiceImpl.save(project);
		
	}
	
	@RequestMapping(value = "/project",method = RequestMethod.GET)
	public List<Project> findAll() {
		
		return projectServiceImpl.findAll();
		
	}
	
	@RequestMapping(value = "/project/{id}",method = RequestMethod.GET)
	public Optional<Project> findById(@PathVariable(value="id") String id) {
		
		return projectServiceImpl.findById(id);
		
	}

}
