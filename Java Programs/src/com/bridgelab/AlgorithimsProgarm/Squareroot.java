/******************************************************************************
 *  Purpose: for find out the square root of numbers. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class Squareroot {
	public static void main(String[] args) {

		System.out.println("Please Enter the number ");
		Utility utility = new Utility();
		double num = utility.inputInteger();
		utility.sqrt(num);

	}

}
