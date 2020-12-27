package com.jatha.designpatterns.factory;

/** application for demonstrating the factory design pattern */
public class Application {

	public static void main(String[] args) {

		Motorbike motorbike1 = MotorbikeFactory.showSpecification(BikeModels.Apache);
		System.out.println(motorbike1);

		Motorbike motorbike2 = MotorbikeFactory.showSpecification(BikeModels.Duke);
		System.out.println(motorbike2);

		Motorbike motorbike3 = MotorbikeFactory.showSpecification(BikeModels.RoyalEnfiled);
		System.out.println(motorbike3);

	}

}
