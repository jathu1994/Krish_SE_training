package com.jatha.projectmanager.projectservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatha.projectmanager.commondao.model.Project;
import com.jatha.projectmanager.projectservice.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project save(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project); 
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public Optional<Project> findById(String id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id);
	}

}
