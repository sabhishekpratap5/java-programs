
/******************************************************************************
 *  Purpose:for managing banking cash counter.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

public class BankingCash {
	public static void main(String args[])
	{ 
		Utility utility=new Utility();
		CashCounterLogic cash=new CashCounterLogic();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Display Balacne");
		   	System.out.println("5.Exit");
		   	System.out.println();
		   	int choice=utility.inputInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		cash.insert(utility.inputInteger()); 
			   		cash.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					utility.inputInteger();
			   		cash.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		cash.display();
			   		break;
			case 3:
					int j=cash.getSize();
					System.out.println("The Number of People in Queue is: "+j);	
					break;
			case 4: System.out.println(" Your Available Balance is: "); 
	   				cash.display();
	   				break;
		 
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		return;
		   	}
	   	}
		while(ch<5);
	}		

}
