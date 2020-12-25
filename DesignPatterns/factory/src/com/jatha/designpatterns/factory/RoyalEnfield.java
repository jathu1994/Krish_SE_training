package com.jatha.designpatterns.factory;

public class RoyalEnfield extends Motorbike {
	
	public RoyalEnfield() {
		setModel();
		setMake();
		setCC();
		setABS();
		setBulecore();
	}

	@Override
	protected void setModel() {
		// TODO Auto-generated method stub
		super.model = "RoyalEnfield 390";
		
	}

	@Override
	protected void setMake() {
		// TODO Auto-generated method stub
		super.make = "Royal Motors";
		
	}

	@Override
	protected void setCC() {
		// TODO Auto-generated method stub
		super.CC = 600;
		
	}

	@Override
	protected void setABS() {
		// TODO Auto-generated method stub
		super.isABS = true;
	}

	@Override
	protected void setBulecore() {
		// TODO Auto-generated method stub
		super.isBulecore = false;
		
	}

	@Override
	public String toString() {
		return "RoyalEnfield [model=" + model + ", make=" + make + ", CC=" + CC + ", isABS=" + isABS + ", isBulecore="
				+ isBulecore + "]";
	}
	
	

}
