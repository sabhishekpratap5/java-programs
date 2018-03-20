/******************************************************************************
 *  Purpose: for find out the temperature conversion
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("enter your choice for celcius to fairenhite  press 1 or fairenhite to celcius for 2 ");
		int choice = utility.inputInteger();

		if (choice==1) {
			System.out.println("Enter temperatue in Celcious");
			int temperatuer = utility.inputInteger();
			int f = utility.temperaturConversiontoFarenhit(temperatuer);
			System.out.println("temperature in Farenhit  " + f);
		} else if (choice==2) {
			System.out.println("Enter temperatue in Fahrenheit");
			int temperatuer1 = utility.inputInteger();
			int c = utility.temperaturConversiontoCelcius(temperatuer1);
			System.out.println("temperature in Celcious " + c);
		} else {
			System.out.println("enter corect choice ");
		}

	}

}
