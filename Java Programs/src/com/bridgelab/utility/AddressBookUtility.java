package com.bridgelab.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBookUtility {

	public void editDetails() {
		try {
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/AddressBook.json");
			if (file.exists()) {
				if (file.canRead() && file.canWrite()) {
					Scanner scan = new Scanner(System.in);
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					Iterator<?> itr = array.iterator();
					System.out.println("Enter the person name to edit details");
					String name = scan.nextLine();
					boolean flag = false;
					while (itr.hasNext()) {
						JSONObject obj = (JSONObject) itr.next();
						if (obj.get("Firstname").equals(name)) {
							System.out.println("What you want to edit");
							String edit = scan.nextLine();
							System.out.println("Enter the new " + edit + " to update.");
							String change = scan.nextLine();
							obj.remove(edit);
							obj.put(edit, change);
							System.out.println("Edited Successfully.");
							flag = true;
							break;
						}
					}
					if (flag == false) {
						System.out.println("Person not found");
					}
					FileWriter fw = new FileWriter(file);

					fw.write(JSONArray.toJSONString(array));

					fw.flush();
					fw.close();

				} else {
					System.out.println("File can not edit");
				}
			} else {
				System.out.println("File Does not exits");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sort() {
		try {
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/AddressBook.json");
			if (file.exists()) {
				if (file.canRead() && file.canWrite()) {
					Scanner scan = new Scanner(System.in);
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					System.out.println("Enter string through which you want to sort address book");
					String str = scan.nextLine();
					Collections.sort(array, new Sort(str));
					Iterator<?> itr = array.iterator();
					while (itr.hasNext()) {
						JSONObject obj1 = (JSONObject) itr.next();
						System.out.println("First Name : " + obj1.get("Firstname") + " " + "Last Name : "
								+ obj1.get("Lastname") + " " + "Address: " + obj1.get("Address") + " " + "City : "
								+ obj1.get("City") + " " + "State : " + obj1.get("State") + " " + "Zip: "
								+ obj1.get("Zip") + " " + "Mobile: " + obj1.get("Mobile"));
					}
					FileWriter fw = new FileWriter(file);
					fw.write(JSONArray.toJSONString(array));
					fw.flush();
					fw.close();

				} else {
					System.out.println("File can not edit");
				}
			} else {
				System.out.println("File Does not exits");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletePerson() throws IOException, ParseException {
		try {
			Scanner scan = new Scanner(System.in);
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/AddressBook.json");
			if (file.exists()) {
				if (file.canRead()) {
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					System.out.println("Enter the user");
					String name = scan.nextLine();
					Iterator<?> iterator = array.iterator();
					boolean flag = false;
					while (iterator.hasNext()) {
						JSONObject jsonObject = (JSONObject) iterator.next();

						if (jsonObject.get("Firstname").equals(name)) {
							array.remove(jsonObject);
							System.out.println("Deleted Successfully.");
							flag = true;
							break;
						}
					}
					if (flag == false) {
						System.out.println("User not found.");
					}
					if (file.canWrite()) {
						FileWriter fw = new FileWriter(file);
						fw.write(JSONArray.toJSONString(array));
						fw.flush();
						fw.close();
					} else {
						System.out.println("File does not haveedit permission");
					}

				} else {
					System.out.println("File can't read");
				}
			} else {
				System.out.println("File does not exits in disk.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addPerson() throws IOException, ParseException {
		try {
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/AddressBook.json");
			if (file.exists()) {

				if (file.canRead() && file.canWrite()) {
					Scanner scan = new Scanner(System.in);
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					JSONObject json = new JSONObject();
					System.out.println("Enter First Name:");
					String firstname = scan.nextLine();
					System.out.println("Enter Last Name:");
					String lastname = scan.nextLine();
					System.out.println("Enter Address:");
					String address = scan.nextLine();
					System.out.println("Enter City:");
					String city = scan.nextLine();
					System.out.println("Enter State:");
					String state = scan.nextLine();
					System.out.println("Enter ZIP:");
					String zip = scan.nextLine();
					System.out.println("Enter Mobile Number:");
					String mobile = scan.nextLine();

					json.put("Firstname", firstname);
					json.put("Lastname", lastname);
					json.put("Address", address);
					json.put("City", city);
					json.put("State", state);
					json.put("Zip", zip);
					json.put("Mobile", mobile);
					array.add(json);
					System.out.println("Added Successfully.");
					FileWriter fw = new FileWriter(file);
					fw.write(JSONArray.toJSONString(array));
					fw.flush();
					fw.close();

				}

				else {
					System.out.println("File can't read and write");
				}
			} else {
				System.out.println("File not exits on disk.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayDetails() throws IOException, ParseException {
		try {
			File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/AddressBook.json");
			if (file.exists()) {
				if (file.canRead() && file.canWrite()) {
					FileReader fr = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(fr);
					Iterator itr = array.iterator();
					while (itr.hasNext()) {
						JSONObject obj = (JSONObject) itr.next();
						System.out.println("First Name : " + obj.get("Firstname") + " " + "Last Name : "
								+ obj.get("Lastname") + " " + "Address: " + obj.get("Address") + " " + "City : "
								+ obj.get("City") + " " + "State : " + obj.get("State") + " " + "Zip: " + obj.get("Zip")
								+ " " + "Mobile: " + obj.get("Mobile"));

					}
				} else {
					System.out.println("File can't have read permissions.");
				}
			} else {
				System.out.println("File does not exits on disk.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}