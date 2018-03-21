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
