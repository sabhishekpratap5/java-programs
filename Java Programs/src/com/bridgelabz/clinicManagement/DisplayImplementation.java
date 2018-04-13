package com.bridgelabz.clinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
public class DisplayImplementation implements Display
{
	ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public void patientList() {
		ArrayList<Patient> patientList = new ArrayList<>();
		Patient patient = new Patient();      
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
			for(int i=0;i<patientList.size();i++)
			{
				patient = patientList.get(i);
				System.out.println(patient);
				System.out.println("---------------------------------------------------------------------------------------------------------");
			}
			reader.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void doctorList() 
	{
		ArrayList<Doctor> doctorList = new ArrayList<>();
		Doctor doctor = new Doctor();
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
			for(int i=0;i<doctorList.size();i++)
			{
				doctor = doctorList.get(i);
				System.out.println(doctor);
				System.out.println("---------------------------------------------------------------------------------------------------------");
			}
			reader.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void appoinmentList()
	{
		ArrayList<Appoinment> appoinmentList = new ArrayList<>();
		Appoinment appoinment = new Appoinment();
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/appoinment.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Appoinment>> type = new TypeReference<ArrayList<Appoinment>>() {};
				appoinmentList = objectMapper.readValue(arrayToJson, type);
				
			}
			for(int i=0;i<appoinmentList.size();i++)
			{
				appoinment = appoinmentList.get(i);
				System.out.println(appoinment);
				System.out.println("---------------------------------------------------------------------------------------------------------");
			}
			reader.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void bestDoctorOfClinique() 
	{
		ArrayList<Doctor> doctorList = new ArrayList<>();
		Doctor doctor = new Doctor();
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
		System.out.println("Popular Doctors are");
		Iterator<Doctor>iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			doctor=(Doctor) iterator.next();
			if(doctor.getNoOfPatients()==5)
			{
				System.out.println(doctor);
			}
			
		}
		
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
