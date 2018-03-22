/******************************************************************************
 *  Purpose:Print anagram number in 2D Array between 0 1000
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

import java.util.ArrayList;
import java.util.TreeSet;

import com.bridgelab.utility.Utility;


public class Anagarm2d {
	public static void main(String[] args) {
		Utility utility = new Utility();
		ArrayList<Integer> arrayList = utility.primeNumbers(0,1000);
		TreeSet<Integer> treeSet = Utility.anagramInArraylist(arrayList);
		Utility.twoDimentionlPrimeAnagramNumber(treeSet);
	}

}
