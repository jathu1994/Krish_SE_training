package com.jatha.designpatterns.memento;

public class Project {
	private String versionId;
	private String documentText;

	public Project(String versionId, String documentText) {
		this.versionId = versionId;
		this.documentText = documentText;
	}

	public Project getCurrentProject() {
		return this;
	}

	@Override
	public String toString() {
		return "Project [versionId=" + versionId + ", documentText=" + documentText + "]";
	}

}
