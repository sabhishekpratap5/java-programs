package com.bridgelabz.addressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressManager {
	static {
		System.out.println("***** Address Book Manager *****");
	}
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBook addressbook = new AddressBook();
	static ArrayList<Person> arrayList = new ArrayList<>();
	File file;
	static Scanner scanner = new Scanner(System.in);

	public void createAddressBook() {
		File path = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/");
		File[] listFile = path.listFiles();
		System.out.println("list of file in folder: ");
		for (File file1 : listFile) {
			System.out.println(file1.getName());
		}
		System.out.println("Give a name to your new address book:");
		file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/" + ""
				+ scanner.next() + ".json");
		try {
			if (file.createNewFile()) {
				System.out.println("Address book is created!");
				//saveAddressBook();

			} else {
				System.out.println("Address book is already exists.");
				//saveAddressBook();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void openAddressBook() {
		File path = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/");
		File[] listFile = path.listFiles();
		System.out.println("list of file in folder: ");
		for (File file1 : listFile) {
			System.out.println(file1.getName());
		}
		System.out.println("Enter the name of address book");
		file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/" + ""
				+ scanner.next() + ".json");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				arrayList = objectMapper.readValue(arrayToJson, type);

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		addressbook.operation();
		saveAddressBook();
	}

	public static ArrayList<Person> listReturn() {
		return arrayList;
	}

	public void saveAddressBook() {
		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList = addressbook.list();

		try {
			objectMapper.writeValue(file, arrayList);
			System.out.println(arrayList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveAsAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		File path = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/");
		File[] listFile = path.listFiles();
		System.out.println("list of file in folder: ");
		for (File file1 : listFile) {
			System.out.println(file1.getName());
		}
		System.out.println("enter the file name which you want saveAs new File ");
		File files = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/" + ""
				+ scanner.next() + ".json");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(files));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				arrayList = objectMapper.readValue(arrayToJson, type);

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("creat new file to save and give name :");
		String newName = scanner.next();
		System.out.println("enter extension of file ");
		String extension = scanner.next();

		File newFile = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridgelabz/Files/" + ""
				+ newName + "." + extension);
		try {
			if (newFile.createNewFile()) {
				System.out.println("Address book is created!");

			} else {
				System.out.println("Address book is already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		objectMapper.writeValue(newFile, arrayList);
	}
	/*
	 * public void quit() { System.out.println(); System.exit(0); }
	 */

}
