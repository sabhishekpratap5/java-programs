/******************************************************************************
 *  Purpose:volt class for measer volts of sockets.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public class Volt {
	
	private int volt;
	
	public Volt(int v)
	{
		this.volt=v;
	}
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}

}
