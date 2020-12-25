package com.jatha.designpatterns.factory;

public class Duke extends Motorbike {
	
	public Duke() {
		setModel();
		setMake();
		setCC();
		setABS();
		setBulecore();
	}

	@Override
	protected void setModel() {
		// TODO Auto-generated method stub
		super.model = "Duke";
		
	}

	@Override
	protected void setMake() {
		// TODO Auto-generated method stub
		super.make = "KTM";
		
	}

	@Override
	protected void setCC() {
		// TODO Auto-generated method stub
		super.CC = 220;
		
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
		return "Duke [model=" + model + ", make=" + make + ", CC=" + CC + ", isABS=" + isABS + ", isBulecore="
				+ isBulecore + "]";
	}
	
	

}
