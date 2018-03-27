/******************************************************************************
 *  Purpose:it contain all the method of programs 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.utility;

import com.bridgelab.Datastructure.LinkedList;
import com.bridgelab.Datastructure.QueueStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {

	public static Scanner scanner = new Scanner(System.in);

	/**
	 *  
	 */
	public Utility() {
		scanner = new Scanner(System.in);

	}

	/**
	 * @return string input given by the user
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * @return integer value given by the user
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public Long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return (long) 0;
	}

	/**
	 * @return double value given by the user
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/**
	 * @return boolean value given by the user
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/**
	 * @param string
	 * @param replace
	 * @return a replace string
	 */
	public String replaceWithPattern(String string, String replace) {

		Pattern pattern = Pattern.compile("<<UserName>>");
		Matcher match = pattern.matcher(string);

		return match.replaceAll(replace);
	}

	/**
	 * @param number
	 *            nothing return this method is give the percentage of flip coin
	 *            head and tell
	 */
	public void flipCoin(int number) {
		int head = 0;
		int tell = 0;
		for (int i = 1; i <= number; i++) {
			double random = Math.random();

			if (random > 0 && random < 0.5) {
				tell++;
			} else if (random > 0.5 && random < 1) {
				head++;
			}
		}

		float headPercentes = (head * 100) / number;
		float tellPercentes = (tell * 100) / number;
		System.out.println("Number of Head " + head);
		System.out.println("Total Precent of Head " + headPercentes + "%");
		System.out.println("Number of Tail " + tell);
		System.out.println("Total Precent of tail " + tellPercentes + "%");

	}

	/**
	 * @param year
	 * @return boolean datatype this method is give the year is leap year or not
	 */
	public boolean leapYear(int year) {
		if (year > 1000) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				return true;
			}
		}
		return false;

	}

	/**
	 * @param number
	 * @return double datatype power of 2 until number
	 */
	public double power(int number) {
		for (int i = 1; i <= number; i++) {
			double power = (Math.pow(2, i));
			System.out.println("Power of 2^" + i + " is: " + power);
		}
		return number;

	}

	/**
	 * @param number
	 * @return double datatype harmonic value until number
	 */
	public double harmonicValue(double number) {

		double value = 0.0;

		for (int i = 1; i <= number; i++) {

			value = value + (1.0 / i);
		}
		return value;
	}

	/**
	 * @param stack
	 * @param goal
	 * @param NoOfTimes
	 * @return integer value its return the percents of win && loss
	 */
	public int GamblerGame(int stack, int goal, int NoOfTimes) {
		int wins = 0;
		int cash = 0;
		for (int i = 0; i < NoOfTimes; i++) {
			cash = stack;

			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}

		System.out.println();
		System.out.println(wins + " wins of " + NoOfTimes);
		System.out.println("Percent of games won = " + 100 * wins / NoOfTimes);
		System.out.println("Percent of games loss = " + (100 - (100 * wins / NoOfTimes)));
		return cash;

	}

	/**
	 * @param array
	 * @param length
	 * @return integer value its return the in a array how much triplets are there.
	 */
	public int addOfSum(int array[], int length) {
		System.out.println();
		int i, j, k, count = 0;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				for (k = j + 1; k < length; k++) {

					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
						count++;
					}
				}
			}
		}

		return count;
	}

	/**
	 * @param argument1
	 *            is the coefficient of X
	 * @param argument2
	 *            is the coefficient of Y
	 * @return double value its return the distance between two arguments;
	 */
	public double distanceOfTwoArguments(int argumentX, int argumentY) {
		double distance = Math.sqrt((argumentX * argumentX) + (argumentY * argumentY));
		System.out.println("distance from (" + argumentX + ", " + argumentY + ") to (0, 0) = " + distance);
		return distance;
	}

	/**
	 * @param string
	 * @param l
	 *            is the lower index of the string
	 * @param nothing
	 *            return permute strings of the string
	 */
	public void permute(String string, int l, int r) {
		if (l == r)
			System.out.println(string);
		else {
			for (int i = l; i <= r; i++) {
				string = swap(string, l, i);
				permute(string, l + 1, r);
				string = swap(string, l, i);
			}
		}
	}

	/**
	 * @param string
	 * @param i
	 * @param j
	 * @return its return swap string
	 */
	public String swap(String string, int i, int j) {
		char tempreri;
		char[] charArray = string.toCharArray();
		tempreri = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = tempreri;
		return String.valueOf(charArray);
	}

	/**
	 * @param choice
	 * @return long value of elapsed time
	 */
	public long stopwatch(int choice) {
		long startTime = 0;
		long stopTime = 0;

		while (choice == 1) {
			startTime = System.currentTimeMillis();
			System.out.println("start time : " + startTime);
			System.out.println("if you want stop the stopwatch then press 0 ");
			choice = inputInteger();
		}
		stopTime = System.currentTimeMillis();
		System.out.println("stop time : " + stopTime);
		long elapsed = (stopTime - startTime);
		return elapsed;

	}

	// prime factor method

	/**
	 * @param number
	 *            nothing return it give the prime factor of given number
	 */
	public void primeFactor(int number) {
		String string = "";

		for (int i = 2; i <= number;) {
			if (number % i == 0) {
				number = number / i;
				string += i + " ";

			} else {
				i++;

				if (number % i == 0) {
					number = number / i;
					string += i + " ";

				}
			}
		}

		System.out.println("Prime factor is " + string);
	}

	// 2Dmatrix

	/**
	 * @param m
	 * @param n
	 * @return
	 */
	public static int[][] arrayInt(int m, int n) {
		Utility utility = new Utility();
		int a[][] = new int[m][n];
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = utility.inputInteger();
			}
		}
		return a;
	}

	public static double[][] arrayDouble(int m, int n) {
		Utility utility = new Utility();
		double b[][] = new double[m][n];
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = utility.inputDouble();
				;
			}
		}
		return b;
	}

	public static String[][] arrayBoolean(int m, int n) {
		Utility utility = new Utility();
		String c[][] = new String[m][n];
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = utility.inputString();
			}
		}
		return c;
	}

	public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
		PrintWriter pw = new PrintWriter(System.out, true);

		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}

		// display boolean
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
	}

	/* tic tac game */

	/**
	 * @param number
	 *            nothing return its generate the random number.
	 */
	public void coupnNumber(int number) {
		Random r = new Random();
		for (int i = 0; i < number; i++) {
			System.out.print(" " + r.nextInt(9999) + " ");
		}
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return double value of delta
	 */
	public double quadratic(double a, double b, double c) {
		double root1 = 0;
		double root2 = 0;

		double delta = b * b - 4 * a * c;

		if (delta > 0) {

			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("The equation has two real roots " + root1 + " and " + root2);
		}

		return delta;

	}

	/**
	 * @param temperature
	 * @param value
	 * @return double value of windchill temprature
	 */
	public double windChill(double temperature, double value) {
		double windchill = 0.0;
		if (temperature < 50 && (value >= 3 && value < 120)) {
			windchill = (35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(2, 0.16));
		}
		return windchill;

	}

	// Algorithim program

	/**
	 * @param char1
	 * @param char2
	 *            nothing return its work for check string is anagram string or not
	 */
	public void anagram(char char1[], char char2[]) {
		if (char1.length != char2.length) {
			System.out.println("not anagram");
		}

		else {
			Arrays.sort(char1);

			Arrays.sort(char2);
			boolean flag = true;
			for (int i = 0; i < char1.length; i++) {
				if (char1[i] == char2[i]) {
					flag = true;
				} else {
					flag = false;
					System.out.println("String is not anagram");
					break;
				}
			}
			if (flag == true) {
				System.out.println("String is anagram");
			}
		}
	}

	// prime number 0 to 1000
	/**
	 * @param low
	 * @param high
	 * @return integer value of all prime value from 0 to 1000.
	 */
	public void primeNumInRange(int low, int high) {

		Integer arr[] = new Integer[high / 2];
		int k = 0, len = 0;
		// loop until last number
		for (int i = 2; i <= high; i++) {
			boolean prime = true;
			// to check the number is prime or not
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			// to store each prime number in array
			if (prime == true) {
				arr[k] = i;
				k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				len++;
		}

		Integer[] newArray = new Integer[len];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				newArray[j] = arr[i];
				j++;
			}
		}
		System.out.println();

		printArray(newArray);
	}

	public <T extends Comparable<T>> void printArray(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// PrimeAnagram
	/**
	 * @param start
	 * @param limit
	 * @return
	 */
	public Integer[] disp(int start, int limit) {
		Integer arr[] = new Integer[limit / 2];
		int k = 0, len = 0;
		// find prime number between range
		for (int i = 2; i <= limit; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				arr[k] = i;
				k++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				len++;
		}
		// to store prime number in array
		Integer[] newArray = new Integer[len];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				newArray[j] = arr[i];
				j++;
			}
		}
		System.out.println();
		// to print prime numbers
		return (newArray);
	}

	// print method for array integers
	/**
	 * @param array
	 *            nothing return it is work for print the array
	 */
	public void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// Question number program method
	/**
	 * @param low
	 * @param power
	 * @return integer value of the assumed number.
	 */
	public int questionNumber(int low, int power) {
		if (low > power) {
			return -1;

		}
		if (power == low) {
			return low;
		}

		int middle = (low + power) / 2;
		System.out.println("your number in between " + low + " to " + middle);
		System.out.println("if yes then type true if no then type false ");
		boolean flag = true;

		if (flag != inputBoolean()) {
			low = middle + 1;
		} else {
			power = middle;
		}
		return questionNumber(low, power);
	}

	// merge sort method
	/**
	 * @param array
	 * @param low
	 * @param high
	 *            nothing return it is work for sort the array.
	 */
	public void sort(int array[], int low, int high) {
		if (low < high) {

			int middle = (low + high) / 2;

			sort(array, low, middle);
			sort(array, middle + 1, high);

			merge(array, low, middle, high);
		}
	}

	/**
	 * @param array
	 * @param low
	 * @param middle
	 * @param high
	 *            nothing return it is work for merge array.
	 */
	public void merge(int array[], int low, int middle, int high) {

		int n1 = middle - low + 1;
		int n2 = high - middle;

		int array1[] = new int[n1];
		int array2[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			array1[i] = array[low + i];
		for (int j = 0; j < n2; ++j)
			array2[j] = array[middle + 1 + j];

		int i = 0, j = 0;

		int k = low;
		while (i < n1 && j < n2) {
			if (array1[i] <= array2[j]) {
				array[k] = array1[i];
				i++;
			} else {
				array[k] = array2[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = array1[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = array2[j];
			j++;
			k++;
		}
	}

	// mergesort for string

	/**
	 * @param array
	 * @param low
	 * @param high
	 *            nothing return it is give the sorted character of string
	 */
	public void stringSort(char array[], int low, int high) {
		if (low < high) {

			int middle = (low + high) / 2;

			stringSort(array, low, middle);
			stringSort(array, middle + 1, high);

			stringMerge(array, low, middle, high);
		}
	}

	/**
	 * @param array
	 * @return its a generic method for insertion sorting and it give the sorted
	 *         array and sorted string
	 */
	public <T extends Comparable<T>> T[] insertionSortString(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if ((array[j - 1]).compareTo(array[j]) > 0) {
					T temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * @param array
	 * @return its a generic method for bubbol sorting and it give the sorted array
	 *         and sorted string
	 */
	public static <T extends Comparable<T>> T[] bubbleSortInt(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;

	}

	/**
	 * @param array
	 * @param num
	 * @return generic binary search
	 */
	public <T extends Comparable<T>> T[] binarySearchInt(T[] array, T num) {
		int size = array.length;

		int start, end, mid, count = 0;

		start = 0;
		end = size - 1;

		while (start <= end) {
			mid = (start + end) / 2;
			if (num.compareTo(array[mid]) == 0) {
				System.out.println("Search found at position :" + (mid + 1));
				count++;
				break;
			}
			if (num.compareTo(array[mid]) < 0)
				end = mid - 1;
			else
				start = mid + 1;
		}
		if (count == 0)
			System.out.println("Search not found");
		return array;

	}

	public static <T> void print(T[] array, int number) {
		for (int j = 0; j < number; j++) {
			System.out.print(array[j] + " ");
		}
	}

	// read data from file
	/**
	 * @return
	 */
	public String[] readWordFromFile() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/test.text");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;

	}

	/**
	 * @return
	 */
	public String[] insertionSortFromFile() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/test.text");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;

	}

	/**
	 * @param array
	 * @param low
	 * @param middle
	 * @param high
	 *            nothing return it is work for merge array.
	 */
	public void stringMerge(char array[], int low, int middle, int high) {

		int n1 = middle - low + 1;
		int n2 = high - middle;

		int array1[] = new int[n1];
		int array2[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			array1[i] = array[low + i];
		for (int j = 0; j < n2; ++j)
			array2[j] = array[middle + 1 + j];

		int i = 0, j = 0;

		int k = low;
		while (i < n1 && j < n2) {
			if (array1[i] <= array2[j]) {
				array[k] = (char) array1[i];
				i++;
			} else {
				array[k] = (char) array2[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = (char) array1[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = (char) array2[j];
			j++;
			k++;
		}
	}

	// Vending Machine
	/**
	 * @param value
	 *            its give the number of note.
	 */
	public void vendingMachine(int value) {
		int count = 0;
		if (value > 0) {
			while (value >= 1000) {
				count++;
				value = value - 1000;
				System.out.print("1000 ");
			}
			while (value >= 500) {
				count++;
				value = value - 500;
				System.out.print("500 ");
			}
			while (value >= 100) {
				count++;
				value = value - 100;
				System.out.print("100 ");
			}
			while (value >= 50) {
				count++;
				value = value - 50;
				System.out.print("50 ");
			}
			while (value >= 10) {
				count++;
				value = value - 10;
				System.out.print("10 ");
			}
			while (value >= 5) {
				count++;
				value = value - 5;
				System.out.print("5 ");
			}
			while (value >= 2) {
				count++;
				value = value - 2;
				System.out.print("2 ");
			}
			while (value >= 1) {
				count++;
				value = value - 1;
				System.out.print("1 ");
			}
		} else {
			System.out.println("Please input right amount " + count);
		}
		System.out.println();
		if (count > 0) {
			System.out.println("Number of note " + count);
		}

	}

	// TemperaturConversion method

	/**
	 * @param temperatuer
	 * @return integer value this method is use for converting the temperature.
	 */
	public int temperaturConversiontoFarenhit(int temperatuer) {

		int F = ((temperatuer * 9 / 5) + 32);
		return F;

	}

	public int temperaturConversiontoCelcius(int temperatuer) {

		int C = ((temperatuer - 32) * 5 / 9);
		return C;

	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 *            nothing return this method is using for find the day of week
	 */
	public void dayOfWeek(int day, int month, int year) {
		int m, x, d, y;
		y = year - (14 - month) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = month + 12 * ((14 - month) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;
		switch (d) {
		case 0: {
			System.out.println("O");
			System.out.println(day + " /" + month + " /" + year + " /" + "sunday");
			break;
		}
		case 1: {
			System.out.println("1");
			System.out.println(day + " /" + month + " /" + year + " /" + "monday");
			break;
		}
		case 2: {
			System.out.println("2");
			System.out.println(day + " /" + month + " /" + year + " /" + "tuesday");
			break;
		}
		case 3: {
			System.out.println("3");
			System.out.println(day + " /" + month + " /" + year + " /" + "wensday");
			break;
		}
		case 4: {
			System.out.println("4");
			System.out.println(day + " /" + month + " /" + year + " /" + "thursday");
			break;
		}
		case 5: {
			System.out.println("5");
			System.out.println(day + " /" + month + " /" + year + " /" + "friday");
			break;
		}
		case 6: {
			System.out.println("6");
			System.out.println(day + " /" + month + " /" + year + " /" + "saturday");
			break;
		}
		}
	}

	/**
	 * @param year
	 * @param principal
	 * @param rate
	 *            nothing return calculate interest of monthly
	 */
	public void monthlyPayment(double year, double principal, double rate) {
		double payment = 0;
		double l = 100 * 12;
		double n = 12 * year;
		payment = principal * (Math.pow((1 + (rate / l)), n)) - principal;
		System.out.println("Monthly amount is " + payment);
	}

	/**
	 * @param num
	 * @return integer value it is work for converting decimal to binary number
	 */
	public int[] toBinary(int num) {
		int array[] = new int[32];
		int index = 0;

		while (num != 0) {
			array[index++] = num % 2;
			num = num / 2;

		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

		System.out.println();
		return array;

	}

	/**
	 * @param c
	 *            nothing return it is work for giving the square root of the value
	 */
	public void sqrt(double c) {
		double t1 = Math.sqrt(c);
		System.out.println(t1);
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > epsilon * t)
			;
		{
			t = ((c / t) + t) / 2.0;
		}
		System.out.println(c + "Squre of Number is :" + t);
	}

	// for right the data from file for string
	/**
	 * @param list
	 *            it is work for update the file for string value
	 */
	public void writeFileOrUpdate(LinkedList list) {
		try {
			String string = list.toString();

			FileWriter fw = new FileWriter("/home/bridgeit/abhishek-workspace/Java Programs/src/linkedlist.text");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// for right the data from file for Integer
	/**
	 * @param list
	 *            it is work for update the file for integer value
	 */
	public void writeFileOrUpdateIntegerfile(String[] array) {
		try {
			String string = "";

			for (int i = 0; i < array.length; i++) {
				string += array[i] + " ";
			}
			FileWriter fw = new FileWriter("/home/bridgeit/abhishek-workspace/Java Programs/src/linkedlist.text");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// this method is work for read words from file from

	/**
	 * @return
	 * 
	 * 		this method is work for read words from file from
	 */
	public String[] readListOfWords() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/linkedlist.text");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return string;

	}

	/**
	 * @return
	 * 
	 * 		this method is work for read integer value from file from
	 */
	public String[] readListOfInteger() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/linkedlist.text");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return string;

	}

	// BALANCED PARENTHESIS

	/**
	 * @param string
	 * @return boolean expression this method is work for balanced parentheses from
	 *         arithmetic expression.
	 */
	public boolean balancedParentheses(String string) {
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(') {
				stack.push(string.charAt(i));
				count++;
			}

			if (string.charAt(i) == ')') {
				if (stack.isEmpty()) {
					count--;
				} else {
					stack.pop();
					count--;
				}
			}
		}
		if (stack.isEmpty() && count == 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking weather string is palindrome or not

	/**
	 * @param string
	 * @param reverse
	 */
	public void checkPalindrom(String string, String reverse) {
		if (string.equals(reverse)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindome");
		}
	}
	// Popping each character from queue from rare end and append to reverse string

	/**
	 * @param array
	 * @param reverse
	 * @return
	 */
	public String popChar(ArrayDeque<Character> array, String reverse) {
		while (!array.isEmpty()) {
			reverse += array.removeLast();
		}
		return reverse;
	}

	/**
	 * @param string
	 * @param array
	 */
	public void insertChar(String string, ArrayDeque array) {
		for (int i = 0; i < string.length(); i++) {
			array.addLast(string.charAt(i));
		}
	}
	// CALENDER

	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return day of the week
	 */
	public int dayInMonth(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	// NUMBER OF BINARY TREE

	/**
	 * @param number
	 * @return
	 */
	public static long binarySearchTree(int node) {
		long sum = 0;

		if (node <= 1)
			return 1;
		else {

			for (int i = 1; i <= node; i++) {
				sum = sum + (binarySearchTree(i - 1) * binarySearchTree(node - i));
			}
		}
		return sum;

	}

	/**
	 * @param starrt
	 * @param limit
	 * @return arraylist integer
	 */
	public ArrayList<Integer> primeNumbers(int start, int limit) {
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 2; i <= limit; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primeNumbersList.add(i);
			}
		}
		return primeNumbersList;
	}

	// PrimeNumberToPrintIn2DArray

	/**
	 * @param arr
	 *            its store prime numbers in 2D array
	 */
	public <T> void print2DArray(ArrayList<T> arr) {
		int[][] arr1 = new int[10][25];
		int res = 0;
		int i = 0;
		int j = 0;
		@SuppressWarnings("unchecked")
		Iterator<Integer> iterator = (Iterator<Integer>) arr.iterator();
		while (iterator.hasNext()) {
			int ele = iterator.next();
			int l = ele / 100;
			if (l != res) {
				res = l;
				i++;
				j = 0;
			}
			arr1[i][j++] = ele;
		}
		for (int m = 0; m < arr1.length; m++) {
			for (int n = 0; n < arr1[m].length; n++) {
				if (arr1[m][n] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(arr1[m][n] + " ");
				}
			}
			System.out.println();
		}
	}

	// Object oriented programs

	/**
	 * it is work for read the data file form system.
	 */
	public static void readingData() {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/InventoryDetails.json");
		FileReader fr;
		try {
			fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(fr);
			Iterator<?> iterator = obj.keySet().iterator();
			while (iterator.hasNext()) {
				String topkey = (String) iterator.next();
				JSONObject jsonObject1 = (JSONObject) obj.get(topkey);
				Iterator<?> iterator1 = jsonObject1.keySet().iterator();

				while (iterator1.hasNext()) {
					String key = (String) iterator1.next();
					System.out.println(key + " : " + jsonObject1.get(key));
				}
				System.out.println("The Toatal cost of " + jsonObject1.get("Name") + " is: "
						+ Integer.parseInt(jsonObject1.get("Price").toString())
						* Integer.parseInt(jsonObject1.get("Weight").toString()));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * for data file writing.
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void writingData() throws IOException {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/InventoryDetails.json");

		FileWriter fw = new FileWriter(file);
		JSONObject object1 = new JSONObject();
		JSONObject object2 = new JSONObject();
		JSONObject object3 = new JSONObject();

		System.out.println("enter Rice name ");
		String riceName = scanner.next();
		System.out.println("enter Rice weight ");
		int riceWeight = scanner.nextInt();
		System.out.println("enter Rice Price ");
		int ricePrice = scanner.nextInt();

		System.out.println("enter Pulse name ");
		String pulseName = scanner.next();
		System.out.println("enter Pulse weight ");
		int pulseWeight = scanner.nextInt();
		System.out.println("enter Pulse Price ");
		int pulsePrice = scanner.nextInt();

		System.out.println("enter Wheat name ");
		String wheatName = scanner.next();
		System.out.println("enter Wheat weight ");
		int wheatWeight = scanner.nextInt();
		System.out.println("enter Wheat Price ");
		int wheatPrice = scanner.nextInt();

		object1.put("Name", riceName);
		object1.put("Weight", riceWeight);
		object1.put("Price", ricePrice);

		object2.put("Name", pulseName);
		object2.put("Weight", pulseWeight);
		object2.put("Price", pulsePrice);

		object3.put("Name", wheatName);
		object3.put("Weight", wheatWeight);
		object3.put("Price", wheatPrice);
		JSONObject items = new JSONObject();

		items.put("Rice", object1);
		items.put("Pulses", object2);
		items.put("Wheat", object3);

		fw.write(JSONValue.toJSONString(items));
		fw.flush();
		fw.close();

	}

	// Stock Report
	/**
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void calculateStockReport() {

		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/stockReport.json");

		try {
			FileReader fr = new FileReader(file);

			JSONParser parser = new JSONParser();

			JSONArray arr = (JSONArray) parser.parse(fr);
			long total = 0;
			Iterator<?> itr = arr.iterator();
			while (itr.hasNext()) {
				JSONObject obj = (JSONObject) itr.next();
				Iterator<?> iterator = obj.keySet().iterator();
				while (iterator.hasNext()) {
					String topkey = (String) iterator.next();
					JSONObject jsonObject1 = (JSONObject) obj.get(topkey);
					System.out.println("Company Name: " + topkey);
					long price = (long) jsonObject1.get("Price");
					long shares = (long) jsonObject1.get("NumShare");
					total += price * shares;
					System.out.println("Share price: " + price);
					System.out.println("Number of Shares: " + shares);
					System.out.println("Total cost: " + (price * shares));
				}
			}
			System.out.println("Total cost of share is : " + total);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void createAcc() {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo.json");
		if (file.exists()) {
			@SuppressWarnings("unused")
			JSONArray arr = new JSONArray();
			Scanner scan1 = new Scanner(System.in);
			boolean check = true;
			while (check == true) {
				System.out.println("Want to add user: y or n");
				char ch = scan1.next().charAt(0);
				if (ch == 'y') {
					Scanner scan = new Scanner(System.in);

					try {
						FileReader fr = new FileReader(file);

						JSONParser parser = new JSONParser();
						JSONArray arr1 = (JSONArray) parser.parse(fr);
						JSONObject json = new JSONObject();
						System.out.println("Enter name");
						String name = scan.nextLine();
						System.out.println("Enter balance");
						int bal = scan.nextInt();
						json.put("Name", name);
						json.put("Balance", bal);
						json.put("ShareCount", 100);

						arr1.add(json);
						FileWriter fw = new FileWriter(file);
						fw.write(JSONArray.toJSONString(arr1));
						fw.flush();
						fw.close();

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					check = false;
				}
			}

		} else {
			System.out.println("File does not exits");
		}
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void buyShare() {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo.json");
		File file1 = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo1.json");
		if (file.exists() && file1.exists()) {
			Scanner scan = new Scanner(System.in);
			// reading stock file

			try {
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray stock = (JSONArray) parser.parse(fr);
				// reading share file

				FileReader sf = new FileReader(file1);
				JSONParser parser1 = new JSONParser();
				JSONArray share = (JSONArray) parser1.parse(sf);

				System.out.println("Enter the user");
				String name = scan.nextLine();
				Iterator<?> itr = stock.iterator();
				Iterator<?> itr1 = share.iterator();
				boolean flag = false;
				while (itr.hasNext()) {
					JSONObject obj = (JSONObject) itr.next();
					if (obj.get("Name").equals(name)) {
						System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
						String sym = scan.nextLine();
						/*
						 * obj.put("Share symbol", sym); if(obj.get("Share Symbol").equals(sym)) {
						 */
						while (itr1.hasNext()) {
							JSONObject obj1 = (JSONObject) itr1.next();
							if (obj1.get("Symbol").equals(sym)) {
								System.out.println("Enter the amount");
								int amt = scan.nextInt();
								int bal = Integer.parseInt(obj.get("Balance").toString());
								int price = Integer.parseInt(obj1.get("Price").toString());
								int noShare = Integer.parseInt(obj.get("ShareCount").toString());
								int stockShare = Integer.parseInt(obj1.get("Count").toString());
								int numofshare = amt / price;
								int newbal = bal - amt;
								int sharecountcus = noShare + numofshare;
								int sharecountstock = stockShare - numofshare;
								obj.remove("Balance");
								obj.remove("ShareCount");
								obj1.remove("Count");

								obj.put("Balance", newbal);
								obj.put("ShareCount", sharecountcus);
								obj1.put("Count", sharecountstock);
								Date d = new Date();
								String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
								System.out.println("Date " + date);
								flag = true;
								break;
							}
						}

					}
					FileWriter fs = new FileWriter(file);
					fs.write(JSONValue.toJSONString(stock));
					fs.flush();
					fs.close();
				}
				if (flag == false) {
					System.out.println("User name not exits");
				}
				FileWriter fw = new FileWriter(file1);
				fw.write(JSONValue.toJSONString(share));
				fw.flush();
				fw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exits");
		}

	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void saleShare() {

		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo.json");
		File file1 = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo1.json");
		if (file.exists() && file1.exists()) {
			Scanner scan = new Scanner(System.in);
			// reading stock file
			FileReader fr;
			try {
				fr = new FileReader(file);

				JSONParser parser = new JSONParser();
				JSONArray stock = (JSONArray) parser.parse(fr);
				// reading share file

				FileReader sf = new FileReader(file1);
				JSONParser parser1 = new JSONParser();
				JSONArray share = (JSONArray) parser1.parse(sf);

				System.out.println("Enter the user");
				String name = scan.nextLine();
				Iterator<?> itr = stock.iterator();
				Iterator<?> itr1 = share.iterator();
				boolean flag = false;
				while (itr.hasNext()) {
					JSONObject obj = (JSONObject) itr.next();
					if (obj.get("Name").equals(name)) {
						System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
						String sym = scan.nextLine();
						System.out.println("Enter the number of share to sale");
						int count = scan.nextInt();
						// obj.put("Share Symbol", sym);
						while (itr1.hasNext()) {
							JSONObject obj1 = (JSONObject) itr1.next();
							if (obj1.get("Symbol").equals(sym)) {
								int bal = Integer.parseInt(obj.get("Balance").toString());
								int price = Integer.parseInt(obj1.get("Price").toString());
								int noShare = Integer.parseInt(obj.get("ShareCount").toString());
								int stockShare = Integer.parseInt(obj1.get("Count").toString());
								int saleprize = count * price;
								int newbal = bal + saleprize;
								int sharecountcus = noShare - count;
								int sharecountstock = stockShare + count;
								obj.remove("Balance");
								obj.remove("ShareCount");
								obj1.remove("Count");

								obj.put("Balance", newbal);
								obj.put("ShareCount", sharecountcus);
								obj1.put("Count", sharecountstock);
								Date d = new Date();
								String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
								System.out.println("Date " + date);
								flag = true;
								break;
							}

						}
					}

					FileWriter fs = new FileWriter(file);
					try {
						fs.write(JSONValue.toJSONString(stock));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					fs.flush();
					fs.close();
				}
				if (flag == false) {
					System.out.println("User name not exits");
				}
				FileWriter fw = new FileWriter(file1);
				fw.write(JSONValue.toJSONString(share));
				fw.flush();
				fw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			System.out.println("File Does not exits");
		}
	}

	// Share and Stock report
	/**
	 * @param <E>
	 * @throws IOException
	 * @throws ParseException
	 *             display the details
	 */
	@SuppressWarnings("unchecked")
	public static <E> void display() {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Demo.json");

		try {
			FileReader fr = new FileReader(file);

			JSONParser parser = new JSONParser();
			JSONArray arr1 = (JSONArray) parser.parse(fr);
			Iterator<E> itr = arr1.iterator();
			while (itr.hasNext()) {
				JSONObject obj = (JSONObject) itr.next();
				System.out.println(obj);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DECKOFCARD
	/**
	 * @param deck
	 *            to initialize deck array
	 */
	public void initialize(int[] deck) {
		// Initialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

	}

	/**
	 * @param deck
	 *            to shuffle card
	 * @return shuffles array
	 */
	public int[] shuffleCards(int[] deck) {
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int index = i + (int) (Math.random() * (52 - i));
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
			// System.out.println(i+"->"+index);
		}
		return deck;
	}

	/**
	 * @param arr
	 * @param deck
	 * @param suits
	 * @param ranks
	 *            to generate unique cards
	 */
	public void generateCard(String[] arr, int[] deck, String[] suits, String[] ranks) {
		for (int i = 0; i < 52; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			arr[i] = (rank + "->" + suit);
		}
	}

	/**
	 * @param deck
	 * @param arr
	 *            to distribute cards
	 */

	public void distribute(int[] deck, String[] arr) {
		String arr1[][] = new String[4][9];
		Random r = new Random();
		int m = deck.length;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				int a = r.nextInt(m);
				arr1[i][j] = arr[a];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Player" + (i + 1) + ": ");
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		for (String outer[] : arr1) {
			Arrays.sort(outer);

			for (String integer : outer) {
				System.out.print(integer + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Purpose: Convert Binary And Add Padding For converting 8 bit Number
	 * 
	 * @param num
	 * @return
	 */
	public String binaryAddPadding(int num) {
		String bin[] = { "0", "1" };
		String binary = " ";
		int pading = 0;
		while ((num > 0) || (pading % 8 != 0)) {
			int rem = num % 2;
			binary = bin[rem] + binary;
			num = num / 2;
			pading++;
			if (pading % 4 == 0 && num != 0) {
				binary = " " + binary;
			}
		}
		return binary;

	}

	/**
	 * Purpose: Swap Nibbles
	 * 
	 * @param binary
	 * @return
	 */
	public String swapNibbles(String binary) {
		binary = binary.replaceAll("", "");
		String Lower_NIBBELE = binary.substring(0, 4);
		String UPPER_NIBBELE = binary.substring(4, 8);
		String SwapingBinary = UPPER_NIBBELE + Lower_NIBBELE;
		return SwapingBinary;
	}

	public static String[] readFile(String filePath) {
		String[] words = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[];
		BufferedReader bufferedReader;
		FileReader file;

		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) {
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++) {
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return words;
	}

	public static <T> void writeFileinteger(T search) {
		String string = search.toString();
		System.out.println(string);
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/abhishek-workspace/Java Programs/src/writehashing.text");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(string);

			write.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static <E> boolean anagramForQueue(String string1, String string2) {
		boolean status = true;

		if (string1.length() != string2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = string1.toCharArray();
			Arrays.sort(ArrayS1);
			char ArrayS2[] = string2.toCharArray();
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);

		}
		if (status) {

			return true;
		} else {

			return false;
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void hashing(String[] words) {

		HashMap<Integer, LinkedList> hashmap = new HashMap<Integer, LinkedList>();
		int hash = 0;
		int hasharray[] = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			hasharray[i] = Integer.parseInt(words[i]);
		}
		for (int i = 0; i < hasharray.length; i++) {
			hash = hasharray[i] % 11;
			if (hashmap.containsKey(hash)) {

				LinkedList linkedlist = hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			} else {
				hashmap.put(hash, new LinkedList());
				LinkedList linkedlist = hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			}
		}
		System.out.println("Enter the key to search");
		int search = scanner.nextInt();
		hash = search % 11;

		if (hashmap.containsKey(hash)) {

			LinkedList linkedlist = hashmap.get(hash);
			if (linkedlist.search(search)) {
				linkedlist.remove(search);
				Utility.writeFileinteger(hashmap);

				System.out.println(search + " Element found and removed from the list");

			} else {

				linkedlist.add(search);
				System.out.println(search + "element Not found and added to the list");
				Utility.writeFileinteger(hashmap);
			}
		} else {
			hashmap.put(hash, new LinkedList());
			LinkedList linkedlist = hashmap.get(hash);
			linkedlist.add(search);
			Utility.writeFileinteger(hashmap);

		}
		Set<Integer> keys = hashmap.keySet();
		for (Integer key1 : keys) {
			LinkedList value = hashmap.get(key1);
			System.out.print(key1 + "->");
			value.display();
			System.out.println();
		}

	}

	public static void queueAnagram(int[] strArray) {
		// TODO Auto-generated method stub
		QueueStructure queue = new QueueStructure();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (Utility.anagramForQueue(strArray[i] + " ", strArray[j] + " ")) {
					queue.insert(strArray[i]);
					queue.insert(strArray[j]);
				}
			}
		}
		queue.print();

	}

	public static ArrayList<Integer> primeNumber() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			int flag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}

			}

			if (flag == 0) {
				System.out.print(i + " ");
				list.add(i);
			}

		}
		return list;

	}

	/**
	 * @param num
	 * @param num1
	 * @return
	 */
	public static boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}

	/**
	 * @param arrayList
	 * @return anagram array list
	 */
	public static TreeSet<Integer> anagramInArraylist(ArrayList<Integer> arrayList) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (anagramNum(arrayList.get(i), arrayList.get(j))) {
					treeSet.add(arrayList.get(i));
					treeSet.add(arrayList.get(j));
				}
			}
		}
		return treeSet;
	}

	/**
	 * @param treeset
	 *            it is work for print anagram in 2D Array
	 */
	public static void twoDimentionlPrimeAnagramNumber(TreeSet<Integer> treeset) {

		int row = 0, column = 0, i, j, number = 100;
		Object integerArray[] = treeset.toArray();
		String stringArray[][] = new String[10][25];
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 25; j++) {
				stringArray[i][j] = "";
			}
		}
		for (i = 0; i < integerArray.length; i++) {
			int temperaroy = (int) integerArray[i];
			if (temperaroy > number) {
				number = number + 100;
				row++;
				column = 0;
			}
			stringArray[row][column++] = Integer.toString(temperaroy);
		}

		System.out.println("Anagram numbers are: ");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 25; j++) {
				System.out.print(stringArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * @return Add doctors record by name, id, specialization and availability
	 * @throws IOException
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void addDoctors() throws IOException, Exception {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json");
		FileReader filereader = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONArray array1 = (JSONArray) parser.parse(filereader);
		JSONObject json = new JSONObject();
		System.out.println("Enter number of doctors :");
		int num0fDoctor = inputInteger();

		for (int i = 0; i < num0fDoctor; i++) {

			System.out.println("Enter name of doctor");
			String name = inputString();
			json.put("Doctor_Name", name);
			System.out.println("Enter I.D doctor");
			String id = inputString();
			json.put("Doctor_ID", id);
			System.out.println("Enter Specialization of doctor");
			String specilization = scanner.next();
			json.put("Doctor_Specialization", specilization);
			System.out.println("Enter Availablity of doctor");
			String available = scanner.next();
			json.put("Doctor_Availiablity", available);
			array1.add(json);
		}
		try {
			System.out.println("Data has been uploaded :");
			FileWriter jsonFileWriter = new FileWriter(file);
			jsonFileWriter.write(JSONArray.toJSONString(array1));
			jsonFileWriter.flush();
			jsonFileWriter.close();
			System.out.println("Doctor Added:" + array1);
		} catch (IOException e) {
			System.out.println("exception");
		}
	}

	/**
	 * Add Patients record by name, id,mobile number and age
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	public void addPatients() throws IOException, Exception {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json");
		FileReader filereader = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONArray array1 = (JSONArray) parser.parse(filereader);
		JSONObject json1 = new JSONObject();
		System.out.println("Enter number of Patients: ");
		int num0fPatients = inputInteger();
		for (int i = 0; i < num0fPatients; i++) {

			System.out.println("Enter name of Patient");
			String name = inputString();
			json1.put("Patient_Name", name);

			System.out.println("Enter I.D Patient");
			String id = inputString();
			json1.put("Patient_ID", id);

			System.out.println("Enter mobile number of Patient");
			long mobileNumber = scanner.nextLong();
			json1.put("Patient_mobileNumber", mobileNumber);

			System.out.println("Enter  Patient age");
			int age = inputInteger();
			json1.put("Patient_ID", age);
			array1.add(json1);
		}
		try {
			System.out.println("Data has been uploaded :");
			FileWriter jsonFileWriter = new FileWriter(file);
			jsonFileWriter.write(JSONArray.toJSONString(array1));
			jsonFileWriter.flush();
			jsonFileWriter.close();
			System.out.println("Patient Added:" + array1);
		} catch (IOException e) {
			System.out.println("exception");

		}

	}

	/**
	 * @throws Exception
	 *             search Doctor by there name
	 */
	public void searchDoctor() throws Exception {

		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json"));
			System.out.println("Search Doctor_Name :");
			String name = inputString();
			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		} catch (IOException e) {
			System.out.println("exception");
		}
	}

	public void searchDoctorm() throws Exception {

		System.out.println("enter the choice");
		System.out.println("1.search doctor by name");
		System.out.println("2.search doctor by id");
		System.out.println("3.search doctor by specialization");
		System.out.println("4.search doctor by availability");
		int choice = inputInteger();
		switch (choice) {
		case 1:
			searchbyName();
			break;
		case 2:
			searchbyID();
			break;
		case 3:
			searchbySpecialization();
			break;
		case 4:
			searchbyAvailability();
			break;
		default:
			System.out.println("invalid");

		}
	}

	/**
	 * @throws Exception
	 *             search by Name
	 */
	public void searchbyName() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json"));
			System.out.println("Search Doctor_name :");
			String name = inputString();

			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_Name").equals(name)) {

					System.out.println("Doctor_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		}

		catch (IOException e) {
			System.out.println("exception");
		}

	}

	/**
	 * @throws Exception
	 *             search by ID
	 */
	public void searchbyID() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json"));
			System.out.println("Search doctor_ID :");
			String id = inputString();
			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_ID").equals(id)) {

					System.out.println("doctar_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		}

		catch (IOException e) {
			System.out.println("exception");
		}

	}

	/**
	 * @throws Exception
	 *             search doctor by Specialization
	 */
	public void searchbySpecialization() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json"));
			System.out.println("Search doctor by specialization:");
			String name = inputString();

			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_Specialization").equals(name)) {

					System.out.println("Doctor_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		} catch (Exception e) {
			System.out.println(" ");
		}
	}

	/**
	 * @throws Exception
	 *             search doctor by Availability
	 */
	public void searchbyAvailability() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json"));
			System.out.println("Search doctor by availability :");
			String name = inputString();

			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_Availiablity").equals(name)) {

					System.out.println("doctor_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		} catch (IOException e) {
			System.out.println("exception");
		}
	}

	/**
	 * @throws Exception
	 * 
	 *             search patient by there name
	 */
	public void searchPatient() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json"));
			System.out.println("Search Patient_Name :");
			String name = inputString();

			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Patient_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		}

		catch (IOException e) {
			System.out.println("exception");
		}

	}

	/**
	 * @throws Exception
	 *             search Patient by Name
	 */
	public static void searchPatientbyName() throws Exception {
		try {
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/Patient.json"));
			System.out.println("Search Patient_Name :");
			String name = scanner.next();

			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Patient_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

				} else {
					flag = false;
				}

			}
		}

		catch (IOException e) {
			System.out.println("exception");
		}

	}

	
	/**
	 * take an appointment of doctor with date and generate report
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void takeAppointment1() throws IOException, Exception {
		File file = new File("/home/bridgeit/abhishek-workspace/Java Programs/src/doctor.json");
		FileReader filereader = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONArray array1 = (JSONArray) parser.parse(filereader);
		System.out.println("Please enter Patient_Name");
		String patient_name = inputString();
		System.out.println("Enter the date for appointment");
		String stringDate = inputString();
		System.out.println("Enter Doctor name for to take an Appointment");
		String doctername = inputString();

		String docInfo = null;
		try {
			JSONArray array = (JSONArray) parser.parse(new FileReader(file));
			Iterator itr = array.iterator();

			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject jsonobject = (JSONObject) itr.next();
				if (jsonobject.get("Doctor_Name").equals(doctername)) {

					System.out.println("Doctor_founded" + jsonobject);

				}

				flag = false;
			}
			docInfo = doctername;

			JSONArray array2 = new JSONArray();

			JSONObject r = (JSONObject) parser
					.parse(new FileReader("/home/bridgeit/abhishek-workspace/Java Programs/src/Appointment.json"));
			JSONArray appointmentFileObj = (JSONArray) r.get("Doctor_name");
			JSONObject obj1 = new JSONObject();

			if ((obj1.containsKey(doctername)) && (appointmentFileObj.size() < 5)) {

				obj1.put("Doctor_name", doctername);

				obj1.put("Patient_Name", patient_name);
				obj1.put("Booking Date ", (stringDate));
				appointmentFileObj.add(obj1);
				r.put("Doctor_name", appointmentFileObj);
				FileWriter filewriter = new FileWriter(
						"/home/bridgeit/abhishek-workspace/Java Programs/src/Appointment.json");
				filewriter.write(JSONObject.toJSONString(r));
				filewriter.flush();
				filewriter.close();
			}
			System.out.println("hello " + patient_name + " Your Appointment is fixed  With Doctor " + docInfo + " on: "
					+ (stringDate));

		} catch (IOException e) {
			System.out.println("exception");
		}
	}

	/**
	 * @param filename
	 * @return
	 */
	public static JSONObject readFromJsonFile1(String filename) {
		Object obj;
		JSONObject jsonObject = null;
		try {
			obj = new JSONParser().parse(new FileReader(filename));
			jsonObject = (JSONObject) obj;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		return jsonObject;
	}

	/**
	 * @param fileName
	 * @param jsonObject
	 */
	public static void writeJsonObjectToFile2(String fileName, JSONObject jsonObject) {
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(fileName);
			printWriter.write(jsonObject.toJSONString());
			printWriter.flush();
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return
	 */
	Queue cardQueue = new java.util.LinkedList<>();

	public String[] assignDeckOfCards() {
		String[] suit = { "Club", "Diamond", "Heart", "Spade" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] deckOfCards = new String[52];
		int index = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCards[index++] = suit[i] + " " + rank[j];
			}
		}
		return deckOfCards;
	}

	/**
	 * @param deckCards
	 * @return
	 */
	public String[] shuffle(String[] deckCards) {
		for (int i = 0; i < deckCards.length; i++) {
			int random = (int) (Math.random() * (52));
			String temp = deckCards[i];
			deckCards[i] = deckCards[random];
			deckCards[random] = temp;
		}
		return deckCards;
	}

	/**
	 * @param deckOfShuffleCards
	 * @param noOfPlayers
	 * @param noOfCards
	 * @return
	 */
	public String[][] distribute(String[] deckOfShuffleCards, int noOfPlayers, int noOfCards) {
		int index = 0;
		String[][] distributedCards = new String[noOfPlayers][noOfCards];
		for (int i = 0; i < noOfPlayers; i++) {
			for (int j = 0; j < noOfCards; j++) {
				distributedCards[i][j] = deckOfShuffleCards[index++];
			}
		}
		return distributedCards;
	}

	/**
	 * @param cardsOfPlayers
	 * @param noOfPlayers
	 * @param noOfCards
	 */
	public void printDistibutedCards(String[][] cardsOfPlayers, int noOfPlayers, int noOfCards) {
		for (int i = 0; i < noOfPlayers; i++) {
			System.out.println("Cards of player " + (i + 1) + " are as follows :");
			for (int j = 0; j < noOfCards; j++) {
				System.out.println(cardsOfPlayers[i][j]);
			}
			System.out.println();
		}
	}

	private void sort(String[] cards) {
		char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				String card = cards[j];
				char cardRank = card.charAt(card.length() - 1);
				if (cardRank == rank[i])
					cardQueue.add(card);
			}
		}
	}

	/**
	 * @param playerCards
	 * @param noOfPlayers
	 * @param noOfCards
	 */
	public void printSortedCards(String[][] playerCards, int noOfPlayers, int noOfCards) {
		String[] cards = new String[noOfCards];
		for (int i = 0; i < noOfPlayers; i++) {
			for (int j = 0; j < noOfCards; j++) {
				cards[j] = playerCards[i][j];
			}
			cardQueue.add("Cards Of Player " + (i + 1) + " are as follows..");
			sort(cards);
		}
		printSortedQueue(cardQueue);
	}

	private void printSortedQueue(Queue cardQueue2) {
		for (int i = 0; i < 40; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.println(cardQueue2.remove());
		}

	}

}
