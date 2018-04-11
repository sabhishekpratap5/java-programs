package com.bridgelabz.clinicManagement;

import java.util.Date;

public class Appoinment 
{
	private Patient patient;
	private Date date;
	private int id;
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Appoinment [Patient=" + patient + ", date=" + date + ", id=" + id + "]";
	}
	
	
}
