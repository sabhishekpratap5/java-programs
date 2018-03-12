/******************************************************************************
 *  Purpose:for find out the gassing number 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class QuestionNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter number");
		int number = utility.inputInteger();
		int power = (int) Math.pow(2, number) - 1;
		int low = 0;
		System.out.println("assume the number between " + low + " to " + power);

		int value = utility.questionNumber(low, power);
		System.out.println("your asumed number is " + value);

	}

}
