package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;

public class SilverPackage extends Handler {

	@Override
	public ArrayList<PackageItems> addPackageItems(PackageCreator packageCreator) {
		
		packageCreator.getItemsList().add(PackageItems.IndorDecor);
		packageCreator.getItemsList().add(PackageItems.FoodandBeverages);
		
		if(packageCreator.getReceivedAmount() <= 50000) {
			System.out.println("Payment received - " + packageCreator.getReceivedAmount());
			System.out.println("No packages available below 50000");
			
			return null;
			
		}
		else if(packageCreator.getReceivedAmount() > 50000 && packageCreator.getReceivedAmount() < 100000) {
			System.out.println("Payment received - " + packageCreator.getReceivedAmount());
			System.out.println("For Silver package we have added the below options");
			return packageCreator.getItemsList();
		}
		else {
			return successor.addPackageItems(packageCreator);
			
		}
	}

}
