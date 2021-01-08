package com.jatha.projectmanager.taskservice.model;

import com.jatha.projectmanager.commondao.model.Project;
import com.jatha.projectmanager.commondao.model.Task;

public class DetailedResponse implements Response {
	
	Project project;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	Task task;

}
