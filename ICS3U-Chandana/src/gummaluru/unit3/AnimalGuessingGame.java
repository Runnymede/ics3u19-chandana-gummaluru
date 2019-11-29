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
		
		String click = sc.nextLine();
		
		for(int i =0; i<22; i++) {	
		int guess= (int)(Math.random()*21);	
		System.out.println("Is it a(n)" +animals[guess]+"?");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("yes")){
			System.out.print("Yay!");
			break;
		}
		
			
		}
	
		
	}
}
