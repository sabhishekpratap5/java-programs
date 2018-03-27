/******************************************************************************
 *  Purpose: Regular expression Program
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelab.utility.Utility;

public class RegullarExpression {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		Utility utility  = new Utility();
		String string = "Hello <<name>>, We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification Thank you "
				+ "BridgeLabz 01/01/2016.";
		System.out.println("enter your name ");
		String name = scan.nextLine();
		String arr[]=name.split(" ");
		System.out.println("enter your mobile number ");
		String mobileNumber = utility.inputString();
		
		boolean isValidMobileNo=checkMobileNo(mobileNumber);
		Date date = new Date();
		String d = new SimpleDateFormat().format(date);
		String d1[]=d.split(" ");
		string=string.replace("<<name>>", arr[0]);
		string=string.replace("<<full name>>", name);
		if(isValidMobileNo)
		{
		 string=string.replace("xxxxxxxxxx", mobileNumber);
		}
		else
		{
		 System.out.println("MobileNo is invalid...!");	
		}
		string=string.replace("01/01/2016", d1[0]);
		System.out.println(string);

	}

	private static boolean checkMobileNo(String mobileNumber) 
	{
		
		if(mobileNumber.matches("\\d{10}"))
		{
		 return true;	
		}
		
		return false;
	}

}
