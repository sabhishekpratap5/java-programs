/******************************************************************************
 *  Purpose: for find out the power of 2 given number
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Power2 {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number:");
		int number = utility.inputInteger();

		utility.power(number);
		System.out.println("Printing the all Power Value until " + number);

	}
}