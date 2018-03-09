package com.bridgelab.Datastructure;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	
	public static String[] readListOfWords() 
	 {
		 String string[]=null;	 
		 try
		 {
			 FileReader fr=new FileReader("/home/bridgelab/linkedlist.text");
			 BufferedReader br=new BufferedReader(fr);

			 String string2="";

			 while(true)
			 {
				 string2=br.readLine();
				 if(string2==null)
					 break;
				 else
					 string=string2.split(" ");
			 }
			 br.close();
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace(); 
		 }
		
		 
		 return string;


	 }


}
