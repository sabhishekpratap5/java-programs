package com.bridgelab.Datastructure;

import java.io.FileNotFoundException;

import com.bridgelab.utility.Utility;

public class Hashing {
	public static void main(String[] args) throws FileNotFoundException 
	{
		String filepath="/home/bridgeit/abhishek-workspace/Java Programs/src/readhashing.text";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.print(Integer.parseInt(words[i])+" ");
		}
			System.out.println();
			Utility.hashing(words);
		
	}

}
