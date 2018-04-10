package com.bridglabz.addressBook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

public class ManagerImpl {
	Scanner scanner = new Scanner(System.in);
	String folderPath = "/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridglabz/addressBook/files/";
	String openfile;
	File nfile;

	public void newAddressBook() throws IOException {
		File path = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridglabz/addressBook/files");
		File[] listFile = path.listFiles();
		System.out.println("list of file in folder: ");
		for (File file1 : listFile) {
			System.out.println(file1.getName());
		}
		System.out.println("Enter the new file name: ");
		String newFile = scanner.next();
		File nfile = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridglabz/addressBook/files/"
				+ newFile + ".json");
		nfile.createNewFile();
		System.out.println("New file created");

	}

	public File openFile() throws IOException {

		File path = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridglabz/addressBook/files");
		File[] listFile = path.listFiles();
		System.out.println("list of file in folder: ");
		for (File file1 : listFile) {
			System.out.println(file1.getName());
		}

		System.out.println("Enter file name to open:");
		openfile = scanner.next();

		nfile = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/com/bridglabz/addressBook/files/"
				+ openfile + ".json");
		addressBookOperations();
		return nfile;

	}

	AddressBookImpl addressBookImpl = new AddressBookImpl();

	public void addressBookOperations() throws IOException {
		int choice;

		do {
			System.out.println("Enter your choice: ");
			System.out
					.println("\n1.addPerson \n2.deletePerson \n3.editPerson \n4.sortByLastName \n5.sortByZip \n6.exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBookImpl.addPerson();
				break;

			case 2:
				addressBookImpl.deletePerson();
				break;

			case 3:
				addressBookImpl.editPerson();
				break;

			case 4:
				addressBookImpl.sortByLastName();
				break;

			case 5:
				addressBookImpl.sortByZip();
				break;

			case 6:
				break;

			}
		} while (choice < 6);

	}

	public void closeFile() {
		// TODO Auto-generated method stub

	}

	public void saveFile(ArrayList<Person> arraylist, File filepath) throws IOException {
		ArrayList<Person> arrayList = new ArrayList<Person>();

		arrayList = arraylist;
		System.out.println("hii" + arrayList);
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.writeValue(new FileOutputStream(filepath), arrayList);
		System.out.println("Svae Successfully.");

	}

	public void saveAs() {
		// TODO Auto-generated method stub

	}

	public void quit() {
		// TODO Auto-generated method stub

	}

}
