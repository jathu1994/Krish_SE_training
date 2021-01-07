package com.jatha.projectmanager.projectservice.service;

import java.util.List;
import java.util.Optional;

import com.jatha.projectmanager.commondao.model.Project;

public interface ProjectService {
	
	Project save(Project project);
	List<Project> findAll();
	Optional<Project> findById(String id);
	

}
