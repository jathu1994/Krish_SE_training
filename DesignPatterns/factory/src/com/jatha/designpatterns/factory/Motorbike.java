package com.jatha.designpatterns.factory;

public abstract class Motorbike {
	protected String model;
	protected String make;
	protected int CC;
	protected boolean isABS;
	protected boolean isBulecore;
	
	protected abstract void setModel();
	protected abstract void setMake();
	protected abstract void setCC();
	protected abstract void setABS();
	protected abstract void setBulecore();
	
	
	@Override
	public String toString() {
		return "Motorbike [model=" + model + ", make=" + make + ", CC=" + CC + ", isABS=" + isABS + ", isBulecore="
				+ isBulecore + "]";
	}
	
	
	
	

}
