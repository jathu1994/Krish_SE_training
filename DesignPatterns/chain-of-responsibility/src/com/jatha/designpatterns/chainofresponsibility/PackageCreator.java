package com.jatha.designpatterns.chainofresponsibility;

import java.util.ArrayList;


public class PackageCreator {
	private double receivedAmount;
	private ArrayList<PackageItems> itemsList = new ArrayList<PackageItems>();
	
	
	

	public PackageCreator(double receivedAmount) {
		super();
		this.receivedAmount = receivedAmount;
	}
	
	public double getReceivedAmount() {
		return receivedAmount;
	}
//	public void setReceivedAmount(double receivedAmount) {
//		this.receivedAmount = receivedAmount;
//	}
	public ArrayList<PackageItems> getItemsList() {
		return itemsList;
	}
//	public void setItemsList(ArrayList<String> itemsList) {
//		this.itemsList = itemsList;
//	}
	
	
	
	

}
