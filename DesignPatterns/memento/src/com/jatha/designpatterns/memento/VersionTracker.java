package com.jatha.designpatterns.memento;

import java.util.ArrayList;

public class VersionTracker {

	ArrayList<Project> projectVersions = new ArrayList<Project>();

	public void addProjectVersion(Project m) {
		projectVersions.add(m);
	}

	public Project getVersion(int index) {
		return projectVersions.get(index);
	}

}
