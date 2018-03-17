/******************************************************************************
 *  Purpose: Commercial data processing program using Queue for time and date management. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.bridgelab.utility.Utility;
public class StackandQueue {
	public static void main(String args[])
	{
		Utility utility = new Utility();
		Queue queue = new Queue();
		Stack stack = new Stack();
		while(true)
		{
			System.out.println("Do you want to buy share or sell 1- Buy and 2-Sale");
			int choice = utility.inputInteger();
			utility.inputString();
			switch(choice)
			{
				case 1 : 	System.out.println("Enter the symbol to buy share");
							String symbol = utility.inputString();
							Date d = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
							System.out.println(date);
							stack.push(symbol);
							queue.insert(date);
							stack.display();
							queue.display();
							
							break;
				case 2	:
							stack.pop();
							stack.display();
							break;
				default : return;
			}
			
		}
	}
}
