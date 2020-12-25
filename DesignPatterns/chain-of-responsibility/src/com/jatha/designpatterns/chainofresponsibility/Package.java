package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;

public class Package extends Handler {

	@Override
	public ArrayList<PackageItems> addPackageItems(PackageCreator packageCreator) {
		return successor.addPackageItems(packageCreator);
	}

}
