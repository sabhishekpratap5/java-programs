package com.bridgelab.DesignPattern;
/******************************************************************************
 *  Purpose:Class for clint which is using fcade pattern
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
import com.bridgelab.utility.Utility;

public class Client {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Shopkeeper shopkeeper = new Shopkeeper();
		while (true) {
			System.out.println("---Mobile Shop---");
			System.out.println("1.Iphone ");
			System.out.println("2.Samsung ");
			System.out.println("3.Blackberry ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice :");
			int choice = utility.inputInteger();
			System.out.println();

			switch (choice) {
			case 1:
				shopkeeper.iphoneSale();
				break;

			case 2:
				shopkeeper.samsungSale();
				break;

			case 3:
				shopkeeper.blacberrySale();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
