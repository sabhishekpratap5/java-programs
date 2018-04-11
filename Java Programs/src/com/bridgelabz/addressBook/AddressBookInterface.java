package com.bridgelabz.addressBook;

import java.util.ArrayList;

public interface AddressBookInterface
{
	public void addPerson();
	public void editPerson();
	public void deletePerson();
	public void sortByName();
	public void sortByZip();
	ArrayList<Person> list();
}
