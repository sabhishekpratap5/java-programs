/******************************************************************************
 *  Purpose: this program is refer for commercial stock account.
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import com.bridgelab.utility.Utility;

public class CommericalStockAccount 
{
	static
	{
		System.out.println("Commercial data processing");
	}
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		StockAccount account=new StockAccount();
		StockAccount stockAccount=new StockAccount();
		String name,symbol;
		long money,noOfShares,priceOfEachShare;
		long total_share;
		int choice=0;
		do
		{
			System.out.println("1. Create Account");
			System.out.println("2. Buy Shares");
			System.out.println("3. Sell Shares");
			System.out.println("4. Add Company");
			System.out.println("5. Remove Company");
			System.out.println("6. Display Transaction Details");
			System.out.println("7. Display Report");
			System.out.println("8. Exit");
			System.out.println("Enter your choice: ");
			choice=utility.inputInteger();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter your Name: ");
				name=utility.inputString(); 
				System.out.println("Enter Initial Money:");
				money=utility.inputLong();
				System.out.println("Enter the Shares: ");
				total_share=utility.inputLong();
				Customer customer = new Customer(name, money, total_share);
				//System.out.println(customer);
				account=new StockAccount(customer);
				System.out.println("Account created Sucessfully");
				break;
				
			case 2:
				System.out.println("Enter your Name=");
				name=utility.inputString();
				System.out.println("Enter the Symbol of company to buy Shares=");
				symbol=utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				//System.out.println(symbol + " "+ noOfShares + " "+name);
				stockAccount.buyShare(symbol, noOfShares, name);
				System.out.println("Share buy Successfully.....");
				break;
				
			case 3:
				System.out.println("Enter your Name=");
				name=utility.inputString();
				System.out.println("Enter the Symbol of company to buy Shares=");
				symbol=utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				//System.out.println(symbol + " "+ noOfShares + " "+name);
				stockAccount.sellShare(symbol, noOfShares, name);
				System.out.println("Share Sell Successfully");
				break;
			case 4:
				System.out.println("Enter the Symbol of Company to Add in File: ");
				symbol=utility.inputString();
				System.out.println("Enter no of Shares=");
				noOfShares=utility.inputLong();
				System.out.println("Enter Price of Shares");
				priceOfEachShare=utility.inputLong();
				//System.out.println(symbol+" "+noOfShares+" "+priceOfEachShare);
				stockAccount.addNewSymbol(symbol, noOfShares, priceOfEachShare);
				System.out.println("Company Added Successfully");
				break;
				
			case 5:
				System.out.println("Enter the Symbol of Company to Add in File: ");
				symbol=utility.inputString();
				//System.out.println(symbol);
				account.removeSymbol(symbol);
				System.out.println("Company Removed Successfully");
				break;
			case 6:
				System.out.println("Transaction Details");
				stockAccount.displayTransactionDetails();
				break;
			case 7:
				System.out.println("Report");
				stockAccount.displayReport();
				break;
			case 8:
				System.out.println("Thanks");
				System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
		while(choice > 0);
	}
	
}
