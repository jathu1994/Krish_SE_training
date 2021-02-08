package com.jatha.apmng.doctorservice.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor implements Serializable {

	@Id
	String regNo;
	
	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "typeId", referencedColumnName = "id")
	private DoctorSpeciality doctorSpeciality;

	public Doctor() {
		super();
	}

	public Doctor(int id, String regNo, String firstName, String lastName, String phoneNumber, String email,
			String address, DoctorSpeciality doctorSpeciality) {
		super();
		this.regNo = regNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.doctorSpeciality = doctorSpeciality;
	}


	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DoctorSpeciality getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(DoctorSpeciality doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	@Override
	public String toString() {
		return "Doctor [regNo=" + regNo + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", address=" + address + ", doctorSpeciality=" + doctorSpeciality
				+ "]";
	}
	
	
	

}
