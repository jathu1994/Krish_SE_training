package com.jatha.designpatterns.factory;

/**
 * This factory class deliver the specification of each motor-bike models as per
 * the user request
 */
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
