package com.bridgelab.functionalPrograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class TicTacToe {
	private String[][] board;
	static String player1 = "X";
	static String player2 = "O";

	public TicTacToe() {
		// class constructor
		board = new String[3][3];
	}

	public static void main(String[] args) {

		TicTacToe t = new TicTacToe(); // allocate a board
		Scanner s = new Scanner(System.in); // read from standard in
		int moves = 0;
		System.out.println("Begin X start first.");
		t.printBoard();
		while (moves < 9) {
			// for X player
			t.makeMove(s, player1);
			moves++;
			if (moves > 4) {
				if (t.checkWinner(player1)) {
					System.out.println(player1 + " You Win!!!");
					break;
				}
			}
			t.printBoard();
			// 0 Player
			t.makeMove(s, player2);
			moves++;
			if (moves > 4) {
				if (t.checkWinner(player2)) {
					System.out.println(player2 + " You Win!!!");
					break;
				}
			}
			t.printBoard();
		}
	}

	// Print out the tictactoe board
	public void printBoard() {
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == null) {
					System.out.print("_");
				} else {
					System.out.print(board[i][j]);
				}
				if (j < 2) {
					System.out.print("|");
				} else {
					System.out.println();
				}
			}
		}
		System.out.println();
	}

	public Boolean checkWinner(String play) {
		int playInRow = 0;
		int playD1 = 0;
		int playD2 = 0;
		int[] playInColumn = new int[board[0].length];
		for (int i = 0; i < board.length; i++) {
			playInRow = 0;
			for (int j = 0; j < board[i].length; j++) {
				if (null == board[i][j]) {
					continue;
				}
				if (board[i][j].equals(play)) {
					playInRow++;
					playInColumn[j]++;
					if (i == j) {
						playD1++;
					} else if (2 == i + j) {
						playD2++;
					}
				}

			}
			if (playInRow == 3) {
				return true;
			}
		}
		if (3 == playD1 || 3 == playD2) {
			return true;
		}
		for (int i = 0; i < playInColumn.length; i++) {
			if (playInColumn[i] == 3) {
				return true;
			}
		}
		return false;
	}

	public void makeMove(Scanner s, String play) {
		int r;
		int c;
		Boolean done = false;
		while (!done) {
			r = -1;
			c = -1;
			if (play.equals("O")) {
				r = (int) (Math.random() * 3);
				c = (int) (Math.random() * 3);
				board[r][c] = play;
				return;
			} else {
				System.out.println("Enter coordinates to play your " + play);
				if (s.hasNextInt()) {
					r = s.nextInt();
				}
				if (s.hasNextInt()) {
					c = s.nextInt();
				} else {
					s.nextLine();
					System.out.println("Both inputs must be integers between 0 and 2.");
					continue;
				}

				if ((r < 0) || (r > 2) || (c < 0) || (c > 2)) {
					System.out.println("Both inputs must be integers between 0 and 2.");
					continue;
				}

				else if (board[r][c] != null) {
					System.out.println("That location is occupied");
					continue;
				} else {
					board[r][c] = play;
					return;
				}
			}
		}

		
	}

}