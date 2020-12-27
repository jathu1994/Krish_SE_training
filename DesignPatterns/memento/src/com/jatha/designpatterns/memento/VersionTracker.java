package com.jatha.designpatterns.memento;

import java.util.ArrayList;

public class VersionTracker {
	
	/*
	 * Array list was choose since we need an index based access as well as undo
	 * feature which will get data only from top of the array list
	 */
	ArrayList<Project> projectVersions = new ArrayList<Project>();

	public void addProjectVersion(Project m) {
		projectVersions.add(m);
	}

	public Project getVersion(int index) {
		return projectVersions.get(index);
	}

}
