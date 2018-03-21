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
