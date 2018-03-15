package com.bridgelab.objectOriented;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import com.bridgelab.utility.Utility;


public class CommercialDataProcessing {
	
	public static void main(String []args)
	{
		Utility utility = new Utility();
		while(true)
		{	
			System.out.println("Enter your choice:");
			System.out.println("1. Create user");
			System.out.println("2. Buy Share");
			System.out.println("3. Sale Share");
			System.out.println("4. Display Details");
			System.out.println("5. Exit");
			int choice = utility.inputInteger();
			switch(choice)
			{
			case 1:	 	Utility.createAcc();
			break;
			case 2 :	Utility.buyShare();
			break;
			
			case 3 :	Utility.saleShare();
			break;
			case 4 :	Utility.display();
			break;
			default : return;
			}
		}
	}

}
