package com.bridgelabz.clinicManagement;

public class Patient 
{
	private String patientName;
	private int patientId,patientAge;
	private long patientContactNumber;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public long getPatientContactNumber() {
		return patientContactNumber;
	}
	public void setPatientContactNumber(long patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", patientAge=" + patientAge
				+ ", patientContactNumber=" + patientContactNumber + "]";
	}
	
}
