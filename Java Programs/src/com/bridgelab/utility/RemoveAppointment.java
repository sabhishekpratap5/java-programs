package com.bridgelab.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RemoveAppointment 
{
	public static void main(String args[]) throws IOException, ParseException
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
					System.out.println("Enter Doctor id to remove appointment");
					String id = scan.next();
					boolean flag = false;
					while (iterator.hasNext())
					{
						JSONObject obj = (JSONObject) iterator.next();
						String id1 = obj.get("Id").toString();
						if(id1.equals(id))
						{	
							System.out.println("Enter patient id to remove appointment ");
							JSONArray patient1 =(JSONArray) obj.get("Patient");
							Iterator<?> itr = patient1.iterator();
							while(itr.hasNext())
							{
								String pid = scan.nextLine();
								JSONObject patient = (JSONObject) itr.next();
								String patientid = patient.get("Id").toString();
								if(pid.equals(patientid))
								{
									patient1.remove(patient);
								}
								flag=true;
								FileWriter fw = new FileWriter(file);
								fw.write(JSONValue.toJSONString(docArray));
								fw.flush();
								fw.close();
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
			scan.close();
	}
}
