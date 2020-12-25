package com.jatha.designpatterns.factory;

public class Apache extends Motorbike {
	
	public Apache() {
		setModel();
		setMake();
		setCC();
		setABS();
		setBulecore();
	}

	@Override
	protected void setModel() {
		// TODO Auto-generated method stub
		super.model = "Apache RTR";
		
	}

	@Override
	protected void setMake() {
		// TODO Auto-generated method stub
		super.make = "TVS";
		
	}

	@Override
	protected void setCC() {
		// TODO Auto-generated method stub
		super.CC = 200;
		
	}

	@Override
	protected void setABS() {
		// TODO Auto-generated method stub
		super.isABS = true;
	}

	@Override
	protected void setBulecore() {
		// TODO Auto-generated method stub
		super.isBulecore = true;
		
	}

	@Override
	public String toString() {
		return "Apache [model=" + model + ", make=" + make + ", CC=" + CC + ", isABS=" + isABS + ", isBulecore="
				+ isBulecore + "]";
	}
	
	
	

}
