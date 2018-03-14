package com.bridgelab.objectOriented;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegullarExpression {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = "Hello <<name>>, We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification Thank you "
				+ "BridgeLabz 01/01/2016.";
		System.out.println("enter your name ");
		String name = scanner.nextLine();
		String arr[]=name.split(" ");
		System.out.println("enter your mobile number ");
		String mobileNumber = scanner.nextLine();
		
		Date date = new Date();
		String d = new SimpleDateFormat().format(date);
		String d1[]=d.split(" ");
		string=string.replace("<<name>>", arr[0]);
		string=string.replace("<<full name>>", name);
		string=string.replace("xxxxxxxxxx", mobileNumber);
		string=string.replace("01/01/2016", d1[0]);
		System.out.println(string);
		scanner.close();

	}

}
