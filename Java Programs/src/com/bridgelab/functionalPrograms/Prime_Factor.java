/******************************************************************************
 *  Purpose: for find out the prime factor of this given number
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Prime_Factor {

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("enter number for findout the prime factor ");
		int number = utility.inputInteger();

		String string = "";
		utility.primeFactor(number);

	}
}