package com.bridgelabz.clinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class SearchImplementation implements Search
{
	
	int mChoice=0;
	Doctor doctor = new Doctor();
	Patient patient = new Patient();
	AddImplementation addImplementation = new AddImplementation();
	ArrayList<Patient> patientList =new ArrayList<>();
	 ArrayList<Doctor> doctorList = new ArrayList<>();
	 ObjectMapper objectMapper = new ObjectMapper();
	public void searchPatient()
	{
		do
		{
		System.out.println("1 Search Patient by Name");
		System.out.println("2 Search Patient by Id");
		System.out.println("3 Search Patient by Contact Number");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		 mChoice = SingltonUtility.getInstance().inputInteger();
		switch (mChoice) 
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
		}while(mChoice > 0);
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
		 mChoice = SingltonUtility.getInstance().inputInteger();
		switch (mChoice) 
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
		}while(mChoice > 0);
	}


	@Override
	public void searchPatientByName() 
	{
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {};
				patientList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the patient name to search patient: ");
		String patientName = SingltonUtility.getInstance().inputString();
		
		for(int i=0; i <patientList.size();i++)
		{
			patient = patientList.get(i);
			if(patientName.equals(patient.getPatientName()))
			{
				System.out.println(patient);
				break;
			}
			else {
				System.out.println("No patient avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
		
	}

	@Override
	public void searchPatientByContactNo() {
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {};
				patientList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the patient ContactNo to search patient: ");
		long patientContactNo = SingltonUtility.getInstance().inputLong();
		
		for(int i=0; i <patientList.size();i++)
		{
			patient = patientList.get(i);
			if(patientContactNo==(patient.getPatientContactNumber()))
			{
				System.out.println(patient);
				break;
			}
			else {
				System.out.println("No patient avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	

		
		
	}

	@Override
	public void searchPatientById() {
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {};
				patientList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the patient id to search patient: ");
		int patientId = SingltonUtility.getInstance().inputInteger();
		
		for(int i=0; i <patientList.size();i++)
		{
			patient = patientList.get(i);
			if(patientId==(patient.getPatientId()))
			{
				System.out.println(patient);
				break;
			}
			else {
				System.out.println("No patient avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	

		
		
		
	}
	
	@Override
	public void searchDoctorByName() 
	{	
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the doctor name to search doctor: ");
		String doctorName = SingltonUtility.getInstance().inputString();
		for(int i=0; i <doctorList.size();i++)
		{
			doctor = doctorList.get(i);
			if(doctorName.equals(doctor.getDoctorName()))
			{
				System.out.println(doctor);
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}

	@Override
	public void searchDoctorById() {
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the doctor id to search doctor: ");
		int doctorId = SingltonUtility.getInstance().inputInteger();
		for(int i=0; i <doctorList.size();i++)
		{
			doctor = doctorList.get(i);
			if(doctorId==(doctor.getDoctorid()))
			{
				System.out.println(doctor);
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
		
	
	

	@Override
	public void searchDoctorBySpecialization() {
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the doctor Specialization to search doctor: ");
		String doctorSpecialization = SingltonUtility.getInstance().inputString();
		for(int i=0; i <doctorList.size();i++)
		{
			doctor = doctorList.get(i);
			if(doctorSpecialization.equals(doctor.getDoctorSpecialization()))
			{
				System.out.println(doctor);
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
	
	
	

	@Override
	public void searchDoctorByAvailability() {
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectMapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		System.out.println("Enter the doctor Availability time to search doctor: ");
		String doctorAvailability = SingltonUtility.getInstance().inputString();
		
		for(int i=0; i <doctorList.size();i++)
		{
			doctor = doctorList.get(i);
			if(doctorAvailability.equals(doctor.getDoctorAvailability()))
			{
				System.out.println(doctor);
				break;
			}
			else {
				System.out.println("No doctor avilable.");
			}

		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	
	}
		
		
	

}
