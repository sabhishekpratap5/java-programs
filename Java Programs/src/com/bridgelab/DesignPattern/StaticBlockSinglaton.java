package com.bridgelab.DesignPattern;

public class StaticBlockSinglaton {
	private static StaticBlockSinglaton instance;
	
	private StaticBlockSinglaton()
	{
		
	}
	
	static {
		try {
			instance = new StaticBlockSinglaton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occoured in creating singlton instance ");
		}
	}
	
	public static StaticBlockSinglaton getInstance()
	{
		return instance;
	}

}
