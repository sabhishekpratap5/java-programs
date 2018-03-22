/******************************************************************************
 *  Purpose: Computer Factory which store the information of assoseries.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;


public class ComputerFactory{
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type))
		{
		 return new PC(ram, hdd, cpu);
		}
		else if("Server".equalsIgnoreCase(type))
		{
		 return new Srever(ram, hdd, cpu);
		}
		
		return null;
	}

	
}
