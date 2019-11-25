package gummaluru.unit2;

import java.util.Scanner;

public class CountVowels {
	/**
	 * 
	 * Mon, Nov 18th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Prompts the user to enter a word.
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		//Variable declarations...
		int length = word.length();
		int index = 0;
		int counter = 0;

		for(int i=0; i<length; i++)
		{
			//Checks for vowels in the word.
			char letter = word.charAt(index);
			if (String.valueOf(letter).equalsIgnoreCase("a") ||String.valueOf(letter).equalsIgnoreCase("e")||String.valueOf(letter).equalsIgnoreCase("o") ||String.valueOf(letter).equalsIgnoreCase("i")||String.valueOf(letter).equalsIgnoreCase("u")){
				counter++;
			}
			index++;			
		}
		//Prints out the number of vowels.
		System.out.println("Vowels: " + counter);
	}


}

