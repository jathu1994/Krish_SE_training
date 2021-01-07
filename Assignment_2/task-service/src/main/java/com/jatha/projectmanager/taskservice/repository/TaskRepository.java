package com.jatha.projectmanager.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jatha.projectmanager.commondao.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,String> {

}
