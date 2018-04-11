package com.bridgelabz.addressBook;

import java.io.IOException;

import com.bridgelab.utility.Utility;

public class AddressBookTest {
	public static void main(String[] args) {
		Utility utility = new Utility();
		
		AddressManager manager=new AddressManager();
			do{
			System.out.println("Make a choice from below");
			System.out.println("1.Create Address-Book \n2. Open Address-Book \n3. Save Address-Book\n4. Save As Address-Book\n5.Close");
			switch (utility.inputInteger()) {
			case 1:	manager.createAddressBook();
					break;
			case 2:	manager.openAddressBook();
					break;
			case 3:	manager.saveAddressBook();
					break;
			case 4:	try {
					manager.saveAsAddressBook();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			
			case 5:System.out.println("addressBook Closed.");
				System.exit(0);
				
			}
			}while(true);
		}

}
