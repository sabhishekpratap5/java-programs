/******************************************************************************
 *  Purpose: generic method of searching and sorting 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class GenricSearchingandSorting {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("enter size of array ");
		int n = utility.inputInteger();

		System.out.println("if you want sort the integer array using insertion sort then press 1");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the string array using insertion sort then press 2");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the integer array using bubbol sort then press 3");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want sort the string array using bubbol sort then press 4");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want search any integer key using binary search then press 5");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("if you want searh any string key then press  6");
		System.out.println("--------------------------------------------------------------------");

		Integer array[];

		String stringArray[];
		String string[];

		System.out.println("enter choice ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			long startTime = System.currentTimeMillis();
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			array = utility.insertionSortString(array);
			Utility.print(array, array.length);
			long endTime=System.currentTimeMillis();
			long elaspdTime=endTime-startTime;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime+ " ms");
			break;

		case 2:
			long startTime1 = System.currentTimeMillis();
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}
			string = utility.insertionSortString(stringArray);
			Utility.print(string, stringArray.length);
			long endTime1=System.currentTimeMillis();
			long elaspdTime1=endTime1-startTime1;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime1);

			break;

		case 3:
			long startTime2 = System.currentTimeMillis();
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			array = Utility.bubbleSortInt(array);
			Utility.print(array, array.length);
			long endTime2=System.currentTimeMillis();
			long elaspdTime2=endTime2-startTime2;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime2);

			break;

		case 4:
			long startTime3 = System.currentTimeMillis();
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}
			string = Utility.bubbleSortInt(stringArray);
			Utility.print(string, stringArray.length);
			long endTime3=System.currentTimeMillis();
			long elaspdTime3=endTime3-startTime3;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime3);

			break;

		case 5:
			long startTime4 = System.currentTimeMillis();
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			utility.insertionSortString(array);
			System.out.println("enter key ");
			Integer key = utility.inputInteger();
			array = utility.binarySearchInt(array, key);
			Utility.print(array, array.length);
			long endTime4=System.currentTimeMillis();
			long elaspdTime4=endTime4-startTime4;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime4);

			break;

		case 6:
			long startTime5 = System.currentTimeMillis();
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}

			utility.insertionSortString(stringArray);
			System.out.println("enter Stringkey ");
			String stringKey = utility.inputString();
			System.out.println();
			string = utility.binarySearchInt(stringArray, stringKey);
			Utility.print(stringArray, stringArray.length);
			long endTime5=System.currentTimeMillis();
			long elaspdTime5=endTime5-startTime5;
			System.out.println();
			System.out.println("elaspedTime = "+ elaspdTime5);

			break;
		default:
			System.out.println("program end");

		}
	}

}
