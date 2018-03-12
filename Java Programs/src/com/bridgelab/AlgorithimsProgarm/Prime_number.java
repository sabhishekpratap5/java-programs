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

public class Prime_number {

	public static void main(String[] args) {
		Utility utility = new Utility();

		int low = 0;

		int high = 1000;

		utility.primeNumInRange(low, high);
	}
}
