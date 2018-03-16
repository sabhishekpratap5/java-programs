package com.bridgelab.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClinicUtility 
{
	
	public static void patientDetails() 
	{
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json");
			if(file.exists())
			{
				if(file.canRead() && file.canWrite())
				{
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					Iterator<?> itr = array.iterator();
					
					while (itr.hasNext())
					{
						JSONObject obj = (JSONObject) itr.next();
						
							System.out.println("Name : "+obj.get("Name")+"\tID : "+obj.get("Id")+"\tAge : "+obj.get("Age")+"\tMob: "+obj.get("Mob"));
						
					}
				}
				else
				{
					System.out.println("File can't have read permissions.");
				}
			}
			else
			{
				System.out.println("File does not exits on disk.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
	public static void addPatient() 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json");
			if(file.exists())
			{
				if(file.canRead() && file.canWrite())
				{
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					JSONObject json = new JSONObject();
			        System.out.println("Enter Patient Name:");
			        String name = scan.nextLine();
			        System.out.println("Enter Id No:");
			        String id = scan.nextLine();
			        System.out.println("Enter Mobile number:");
			        String mob = scan.nextLine();
			        System.out.println("Enter age:");
			        String age = scan.nextLine();
			        Iterator<?> itr = array.iterator();
					
					while (itr.hasNext())
					{
						JSONObject obj = (JSONObject) itr.next();
						String key = obj.get("Id").toString();
						if(key.equals(id))
						{
							System.out.println("The id Number "+id+" is already assingn to other patient plz enter different id number");
							System.out.println("Enter Id No:");
							id = scan.nextLine();
						}
						
					}
			        json.put("Name",name);
			        json.put("Id", id);
			        json.put("Mob", mob);
			        json.put("Age", age);
			        
			        array.add(json);
			        System.out.println("Added Successfully.");
			        FileWriter fw = new FileWriter(file);
			        fw.write(JSONArray.toJSONString(array));
			        fw.flush();
			        fw.close();
					
				}
				else
				{
					System.out.println("File can't have read permissions.");
				}
			}
			else
			{
				System.out.println("File does not exits on disk.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
	public static void doctorsDetails() 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Doctor.json");
			if(file.exists())
			{
				if(file.canRead() && file.canWrite())
				{
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					Iterator <?>itr = array.iterator();
					
					while (itr.hasNext())
					{
						JSONObject obj = (JSONObject) itr.next();
						System.out.println("Name : "+obj.get("Name")+"\tID : "+obj.get("Id")+"\tSpecialization : "+obj.get("Specialization")+"\t\tAvailability : "+obj.get("Availability"));
			
					}
				}
				else
				{
					System.out.println("File can't have read permissions.");
				}
			}
			else
			{
				System.out.println("File does not exits on disk.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
	@SuppressWarnings("unchecked")
	public static void addDoctor() 
	{
		try
		{
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Doctor.json");
			if(file.exists())
			{
				
				if(file.canRead() && file.canWrite())
				{
					Scanner scan = new Scanner(System.in);
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					JSONObject json = new JSONObject();
			        System.out.println("Enter Doctor Name:");
			        String name = scan.nextLine();
			        System.out.println("Enter Id No:");
			        String id = scan.nextLine();
			        System.out.println("Enter Specialization:");
			        String specialization = scan.nextLine();
			        System.out.println("Enter Availability:");
			        String availability = scan.nextLine();
			        Iterator<?> itr = array.iterator();
			    	while (itr.hasNext())
					{
						JSONObject obj = (JSONObject) itr.next();
						String key = obj.get("Id").toString();
						if(key.equals(id))
						{
							System.out.println("The id Number "+id+" is already assingn to other Dcotor plz enter different id number");
							System.out.println("Enter Id No:");
							id = scan.nextLine();
						}
						
					}
			        json.put("Name",name);
			        json.put("Id", id);
			        json.put("Specialization", specialization);
			        json.put("Availability", availability);
			        
			        array.add(json);
			        System.out.println("Added Successfully.");
			        FileWriter fw = new FileWriter(file);
			        fw.write(JSONArray.toJSONString(array));
			        fw.flush();
			        fw.close();
				}
			
				else
				{
					System.out.println("File can't read and write");
				}
			}
			else
			{
				System.out.println("File not exits on disk.");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void appointmentDetails() 
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			File file = new File ("/home/bridgeit/abhishek-workspace/Java Programs/src/Doctor.json");
			if(file.exists() && file.exists())
			{
				if(file.canWrite() && file.canRead())
				{
					JSONParser parser = new JSONParser();
					FileReader doctor = new FileReader(file);
					JSONArray docArray = (JSONArray) parser.parse(doctor);
					Iterator<?> iterator = docArray.iterator();
					System.out.println("Enter Doctor id to view appintment");
					String id = scan.next();
					boolean flag = false;
					while (iterator.hasNext())
					{
						JSONObject obj = (JSONObject) iterator.next();
						String id1 = obj.get("Id").toString();
						if(id1.equals(id))
						{
							JSONArray patient1 =(JSONArray) obj.get("Patient");
							Iterator<?> itr = patient1.iterator();
							while(itr.hasNext())
							{
								JSONObject patient = (JSONObject) itr.next();
								System.out.println("Name : "+patient.get("Name")+"\tID : "+patient.get("Id")+ "\tAge : "+patient.get("Age")+"\tMob : "+patient.get("Mob"));
								flag=true;
							}
						}
					}
					if(flag==false)
					{
						System.out.println("Wrong Doctor id...Plz Try again");
					}
				}
				else
				{
					System.out.println("File can not read or write");
				}
			}
			else
			{
				System.out.println("File Not exits in disk.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
