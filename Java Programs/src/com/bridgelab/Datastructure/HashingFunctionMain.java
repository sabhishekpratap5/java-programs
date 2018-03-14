package com.bridgelab.Datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;

public class HashingFunctionMain {

	BufferedReader bufferedReader = null; // buffered reader to read the file
	HashMap<Integer, OrderdLinkedList<Integer>> myHashMap; // hash map to store ordered list

	public static void main(String[] args) {
		HashingFunctionMain function = new HashingFunctionMain(); // class object
		function.initialize();
		function.readFile();
		function.searchNumber();
	}

	// Initializes hash map and puts ordered lists in it 
	void initialize() {
		myHashMap = new HashMap<Integer, OrderdLinkedList<Integer>>();
		for (int i = 0; i < 11; i++) {
			myHashMap.put(i, new OrderdLinkedList<Integer>());
		}
	}

	// Reads file and adds number to respective ordered list 
	void readFile() {
		try {
			FileReader fileReader = new FileReader("/home/bridgeit/HashingData.text");
			bufferedReader = new BufferedReader(fileReader);

			String line; // to store file data line by line
			while ((line = bufferedReader.readLine()) != null) {
				String[] strings = line.split(" "); // splits line into string array
				for (String integers : strings) {
					// converts string into integer
					int numberToAdd = Integer.parseInt(integers);
					// adds number to appropriate list
					OrderdLinkedList<Integer> list = myHashMap.get(numberToAdd % 11);
					list.add(numberToAdd);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found...");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//** Searches for given number 
	void searchNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int search = scanner.nextInt(); // number to be searched

		// getting list in which the number should be
		OrderdLinkedList<Integer> list = myHashMap.get(search % 11);
		scanner.close();

		if (list.search(search)) { // file contains the number
			System.out.println("File contains number. Removing it.");
			list.remove(search);
		} else { // file does not contain the number
			System.out.println("File does not contain the number. Adding it to the file.");
			list.add(search);
		}
		PrintWriter printWriter = null; // to write to the file
		try {
			printWriter = new PrintWriter("/home/bridgeit/HashingData.text", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 11; i++) {
			list = myHashMap.get(i); // getting lists
			while (!list.isEmpty()) {
				// popping every element and adding to the file
				printWriter.print(list.pop() + " ");
			}
		}
		printWriter.close();
	}
}
