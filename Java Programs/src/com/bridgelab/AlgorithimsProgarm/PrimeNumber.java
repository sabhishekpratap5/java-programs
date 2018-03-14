/******************************************************************************
 *  Purpose: for find out the prime number in given range 0 to 1000.
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter starting value");
		int low = utility.inputInteger();
		System.out.println("Enter limit value");
		int high = utility.inputInteger();
		utility.primeNumInRange(low, high);
	}
}
