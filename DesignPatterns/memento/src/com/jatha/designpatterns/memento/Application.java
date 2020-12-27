package com.jatha.designpatterns.memento;

/**
 * This application developed for assignment. We can store different versions of
 * our text edits into an Array list and can restore in case needed
 */
public class Application {

	public static void main(String[] args) {

		ProjectManager projectManager = new ProjectManager();
		VersionTracker versionTracker = new VersionTracker();
		int versionCounter = 0;

		/* create project and add to version tracker */
		projectManager.set("001", "Jatha");
		versionTracker.addProjectVersion(projectManager.createProject());
		/* to demonstarte a project was stored in the versionTracker */
		System.out.println(versionTracker.getVersion(0));
		versionCounter++;

		projectManager.set("002", "Jatha is an");
		versionTracker.addProjectVersion(projectManager.createProject());
		System.out.println(versionTracker.getVersion(1));
		versionCounter++;

		projectManager.set("003", "Jatha is an Engineer");
		versionTracker.addProjectVersion(projectManager.createProject());
		System.out.println(versionTracker.getVersion(2));
		versionCounter++;

		/*
		 * check and demonstrate the current working set has been changed to latest
		 * version
		 */
		System.out.println(projectManager.getWorkingSet());

		System.out.println("-------------------");

		/*
		 * demonstrate that we can retrieve older versions from versionTracker and
		 * restore when ever needed
		 */
		projectManager.restoreFromPreviousVersion(versionTracker.getVersion(1));
		System.out.println(projectManager.getWorkingSet());
		

	}

}
