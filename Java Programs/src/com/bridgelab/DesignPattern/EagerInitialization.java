/******************************************************************************
 *  Purpose: Eager singleton initialization.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public class EagerInitialization {
	
	 private static final EagerInitialization INSTANCE = new EagerInitialization();
	 
	 public static EagerInitialization getInstance()
	 {
		 return INSTANCE;
	 }

}
