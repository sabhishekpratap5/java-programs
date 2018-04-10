package com.bridglabz.addressBook;

import java.io.IOException;
import java.util.ArrayList;

public interface AddressBook {
	public void addPerson() throws IOException;
	public void deletePerson();
	public void editPerson();
	public void sortByLastName();
	public void sortByZip();
	public void print();

}
