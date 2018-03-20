package com.bridgelab.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class Appointment {

	/**
	 * 
	 */
	public void fixAppointment() {
		try {

			Scanner scanner = new Scanner(System.in);
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Doctor.json");
			File file1 = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json");
			if (file.exists() && file.exists()) {
				if (file.canWrite() && file.canRead() && file1.canWrite() && file1.canRead()) {
					JSONParser parser = new JSONParser();
					FileReader doctor = new FileReader(file);
					JSONArray docArray = (JSONArray) parser.parse(doctor);

					FileReader patient = new FileReader(file1);
					JSONArray patArray = (JSONArray) parser.parse(patient);

					Iterator<?> iterator = patArray.iterator();
					System.out.println("Enter the Patient id to get appointment");
					String pid = scanner.nextLine();
					boolean flag = false;
					while (iterator.hasNext()) {
						JSONObject object = (JSONObject) iterator.next();
						String key = object.get("Id").toString();
						if (pid.equals(key)) {
							System.out.println("Enter the doctor id to assign patient");
							String did = scanner.nextLine();
							Iterator<?> iterator1 = docArray.iterator();

							while (iterator1.hasNext()) {
								JSONObject object1 = (JSONObject) iterator1.next();
								String key1 = object1.get("Id").toString();
								if (key1.equals(did)) {
									JSONArray arr = (JSONArray) object1.get("Patient");

									if (arr.size() == 2) {
										System.out.println("Doctor appointment is full ... Take appointment next day.");
										break;
									} else {
										arr.add(object);
										FileWriter write = new FileWriter(file);
										write.write(JSONValue.toJSONString(docArray));
										write.flush();
										write.close();
										flag = true;
										break;
									}
								}
							}
							break;
						}
					}
					if (flag == false) {
						System.out.println("Wrong user id");
					}
				} else {
					System.out.println("File can not read or write");
				}
			} else {
				System.out.println("File Not exits in disk.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
