package com.bridgelabz.clinicManagement;

import java.util.ArrayList;



public interface Search
{
	public ArrayList<Patient> searchPatientByName();
	public ArrayList<Patient> searchPatientByContactNo();
	public ArrayList<Patient> searchPatientById();
	public ArrayList<Doctor> searchDoctorByName();
	public ArrayList<Doctor> searchDoctorById();
	public ArrayList<Doctor> searchDoctorBySpecialization();
	public ArrayList<Doctor> searchDoctorByAvailability();

}
