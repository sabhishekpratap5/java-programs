package com.bridgelab.objectOriented;

import java.io.IOException;
import java.text.ParseException;

import com.bridgelab.utility.Utility;

public class InventoryData {
	public static void main(String[] args) throws IOException, ParseException
	{
		
		Utility utility = new Utility();
		
		utility.writingData();
		utility.readingData();
	}

}
