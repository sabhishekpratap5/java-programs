/******************************************************************************
 *  Purpose: Replace Username with a proper name  
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgelab.functionalPrograms;
/**
*  @author  Abhishek Pratap Singh
*  @version 1.0
*  @since   05-03-2018
*/
import com.bridgelab.utility.Utility;

public class User_Name 
{ 

	public static void main(String []args){
		Utility utility = new Utility();
		String string = "Hello <<UserName>>, How are you?";

		System.out.println("enter username ");
		String username =utility.inputString();
		int n=username.length();
		if(n<3)
		{
			System.out.println("Username not valid");

		}
		else
		{
			System.out.println(Utility.replaceWithPattern(string, username));
		}



	}
}

