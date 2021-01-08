package com.jatha.projectmanager.taskservice.model;

import com.jatha.projectmanager.commondao.model.Task;

public class SimpleResponse implements Response {

	Task task;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
