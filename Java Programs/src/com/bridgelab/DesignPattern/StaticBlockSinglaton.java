package com.bridgelab.DesignPattern;

public class StaticBlockSinglaton {
	private static StaticBlockSinglaton INSTANCE;
	
	private StaticBlockSinglaton()
	{
		
	}
	
	static {
		try {
			INSTANCE = new StaticBlockSinglaton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occoured in creating singlton instance ");
		}
	}
	
	public static StaticBlockSinglaton getInstance()
	{
		return INSTANCE;
	}

}
