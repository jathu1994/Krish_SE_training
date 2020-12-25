package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;

public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccessor (Handler successor) {
		this.successor = successor;
	}
	
	public abstract ArrayList<PackageItems> addPackageItems(PackageCreator packageCreator);

}
