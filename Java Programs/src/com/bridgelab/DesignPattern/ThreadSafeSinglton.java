/******************************************************************************
 *  Purpose:Thread safe pattern class
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public class ThreadSafeSinglton {
	
	private static ThreadSafeSinglton INSTANCE;
	private ThreadSafeSinglton() {
		
	}
	public static synchronized ThreadSafeSinglton getInstace() {
		if (INSTANCE==null)
		{
			INSTANCE = new ThreadSafeSinglton();
			
		}
		return INSTANCE;
	}

}
