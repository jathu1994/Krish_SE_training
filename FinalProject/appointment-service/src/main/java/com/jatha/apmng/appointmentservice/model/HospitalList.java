package com.jatha.apmng.appointmentservice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HospitalList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Hospital> hospitals;

	
	public HospitalList() {
		hospitals = new ArrayList<Hospital>();
	}


	public HospitalList(List<Hospital> hospitals) {
		super();
		this.hospitals = hospitals;
	}


	public List<Hospital> getHospitals() {
		return hospitals;
	}


	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}


	@Override
	public String toString() {
		return "HospitalList [hospitals=" + hospitals + "]";
	}



	
	
	
   
}
