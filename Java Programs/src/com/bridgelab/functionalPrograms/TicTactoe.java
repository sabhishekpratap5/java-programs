package com.bridgelab.functionalPrograms;
/******************************************************************************  
 *  Purpose: Tic tac toe game
 *  @author Abhishek Pratap Singh
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import java.util.Random;
import com.bridgelab.utility.Utility;

public class TicTactoe 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		TicTactoe tictactoe = new TicTactoe();
		String stringArray[][] = new String[3][3];

		stringArray[0][0] = "1";
		stringArray[0][1] = "2";
		stringArray[0][2] = "3";
		stringArray[1][0] = "4";
		stringArray[1][1] = "5";
		stringArray[1][2] = "6";
		stringArray[2][0] = "7";
		stringArray[2][1] = "8";
		stringArray[2][2] = "9";

		Utility.displayArray(stringArray);

		while (tictactoe.li <= 9) {
			// System.out.println(cg.i);

			if (tictactoe.li % 2 == 0)
			{
				Random random = new Random();
				int lNumber = random.nextInt(9);

				if (lNumber != 0 && tictactoe.checkDuplicate(lNumber)) 
				{
					tictactoe.computerTurn(stringArray, lNumber);
					tictactoe.computerWinTest(stringArray);
				}

			} else 
			{
				System.out.println("Enter your box Number");
				int lBoxNumber = utility.inputInteger();
				if (tictactoe.checkDuplicate(lBoxNumber)) {

					tictactoe.userTurn(stringArray, lBoxNumber);
					tictactoe.userWinTest(stringArray);
				} else {
					System.out.println("This box is Already filled");
				}
				System.out.println("----------------------------");
			}
		}

		System.out.println("Match Drawn!!!");
		
	}

	public void computerTurn(String[][] stringArray, int lBoxNumber) {

		System.out.println("coumputer takes: " + lBoxNumber);

		if (lBoxNumber == 1 && stringArray[0][0] != "X" && stringArray[0][0] != "U")
			stringArray[0][0] = "X";

		else if (lBoxNumber == 2 && stringArray[0][1] != "X" && stringArray[0][1] != "U")
			stringArray[0][1] = "X";

		else if (lBoxNumber == 3 && stringArray[0][2] != "X" && stringArray[0][2] != "U")
			stringArray[0][2] = "X";

		else if (lBoxNumber == 4 && stringArray[1][0] != "X" && stringArray[1][0] != "U")
			stringArray[1][0] = "X";

		else if (lBoxNumber == 5 && stringArray[1][1] != "X" && stringArray[1][1] != "U")
			stringArray[1][1] = "X";

		else if (lBoxNumber == 6 && stringArray[1][2] != "X" && stringArray[1][2] != "U")
			stringArray[1][2] = "X";

		else if (lBoxNumber == 7 && stringArray[2][0] != "X" && stringArray[2][0] != "U")
			stringArray[2][0] = "X";

		else if (lBoxNumber == 8 && stringArray[2][1] != "X" && stringArray[2][1] != "U")
			stringArray[2][1] = "X";

		else if (lBoxNumber == 9 && stringArray[2][2] != "X" && stringArray[2][2] != "U")
			stringArray[2][2] = "X";

		System.out.println("Coumpeter turn over");
		System.out.println("----------------------------\n\n");
		Utility.displayArray(stringArray);
	}

	public void userTurn(String[][] stringArray, int lBoxNumber) {
		checkDuplicate(lBoxNumber);

		if (lBoxNumber == 1 && stringArray[0][0] != "X" && stringArray[0][0] != "U")
			stringArray[0][0] = "U";

		else if (lBoxNumber == 2 && stringArray[0][1] != "X" && stringArray[0][1] != "U")
			stringArray[0][1] = "U";

		else if (lBoxNumber == 3 && stringArray[0][2] != "X" && stringArray[0][2] != "U")
			stringArray[0][2] = "U";

		else if (lBoxNumber == 4 && stringArray[1][0] != "X" && stringArray[1][0] != "U")
			stringArray[1][0] = "U";

		else if (lBoxNumber == 5 && stringArray[1][1] != "X" && stringArray[1][1] != "U")
			stringArray[1][1] = "U";

		else if (lBoxNumber == 6 && stringArray[1][2] != "X" && stringArray[1][2] != "U")
			stringArray[1][2] = "U";

		else if (lBoxNumber == 7 && stringArray[2][0] != "X" && stringArray[2][0] != "U")
			stringArray[2][0] = "U";

		else if (lBoxNumber == 8 && stringArray[2][1] != "X" && stringArray[2][1] != "U")
			stringArray[2][1] = "U";

		else if (lBoxNumber == 9 && stringArray[2][2] != "X" && stringArray[2][2] != "U")
			stringArray[2][2] = "U";

		Utility.displayArray(stringArray);				
	}

	

	public void userWinTest(String[][] stringArray) 
	{
		if (stringArray[0][0] == "U" && stringArray[0][1] == "U" && stringArray[0][2] == "U"
				|| (stringArray[1][0] == "U" && stringArray[1][1] == "U" && stringArray[1][2] == "U")
				|| (stringArray[2][0] == "U" && stringArray[2][1] == "U" && stringArray[2][2] == "U")
				|| (stringArray[0][0] == "U" && stringArray[1][0] == "U" && stringArray[2][0] == "U")
				|| (stringArray[0][1] == "U" && stringArray[1][1] == "U" && stringArray[2][1] == "U")
				|| (stringArray[0][2] == "U" && stringArray[1][2] == "U" && stringArray[2][2] == "U")
				|| (stringArray[0][0] == "U" && stringArray[1][1] == "U" && stringArray[2][2] == "U")
				|| (stringArray[0][2] == "U" && stringArray[1][1] == "U" && stringArray[2][0] == "U")) {
			System.out.println("You Won!!");
			System.exit(0);
		}
	}

	public void computerWinTest(String[][] stringArray)
	{
		if (stringArray[0][0] == "X" && stringArray[0][1] == "X" && stringArray[0][2] == "X"
				|| (stringArray[1][0] == "X" && stringArray[1][1] == "X" && stringArray[1][2] == "X")
				|| (stringArray[2][0] == "X" && stringArray[2][1] == "X" && stringArray[2][2] == "X")
				|| (stringArray[0][0] == "X" && stringArray[1][0] == "X" && stringArray[2][0] == "X")
				|| (stringArray[0][1] == "X" && stringArray[1][1] == "X" && stringArray[2][1] == "X")
				|| (stringArray[0][2] == "X" && stringArray[1][2] == "X" && stringArray[2][2] == "X")
				|| (stringArray[0][0] == "X" && stringArray[1][1] == "X" && stringArray[2][2] == "X")
				|| (stringArray[0][2] == "X" && stringArray[1][1] == "X" && stringArray[2][0] == "X")) 
		{
			System.out.println("Computer Won");
			System.exit(0);
		}
	}

	int li = 0;
	int[] storeArray = new int[9];

	public boolean checkDuplicate(int lBoxNumber) 
	{
		for (int j = 0; j < li; j++)
		{
			
			if (storeArray[j] == lBoxNumber) {
				return false;
			}
		}
		storeArray[li] = lBoxNumber;
		if (li <= 9)
			li++;

		return true;
	}
	
}
