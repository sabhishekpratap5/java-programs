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

public class CouponNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter The Number : ");
		int number = utility.inputInteger();

		int count = Utility.calculateDistinctCoupon(number);
		System.out.println("No. of Count     : " + count);

	}
}