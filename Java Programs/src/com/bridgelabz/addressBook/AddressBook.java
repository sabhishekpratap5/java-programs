package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class AddressBook implements AddressBookInterface
{
	Utility utility = new Utility();
	
	ArrayList<Person> list = new ArrayList<Person>();
	
	int choice;

	public void operation() {
		list = AddressManager.listReturn();
		boolean status = true;
		do {
			System.out.println("Choose Operation you want to do");
			System.out.println("1. Add\n2. Edit\n3. SortByName\n4. SortByZip \n5.deletePerson\n6. Exit");
			switch (utility.inputInteger()) {
			case 1:
				addPerson();
				break;
			case 2:
				editPerson();

				break;

			case 3:
				sortByName();
				break;
			case 4:
				sortByZip();
				break;
			case 5:
				deletePerson();
				break;
			case 6:
				status = false;
				break;
			}
		} while (status);
	}

	public void addPerson() {

		Person person = new Person();
		Address address = new Address();
		System.out.println("Enter the First name:");
		String firstName = utility.inputString();
		person.setFname(firstName);

		System.out.println("Enter the Last name:");
		String lastName = utility.inputString();
		person.setLname(lastName);
		

		System.out.println("Enter the contact number:");
		long contactNumber = utility.inputLong();
		person.setContact(contactNumber);

		System.out.println("Enter the City:");
		String city = utility.inputString();
		address.setCity(city);

		System.out.println("Enter the Zip:");
		int zipcode = utility.inputInteger();
		address.setZip(zipcode);

		System.out.println("Enter the State:");
		String state = utility.inputString();
		address.setState(state);

		person.setAddress(address);
		list.add(person);

	}

	public void editPerson() {

		System.out.println("Enter the firstname to Edit details: ");
		String firstName = utility.inputString();
		for (int i = 0; i < list.size(); i++) {
			Person person = list.get(i);
			if (firstName.equals(person.getFname())) {
				Address address = person.getAddress();
				System.out.println(
						"1.Edit lastname \n2.Edit Contact No \n3.Edit city \n4.Edit state \n5.Edit zipcode \n6.Stop editing");
				System.out.println("Enter your choice to update: ");
				choice = utility.inputInteger();
				switch (choice) {
				case 1:
					System.out.println("Enter the lastName");
					String lastName =utility.inputString();
					person.setLname(lastName);
					break;
				case 2:
					System.out.println("Enter your Contact number");
					long contactNumber = utility.inputLong();
					person.setContact(contactNumber);
					break;
				case 3:
					System.out.println("Enter your City");
					String city = utility.inputString();
					address.setCity(city);

					break;
				case 4:
					System.out.println("Enter your State");
					String state = utility.inputString();
					address.setState(state);
					break;
				case 5:
					System.out.println("Enter your zipcode:");
					int zipcode =utility.inputInteger();
					address.setZip(zipcode);
					break;
				case 6:
					System.out.println("**Edited Successfully**");
					break;

				default:
					System.out.println("Invalid choice");
				}
			}
			System.out.println(person);
		}

	}

	public void deletePerson() {
		System.out.println("Enter the firstname to delete details: ");
		String firstName = utility.inputString();
		for (int i = 0; i < list.size(); i++) {
			Person person = list.get(i);
			if (firstName.equals(person.getFname())) {
				list.remove(i);
			}
			System.out.println(list);
		}
	}

	public void sortByName() {
		@SuppressWarnings("unused")
		class SortByName implements Comparator<Person> {
			@Override
			public int compare(Person person1, Person person2) {
				return person1.getFname().compareToIgnoreCase(person2.getFname());
			}
		}
		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person);
		}

	}

	public void sortByZip() {
		class SortByZip implements Comparator<Person> {
			public int compare(Person person1, Person person2) {

				Address address1 = person1.getAddress();
				Address address2 = person2.getAddress();
				int zip1 = address1.getZip();
				int zip2 = address2.getZip();
				return zip1 - zip2;
			}
		}
		Collections.sort(list, new SortByZip());
		for (Person address : list) {
			System.out.println(address);
		}
	}

	public ArrayList<Person> list() {
		return list;
	}

}
