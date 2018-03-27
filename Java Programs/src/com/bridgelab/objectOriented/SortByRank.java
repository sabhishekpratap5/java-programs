/******************************************************************************
 *  Purpose: Sort by Rank of Deck of Cards 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import com.bridgelab.utility.Utility;

public class SortByRank {

	public static void main(String[] args) {
		int noOfPlayers = 4;
		int noOfCards = 9;
		Utility utility = new Utility();

		String[] deckOfCards = utility.assignDeckOfCards();

		String[] deckOfShuffleCards = utility.shuffle(deckOfCards);

		String[][] playerCards = utility.distribute(deckOfShuffleCards, noOfPlayers, noOfCards);

		System.out.println("Cards before sorting...");
		System.out.println();

		utility.printDistibutedCards(playerCards, noOfPlayers, noOfCards);

		System.out.println("Cards after sorting...");

		utility.printSortedCards(playerCards, noOfPlayers, noOfCards);

	}

}
