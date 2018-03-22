/******************************************************************************
 *  Purpose:Server class for computer
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public class Srever extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Srever(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	public String getRAM() {
		return this.ram;
	}
	public String getHDD() {
		return this.hdd;
	}
	public String getCPU() {
		return this.cpu;
	}
	
	

}
