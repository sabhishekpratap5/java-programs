/******************************************************************************
 *  Purpose: Store the Data in a Address Book. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import com.bridgelab.utility.AddressBookUtility;
import com.bridgelab.utility.Utility;

public class AddressBook {

	public static void main(String[] args) {
		Utility utility = new Utility();

		try {
			AddressBookUtility addressbook = new AddressBookUtility();
			while (true) {
				System.out.println("Enter your choice:");
				System.out.println("1. Add New Person");
				System.out.println("2. Delete Person");
				System.out.println("3. Edit Details");
				System.out.println("4. Sort");
				System.out.println("5. Display Details");
				System.out.println("6. Exit");
				int choice = utility.inputInteger();
				switch (choice) {
				case 1:
					addressbook.addPerson();
					break;
				case 2:
					addressbook.deletePerson();
					break;
				case 3:
					addressbook.editDetails();
					break;
				case 4:
					addressbook.sort();
					break;
				case 5:
					addressbook.displayDetails();
					break;
				default:
					return;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
