package com.jatha.designpatterns.factory;

public class MotorbikeFactory {

	public static Motorbike showSpecification(BikeModels bikeModel) {
		switch (bikeModel) {
		case Apache:
			return new Apache();
		case Duke:
			return new Duke();
		case RoyalEnfiled:
			return new RoyalEnfield();
		default:
			return null;
		}
	}
}
