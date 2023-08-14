package numberGuessingGame;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//generate number
		int correctNum = numGenerator();

		//greet user and have them guess nubmer
		System.out.println("Welcome to my program!!");
		System.out.println("We will play a number guessing game.");
		System.out.println("If you guess too high or too low, you will be notified and have unlimeted chances.");
		System.out.println("I hope your ready!");
		
		//get number from user
		Scanner input = new Scanner(System.in);		
		System.out.print("Guess a number from 1 - 100: ");
		int userInput = input.nextInt();
		
		//store generator in NumberChecker object
		NumberChecker guessNum = new NumberChecker(correctNum, userInput);
		
		//start the game for the user
		boolean game = true;		
		while (game) {
			
			//if user guesses correctly end game
			if (guessNum.check()) {
				System.out.println("Good job!!\nThe number you guessed correctly is " + guessNum.getCorrectNum());
				break;
			} else { //otherwise keep going
				System.out.println("Wrong Number!!\nTry Again :(\n");
				guessNum.lowHigh(); //tell player if they guesses too high or low
				System.out.print("Guess a number from 1 - 100: ");
				userInput = input.nextInt();
				
				guessNum.setUserNum(userInput);				
			}
		}
		System.out.println("Thank you for playing my game!");
	}

	private static int numGenerator() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 100) + 1;
	}

}
