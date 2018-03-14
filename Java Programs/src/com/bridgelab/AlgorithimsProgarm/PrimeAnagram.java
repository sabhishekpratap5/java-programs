package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.PrimeAnagramUtility;
import com.bridgelab.utility.Utility;

import java.util.ArrayList;
class PrimeAnagram 
{
	/**
	 * @param args
	 */
	public static void main(String args[]) 
	{
		try{
			Utility utility = new Utility();
			PrimeAnagramUtility pau = new PrimeAnagramUtility ();
			ArrayList<Integer> primeArray = new ArrayList<Integer>();
			ArrayList<Integer> anagarmArray = new ArrayList<Integer>(); 
			System.out.println("Enter the starting value:");
			int start = utility.inputInteger();
			System.out.println("Enter the Last value:");
			int limit = utility.inputInteger();
			Integer[] array=utility.disp(start,limit);
			utility.printArray(array);
			for (Integer ele : array)
			{
				primeArray.add(ele);
			}
			@SuppressWarnings("unchecked")
			ArrayList<Integer> primenumbers = PrimeAnagramUtility.palindromNumber(array);
			for(Integer ele : primenumbers)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
			anagarmArray = PrimeAnagramUtility.findAnagram(primeArray,anagarmArray,primenumbers);
			PrimeAnagramUtility.printArrayElement(primeArray,anagarmArray);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}