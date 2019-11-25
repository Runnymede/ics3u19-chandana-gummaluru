package gummaluru.unit2;
import java.util.Scanner;
/**
 * Tues, Oct 8th, 2019
 * @author Chandana Gummaluru
 */
public class StringThings {
	public static void main (String[]args) {
		/** 
		 * This is the entry point to the program.
		 * @param args
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//part 1 
		
		//prompts user to enter a 7 letter word.
		System.out.println("Please enter a word that is at least 7 characters long.");
		String word;
		word = sc.nextLine();
		
		//Displays the user's word.
		System.out.println(word);
		
		//Converts user's word into upper case and then displays it.
		String wordupper = word.toUpperCase();
		System.out.println(wordupper);
		
		//Converts user's word into lower case and then displays it.
		String wordlower = word.toLowerCase();
		System.out.println(wordlower);
		
		//Determines the number of letters in the word and displays that number.
		int length = word.length();
		System.out.println("There are " + length + " letters in your word.");
		
		//Determines which letter is at the sixth index.
		char wordchar = word.charAt(6);
		System.out.println(wordchar);
		
		//Asks the user which index they would like to display the letter of.
		System.out.println("At which index would you like to print the character?");
		
		//Determines the letter of the given index and displays it.
		int index;
		index = sc.nextInt();
		char wordchar2 = word.charAt(index);
		System.out.println(wordchar2);	
		
		
		//part 2
		
		//Asks the user to enter two words and scans them.
		System.out.println("Please enter a word.");
		String firstword = sc.next();
		System.out.println("Enter another word.");
		String secondword = sc.next();
		
		//Compares the two words and displays whether or not they are the same.
		if (firstword.compareTo(secondword)>0)
		{
			System.out.println("The words are not the same.");	
		}
		
		else if (firstword.compareTo(secondword)<0)
		{
			System.out.println("The words are not the same.");
		}
		
		else if (firstword.compareTo(secondword)==0)
		{
			System.out.println("The words are the same.");
		}
		
		
		//part 3
		
		//assignments for the username and password.
		String username = "purple";
		String password = "blue";
		
		//prompts user to enter in their username and password.
		System.out.println("Enter username:");
		String yourUsername = sc.next();
		System.out.println("Enter password");
		String yourPassword = sc.next();
		
		
		//compares the assigned username and password to what the user entered. 
		if (yourUsername.equals(username) && yourPassword.equals(password))
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Your username or password is incorrect.");
		}
		
		
		
		
			}
}
