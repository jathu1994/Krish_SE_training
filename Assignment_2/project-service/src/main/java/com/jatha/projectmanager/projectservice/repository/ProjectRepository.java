package com.jatha.projectmanager.projectservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatha.projectmanager.commondao.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,String> {

}
