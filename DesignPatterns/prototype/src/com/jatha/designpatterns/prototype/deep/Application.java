package com.jatha.designpatterns.prototype.deep;

/**
 * This project for demonstrating Prototype design pattern. This package do it
 * in the deep clone way. Assume that all new employees have same set of RBTs
 * and they are stored in a database.
 */
public class Application {

	public static void main(String Args[]) {

		/*
		 * In this employeeInitilizer object we are initilizing the object of Employee
		 * for the first time and reading RBT from a database
		 */
		Employee employeeInitilizer = new Employee();
		employeeInitilizer.setEmpNo("E******");
		employeeInitilizer.setEmpFirstName("----------");
		employeeInitilizer.loadRBT();

		System.out.println(employeeInitilizer.toString());

		/* create new object from already existing object "cloning" */
		Employee employee1 = null;
		try {
			employee1 = employeeInitilizer.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(System.out);
		}

		employee1.setEmpNo("E000089");
		employee1.setEmpFirstName("Elil");
		System.out.println(employee1.toString());

		System.out.println("----------------------------");

		/*
		 * demonstrate that deep copy doesnt affects all objects created from cloning
		 * since they are not reference of same object
		 */
		employeeInitilizer.getRbts().remove(0);
		System.out.println(employeeInitilizer.toString());
		System.out.println(employee1.toString());

	}

}
