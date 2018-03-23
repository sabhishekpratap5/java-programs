/******************************************************************************
 *  Purpose:Samsung mobile phone class which is store phone information
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public class Samsung implements MobileShope {
	public void modelNo() {
		System.out.println("Samsung galaxy");
	}

	public void price() {
		System.out.println("50,000 Rs.");
	}
}