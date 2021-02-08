package com.jatha.apmng.hospitalservice.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctorScedules")
public class DoctorScedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String docRegNo;
	String hosRegNo;
	Date date;
	String session;
	Time epectedArrival;
	String status;//waiting arrived left cancelled
	int currentAppointmentNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocRegNo() {
		return docRegNo;
	}
	public void setDocRegNo(String docRegNo) {
		this.docRegNo = docRegNo;
	}
	public String getHosRegNo() {
		return hosRegNo;
	}
	public void setHosRegNo(String hosRegNo) {
		this.hosRegNo = hosRegNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public Time getEpectedArrival() {
		return epectedArrival;
	}
	public void setEpectedArrival(Time epectedArrival) {
		this.epectedArrival = epectedArrival;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCurrentAppointmentNumber() {
		return currentAppointmentNumber;
	}
	public void setCurrentAppointmentNumber(int currentAppointmentNumber) {
		this.currentAppointmentNumber = currentAppointmentNumber;
	}
	
	
	

}
