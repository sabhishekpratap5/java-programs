package com.bridgeit.Programs;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CalenderStack {

	public static void main(String[] args) 
	{
		LinkedStack month = new LinkedStack();
		LinkedStack day = new LinkedStack();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month");
		int mon = scan.nextInt();
		System.out.println("Enter the year");
        int year = scan.nextInt();
       
        String[] months = {"","January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};
        for(int i=0; i<months.length;i++)
        {
        	month.push(months[i]);
        }
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mon == 2 && isLeapYear(year)) 
        {
        	days[mon] = 29;
        }
        for(int i=0;i<days.length;i++)
        {
        	day.push(days[i]);
        }
        System.out.println("   " + months[mon] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");
        int d = dayInMonth(mon, 1, year);
        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
        for (int i = 1; i <= days[mon]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[mon])) 
            	System.out.println();
        }
        scan.close();
        
	}
	
	public static int dayInMonth(int month, int day, int year) 
	{
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
	
	  public static boolean isLeapYear(int year) 
	    {
	        if  ((year % 4 == 0) && (year % 100 != 0)|| year % 400 == 0) 
	        	return true;
	        else
	        	return false;
	    }

}
