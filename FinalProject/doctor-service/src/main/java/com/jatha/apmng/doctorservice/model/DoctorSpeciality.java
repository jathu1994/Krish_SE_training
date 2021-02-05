package com.jatha.apmng.doctorservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctorspeciality")
public class DoctorSpeciality implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String specialityType;

	public DoctorSpeciality() {
		super();
	}

	public DoctorSpeciality(int id, String specialityType) {
		super();
		this.id = id;
		this.specialityType = specialityType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialityType() {
		return specialityType;
	}

	public void setSpecialityType(String specialityType) {
		this.specialityType = specialityType;
	}

	@Override
	public String toString() {
		return "DoctorSpeciality [id=" + id + ", specialityType=" + specialityType + "]";
	}
	
	
	
	
	
	
	

}
