package com.bridgelabz.clinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


public class AddImplementation implements Add {
	//Scanner scanner = new Scanner(System.in);
	
	ArrayList<Patient> patientList =new ArrayList<>();
	 ArrayList<Doctor> doctorList = new ArrayList<>();
	ArrayList<Appoinment> appoinmentList = new ArrayList<>();
	String patientName,doctorName,doctorSpecialization,doctorAvailability;
	int patientId,patientAge,doctorId;
	long patientContactNumber;
	ObjectMapper objectmapper = new ObjectMapper();
	@Override
	public Patient addPatient() 
	{
		Patient patient = new Patient();
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {};
				patientList = objectmapper.readValue(arrayToJson, type);
				
			}
			reader.close();
	
		System.out.println("Enter patient id: ");
		patientId = SingltonUtility.getInstance().inputInteger();
		patient.setPatientId(patientId);
		System.out.println("Enter patient name: ");
		patientName = SingltonUtility.getInstance().inputString(); 
		patient.setPatientName(patientName);
		System.out.println("Enter patient age: ");
		patientAge = SingltonUtility.getInstance().inputInteger();
		patient.setPatientAge(patientAge);
		System.out.println("Enter patient contact number: ");
		patientContactNumber =  SingltonUtility.getInstance().inputLong();
		patient.setPatientContactNumber(patientContactNumber);
		patientList.add(patient);
		System.out.println(patientList);
		objectmapper.writeValue(file, patientList);
		System.out.println("Patient Added Successfully");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return patient;
	}

	@Override
	public void addDoctor() 
	{
		
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if((arrayToJson = reader.readLine()) != null)
			{
				TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
				doctorList = objectmapper.readValue(arrayToJson, type);
				
			}
			reader.close();
		
		Doctor doctor = new Doctor();
		System.out.println("Enter doctor id: ");
		doctorId =  SingltonUtility.getInstance().inputInteger();
		doctor.setDoctorid(doctorId);
		System.out.println("Enter doctor name: ");
		doctorName =  SingltonUtility.getInstance().inputString();
		doctor.setDoctorName(doctorName);
		System.out.println("Enter doctor Specialization: ");
		doctorSpecialization = SingltonUtility.getInstance().inputString();
		doctor.setDoctorSpecialization(doctorSpecialization);
		System.out.println("Enter doctor Availability (1:AM   2:PM  3:Both) :");
		doctorAvailability = SingltonUtility.getInstance().inputString();
		doctor.setDoctorAvailability(doctorAvailability);
		doctorList.add(doctor);
		System.out.println(doctorList);
		//System.out.println(file);
		objectmapper.writeValue(file, doctorList);
		System.out.println("Doctor Added Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void takeAppoinment() {
		Patient patient = new Patient();
        File appoinmentFile = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/appoinment.json");
        Appoinment appoinment = new Appoinment();
        System.out.println("Enter doctor name to take appoinment ");
        doctorName =SingltonUtility.getInstance().inputString();
        
        System.out.println("Enter the appoinment date: ");
        String date = SingltonUtility.getInstance().inputString();
        appoinment.setDate(date);
        try
        {
            File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/clinicManagement/doctor.json");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String arrayToJson;
            if((arrayToJson = reader.readLine()) != null)
            {
                TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
                doctorList = objectmapper.readValue(arrayToJson, type);
                
            }
            Doctor doctor =new Doctor();
            //System.out.println(doctorList);
            for(int i=0;i<doctorList.size();i++)
            {
                doctor = doctorList.get(i);
                if(doctorName.equals(doctor.getDoctorName()))
                {
                    if(doctor.getNoOfPatients()==0)
                    {
                        patient = addPatient();
                        //System.out.println(patient);
                        doctor.setNoOfPatients(1);    
                        appoinment.setDoctorNAme(doctorName);
                        appoinment.setPatient(patient);
                        appoinmentList.add(appoinment);
                        
                        objectmapper.writeValue(appoinmentFile, appoinmentList);
                    }
                    else if(doctor.getNoOfPatients()>0 && doctor.getNoOfPatients()<5)
                    {
                
                        patient = addPatient();
                        //appoinmentList=appoinment.get(doctor.toString()); 
                        //appointments.remove(doctor.toString());
                        doctor.setNoOfPatients((doctor.getNoOfPatients()+1));
                        appoinment.setPatient(patient);
                        appoinmentList.add(appoinment);
                        objectmapper.writeValue(appoinmentFile, appoinmentList);
                    }
                    else
                    {
                        System.out.println("Doctor with name="+doctorName+" is Not Available");
                    }
                }
            
        }
        
    }catch(IOException e)
        {
        e.printStackTrace();
        }
	}

}
