package com.bridgelabz.clinicManagement;

import java.util.ArrayList;


public interface Display 
{
	ArrayList<Patient> patientList();
	ArrayList<Doctor> doctorList();
	ArrayList<Appoinment> appoinmentList();
	 void bestDoctorOfClinique();
}
