package com.bridgelabz.clinicManagement;

public class Doctor 
{
	private int doctorid;
	private String doctorName,doctorAvailability,doctorSpecialization;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAvailability() {
		return doctorAvailability;
	}
	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", doctorName=" + doctorName + ", doctorAvailability="
				+ doctorAvailability + ", doctorSpecialization=" + doctorSpecialization + "]";
	}
	
	
}
