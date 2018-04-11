package com.bridgelabz.clinicManagement;

import java.util.ArrayList;
import java.util.Scanner;



public class AddImplementation implements Add {
	Scanner scanner = new Scanner(System.in);
	Patient patient = new Patient();
	Doctor doctor = new Doctor();
	ArrayList<Patient> patientList =new ArrayList<>();
	ArrayList<Doctor> doctorList = new ArrayList<>();
	ArrayList<Appoinment> appoinmentList = new ArrayList<>();
	String patientName,doctorName,doctorSpecialization,doctorAvailability;
	int patientId,patientAge,doctorId;
	long patientContactNumber;
	@Override
	public void addPatient() 
	{
		System.out.println("Enter patient id: ");
		patientId = scanner.nextInt();
		patient.setPatientId(patientId);
		System.out.println("Enter patient name: ");
		patientName = scanner.next();
		patient.setPatientName(patientName);
		System.out.println("Enter patient age: ");
		patientAge = scanner.nextInt();
		patient.setPatientAge(patientAge);
		System.out.println("Enter patient contact number: ");
		patientContactNumber = scanner.nextLong();
		patient.setPatientContactNumber(patientContactNumber);
		patientList.add(patient);
		System.out.println(patientList);
	}

	@Override
	public void addDoctor() 
	{
		System.out.println("Enter doctor id: ");
		doctorId = scanner.nextInt();
		doctor.setDoctorid(doctorId);
		System.out.println("Enter doctor name: ");
		doctorName = scanner.next();
		doctor.setDoctorName(doctorName);
		System.out.println("Enter doctor Specialization: ");
		doctorSpecialization = scanner.next();
		doctor.setDoctorSpecialization(doctorSpecialization);
		System.out.println("Enter doctor Availability (1:AM   2:PM  3:Both) :");
		doctorAvailability = scanner.next();
		doctor.setDoctorAvailability(doctorAvailability);
		doctorList.add(doctor);
		System.out.println(doctorList);
	}

	@Override
	public void takeAppoinment() {

	}

}
