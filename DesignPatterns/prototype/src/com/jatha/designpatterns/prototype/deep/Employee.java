package com.jatha.designpatterns.prototype.deep;

import java.util.ArrayList;

public class Employee implements Cloneable {

	private String empNo;
	private String empFirstName;
	ArrayList<RBT> rbts = new ArrayList<RBT>();

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public ArrayList<RBT> getRbts() {
		return rbts;
	}

	public void setRbts(ArrayList<RBT> rbts) {
		this.rbts = rbts;
	}

	/*
	 * this method is for getting rbt detils from a company database. this is common
	 * for all new employees. so creating an employee object is costly since every
	 * time it has to connect and get RBT details from database. instead of this
	 * costly operation it was decided to use Prototype pattern to get RBT details
	 * to all employees
	 */

	/*
	 * here for demonstration purpose assume that these RBT details are flowing from
	 * Database
	 */

	public void loadRBT() {

		RBT rbt = new RBT();
		rbt.setRBTId("RBT0001");
		rbt.setRBTName("GIP fundementals");

		RBT rbt2 = new RBT();
		rbt2.setRBTId("RBT0002");
		rbt2.setRBTName("Virtusa POSH");

		RBT rbt3 = new RBT();
		rbt3.setRBTId("RBT0003");
		rbt3.setRBTName("Virtusa EHS");

		rbts.add(rbt);
		rbts.add(rbt2);
		rbts.add(rbt3);

	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empFirstName=" + empFirstName + ", rbts=" + rbts + "]";
	}

	/*
	 * in deep cloning we are copying all RBTs from the initilized object to the
	 * object which is cloned. so now it is a complete seperate object of employee
	 */
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee emp = new Employee();

		for (RBT rbt : this.getRbts()) {

			emp.getRbts().add(rbt);

		}
		return emp;
	}

}
