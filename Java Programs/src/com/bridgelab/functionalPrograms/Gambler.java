/******************************************************************************
 *  Purpose: for find out the Gambler game  
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter stack value: ");
		int stack = utility.inputInteger();
		System.out.println("Enter goal value: ");
		int goal = utility.inputInteger();
		System.out.println("Enter number of times for play: ");
		int NoOfTimes = utility.inputInteger();

		Utility.GamblerGame(stack, goal, NoOfTimes);

	}
}