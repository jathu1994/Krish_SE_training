package com.jatha.designpatterns.memento;

public class ProjectManager {

	private String versionId;
	private String documentText;
	private Project project;

	public void set(String versionId, String documentText) {
		this.versionId = versionId;
		this.documentText = documentText;
	}

	public Project createProject() {
		project = new Project(versionId, documentText);
		return project;
	}

	public Project getWorkingSet() {
		return project.getCurrentProject();
	}

	public void restoreFromPreviousVersion(Project project) {
		this.project = project;
	}
}
