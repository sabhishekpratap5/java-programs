package com.bridgelabz.clinicManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class SearchImplementation implements Search
{
	Scanner scanner = new Scanner(System.in);
	int lChoice=0;
	public void searchPatient()
	{
		do
		{
		System.out.println("1 Search Patient by Name");
		System.out.println("2 Search Patient by Id");
		System.out.println("3 Search Patient by Contact Number");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		 lChoice = scanner.nextInt();
		switch (lChoice) 
		{
		case 1:
			searchPatientByName();			
			break;
		case 2:
			searchPatientById();			
			break;
		case 3:
			searchPatientByContactNo();		
			break;
		case 4:
			break;
		default:
			System.out.println("Invalid choice");
		}
		}while(lChoice > 0);
	}
	
	public void searchDoctor()
	{
		do
		{
		System.out.println("1 Search Doctor by Name");
		System.out.println("2 Search Doctor by Id");
		System.out.println("3 Search Doctor by Specialization");
		System.out.println("4 Search Doctor by Availability");
		System.out.println("5 Exit");
		System.out.println("Enter your choice:");
		 lChoice = scanner.nextInt();
		switch (lChoice) 
		{
		case 1:
			searchDoctorByName();
			break;
		case 2:
			searchDoctorById();			
			break;
		case 3:
			searchDoctorBySpecialization();	
			break;
		case 4:
			searchDoctorByAvailability();
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice");
		}
		}while(lChoice > 0);
	}


	@Override
	public ArrayList<Patient> searchPatientByName() 
	{
		
		return null;
	}

	@Override
	public ArrayList<Patient> searchPatientByContactNo() {
		
		return null;
	}

	@Override
	public ArrayList<Patient> searchPatientById() {
		
		return null;
	}
	
	@Override
	public ArrayList<Doctor> searchDoctorByName() {
		
		return null;
	}

	@Override
	public ArrayList<Doctor> searchDoctorById() {
		
		return null;
	}

	@Override
	public ArrayList<Doctor> searchDoctorBySpecialization() {
	
		return null;
	}

	@Override
	public ArrayList<Doctor> searchDoctorByAvailability() {
		
		return null;
	}

}
