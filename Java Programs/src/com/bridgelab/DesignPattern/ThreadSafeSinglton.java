package com.bridgelab.DesignPattern;

public class ThreadSafeSinglton {
	
	private static ThreadSafeSinglton instance;
	private ThreadSafeSinglton() {
		
	}
	public static synchronized ThreadSafeSinglton getInstace() {
		if (instance==null)
		{
			instance = new ThreadSafeSinglton();
			
		}
		return instance;
	}

}
