/******************************************************************************
 *  Purpose: for find out the calendar. 
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

public class Calendar {
	
	public static void main(String[] args) 
    {	
    	
    	Utility utility = new Utility(); 
    	System.out.println("eneter month ");
        int month = utility.inputInteger();
        System.out.println("enter year ");
        int year = utility.inputInteger();
        String[] months = {"","January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && utility.leapYear(year)) 
        {
        	days[month] = 29;
        }
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F Sa");
        int d = utility.dayInMonth(month, 1, year);
        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
        for (int i = 1; i <= days[month]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) 
            	System.out.println();
        }
    }
}


