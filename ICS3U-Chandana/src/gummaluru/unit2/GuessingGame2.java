package gummaluru.unit2;

import java.util.Scanner;
/**
 * Tues, Oct 29th, 2019
 * @author Chandana Gummaluru
 */
public class GuessingGame2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);

		//prompts user to enter a number between 1 and 20.
		System.out.println("Enter a number between 1 and 20:");

		//scans the player's number.
		int playerNum = sc.nextInt();
		while(playerNum>0)
		{
		//computer randomly selects a number from 1 to 20
		int secretNum = (int)(Math.random()*20)+1;

		//compares the player's number to the secret number.

		if (playerNum == secretNum)
		{
			System.out.println("Secret Number: "+secretNum);
			System.out.println("Your Number: "+playerNum);
			System.out.println("You won!");
		}
		else 
		{
			System.out.println("Secret Number: "+secretNum);
			System.out.println("Your Number: "+playerNum);
			System.out.println("Better luck next time!");
		}
		System.out.println("Enter a number between 1 and 20:");
		playerNum = sc.nextInt();
		}

	}
}


