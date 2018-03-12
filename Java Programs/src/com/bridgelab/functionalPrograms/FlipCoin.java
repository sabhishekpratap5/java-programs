/******************************************************************************
 *  Purpose: FlipCoin program for find out the probability percentage of head and tell.  
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("how many time you want flip coin give the number ");
		int number = utility.inputInteger();
		utility.flipCoin(number);
	}

}
