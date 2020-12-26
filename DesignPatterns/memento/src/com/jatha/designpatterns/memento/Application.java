package com.jatha.designpatterns.memento;

public class Application {

	public static void main(String[] args) {
		
		ProjectManager projectManager = new ProjectManager();
		VersionTracker versionTracker = new VersionTracker();
		
		projectManager.set("001", "Jatha");
		versionTracker.addProjectVersion(projectManager.createProject());
		System.out.println(versionTracker.getVersion(0));
		
		
		projectManager.set("002", "Jatha is an");
		versionTracker.addProjectVersion(projectManager.createProject());
		System.out.println(versionTracker.getVersion(1));
		
		projectManager.set("003", "Jatha is an Engineer");
		versionTracker.addProjectVersion(projectManager.createProject());
		System.out.println(versionTracker.getVersion(2));
	
		
		System.out.println(projectManager.getWorkingSet());
		
		System.out.println("-------------------");
		
		
		projectManager.restoreFromPreviousVersion(versionTracker.getVersion(1));
		System.out.println(projectManager.getWorkingSet());

	}

}
