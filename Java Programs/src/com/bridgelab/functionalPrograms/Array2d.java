/******************************************************************************
 *  Purpose:for find out the 2D matrix 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;
import java.io.PrintWriter;

public class Array2d {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter number of rows ");
		int m = utility.inputInteger();
		System.out.println("enter number of columns ");
		int n = utility.inputInteger();

		int a[][] = arrayInt(m, n);
		double b[][] = arrayDouble(m, n);
		String c[][] = arrayBoolean(m, n);

		display(a, b, c, m, n);

	}

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
}
