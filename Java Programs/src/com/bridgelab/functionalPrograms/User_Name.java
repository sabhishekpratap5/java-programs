/******************************************************************************
 *  Purpose: Replace Username with a proper name  
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class User_Name {

	public static void main(String[] args) {
		Utility utility = new Utility();
		String string = "Hello <<UserName>>, How are you?";

		System.out.println("enter username ");
		String username = utility.inputString();
		int length = username.length();
		if (length < 3) {
			System.out.println("Username not valid");

		} else {
			System.out.println(utility.replaceWithPattern(string, username));
		}

	}
}
