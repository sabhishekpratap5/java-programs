/******************************************************************************
 *  Purpose: for find out the distance between coefficient x and coefficient y arguments
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Distance {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("enter first number ");
		int argumentX = utility.inputInteger();
		System.out.println("enter second number ");
		int argumentY = utility.inputInteger();

		Utility.distanceOfTwoArguments(argumentX, argumentY);

	}
}
