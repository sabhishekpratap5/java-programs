package com.bridglabz.addressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookImpl<E> implements AddressBook{

	ArrayList<Person> arraylist=new ArrayList<Person>();
	String arrayToJson;
	//ArrayList<Address> arraylistAddr=new ArrayList<Address>();
	Scanner scanner=new Scanner(System.in);
	public void  addPerson() throws IOException 
	{
		Person person=new Person();
		Address address=new Address();
		System.out.println("Enter first name:");
		String firstname=scanner.nextLine();
		System.out.println("Enter last name:");
		String lastname=scanner.nextLine();
		System.out.println("Enter city name:");
		String city=scanner.nextLine();
		System.out.println("Enter state name:");
		String state=scanner.nextLine();
		System.out.println("Enter zip code:");
		int zip=scanner.nextInt();
		System.out.println("Enter mobile number:");
		long mobileNumber=scanner.nextLong();
		person.setFirstName(firstname);
		person.setLastName(lastname);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		address.setPhoneNo(mobileNumber);
		person.setAddress(address);
		arraylist.add( person);

		System.out.println(arraylist);
		//AddressBookManager addressBookManager=new AddressBookManager();

		//return arraylist;



	}
	public ArrayList<Person> getData()
	{
		System.out.println(arraylist);	
		return arraylist;

	}




	public  void deletePerson() {


	}


	public void editPerson() {


	}


	public void sortByLastName() {


	}


	public void sortByZip() {


	}


	public void print() {


	}
	
	
}


