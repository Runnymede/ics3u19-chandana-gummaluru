package gummaluru.unit3;

import java.util.Scanner;

public class AnimalGuessingGame {
	/**
	 * This program guesses the animal that the user is thinking of.
	 * Thurs, Nov 28th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Array of animals.
		String[] animals = {"penguin", "elephant", "bear", "turtle", "cat", 
				"dog", "rat", "mouse", "cow", "deer", "fox", "horse", "donkey", 
				"duck", "hamster", "cheetah", "monkey", "giraffe", "zebra", "lion", 
				"tiger", "beaver"};
		System.out.println("Think of an animal and I'll try to guess it! "
				+ "Click enter when you're ready.");
		
		//Used so that the user can click enter when they are ready.
		String click = sc.nextLine();
		
		for(int i =0; i<22; i++) {	
		//Selects a random animal from the array.	
		int guess= (int)(Math.random()*21);	
		
		//Asks the user if the animal they are thinking is that random animal.
		System.out.println("Is it a(n)" +animals[guess]+"?");
		
		//The user will say yes or no.
		String answer = sc.nextLine();
		
		//Computer wins if the answer is yes.
		if (answer.equalsIgnoreCase("yes")){
			System.out.print("Yay, I win!");
			break;
		}
		}	
	}
}
