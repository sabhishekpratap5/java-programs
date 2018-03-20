/******************************************************************************
 *  Purpose: for generate random CoupnNumber 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class CoupnNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Please enter the number of coupen ");
		int number = utility.inputInteger();
		System.out.println("----------------------------------");
		utility.coupnNumber(number);
		System.out.println();
	}

}
