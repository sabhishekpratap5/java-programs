package com.bridgelab.DesignPattern;

public class LazyInslizedSinglton {
	public static LazyInslizedSinglton instance;
	
	private LazyInslizedSinglton()
	{
		
	}
	
	public static LazyInslizedSinglton getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInslizedSinglton();
		}
		return instance;
	}

}
