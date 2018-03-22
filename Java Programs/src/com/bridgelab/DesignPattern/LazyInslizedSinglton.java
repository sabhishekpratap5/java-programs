/******************************************************************************
 *  Purpose: how to initilized lazy singlton class
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public class LazyInslizedSinglton {
	public static LazyInslizedSinglton INSTANCE;
	
	private LazyInslizedSinglton()
	{
		
	}
	
	public static LazyInslizedSinglton getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE=new LazyInslizedSinglton();
		}
		return INSTANCE;
	}

}
