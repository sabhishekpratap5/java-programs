package com.bridgelabz.clinicManagement;

import java.util.Date;

public class Appoinment 
{
	private Patient patient;
	private String date,doctorNAme;
	
	public String getDoctorNAme() {
		return doctorNAme;
	}
	public void setDoctorNAme(String doctorNAme) {
		this.doctorNAme = doctorNAme;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date2) {
		this.date = date2;
	}
	@Override
	public String toString() {
		return "Appoinment [patient=" + patient + ", date=" + date + ", doctorNAme=" + doctorNAme + "]";
	}
	
	
	
}
