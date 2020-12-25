package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;

public class GoldPackage extends Handler {

	@Override
	public ArrayList<PackageItems> addPackageItems(PackageCreator packageCreator) {
//		packageCreator.getItemsList().add("IndorDecor");
//		packageCreator.getItemsList().add("Food");
		packageCreator.getItemsList().add(PackageItems.BridalMakeup);
		
		if(packageCreator.getReceivedAmount() <= 200000) {
			System.out.println("Payment received - " + packageCreator.getReceivedAmount());
			System.out.println("For Gold package we have added the below options");
			return packageCreator.getItemsList();
		}else {
			return successor.addPackageItems(packageCreator);
			
		}
	}

}
