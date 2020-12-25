package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;

public class PlatinumPackage extends Handler {

	@Override
	public ArrayList<PackageItems> addPackageItems(PackageCreator packageCreator) {
//		packageCreator.getItemsList().add("IndorDecor");
//		packageCreator.getItemsList().add("Food");
//		packageCreator.getItemsList().add("BridalMakeup");
		packageCreator.getItemsList().add(PackageItems.WeddingCar);
		
		if(packageCreator.getReceivedAmount() <= 300000) {
			System.out.println("Payment received - " + packageCreator.getReceivedAmount());
			System.out.println("For Platinum package we have added the below options");
			return packageCreator.getItemsList();
		}else{
//			return successor.addPackageItems(packageCreator);
			System.out.println("Payment received - " + packageCreator.getReceivedAmount());
			System.out.println("You paid a premium amount please talk to Manager "
					+ "\nfor uniquely designed packages to be added with the below list");
			return packageCreator.getItemsList();
			
		}
	}

}
