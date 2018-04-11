package com.bridgelabz.clinicManagement;

import java.util.List;


public interface Display 
{
	List<Patient> patientList();
	List<Doctor> doctorList();
	List<Appoinment> appoinmentList();
	public void bestDoctorOfClinique();
}
