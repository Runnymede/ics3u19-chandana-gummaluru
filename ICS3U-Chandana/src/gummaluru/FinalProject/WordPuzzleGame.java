package gummaluru.FinalProject;
import java.util.Scanner;

/**
 * 
 * Tues, Jan 14th, 2020
 * @author Chandana Gummaluru
 */
public class WordPuzzleGame {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//introduction to the game.
		System.out.println("Welcome to Puzzling Words! You will recieve a random puzzle to solve.");
		System.out.println("Let's begin.");
		System.out.println("");
		System.out.println("Player 1 can start the game.");
		System.out.println("Pick a letter, buy a vowel, or solve the puzzle.");
		System.out.println("");
		System.out.println("Remember:");
		System.out.println("Buying a vowel costs you points.");
		System.out.println("For example, if there are 3 a's in the puzzle, you will lose 3 points.");


		//array of 2 indexes that holds the values of both player's scores.
		int totalScores[] = new int[2];

		//array of multiple puzzles.
		String listOfPuzzles[] = new String[]{
				"Running through the woods.", 
				"Eating fish from the water.", 
				"Climbing up the big birch tree.",};


		//variable that holds the number of puzzles in the game.
		int puzzleNumber = 0;


		while (puzzleNumber < 5) {
			//selects a random puzzle.
			String puzzle = selectPuzzle(listOfPuzzles);

			//plays the puzzle.
			int scores[] = play(puzzle);

			//adds scores.
			totalScores[0] += scores[0];
			totalScores[1] += scores[1];

			//next puzzle.
			puzzleNumber += 1;
		}
	}

	/**
	 * This method selects a random puzzle from the array of puzzles.
	 * @param listOfPuzzles
	 * @return
	 */
	public static String selectPuzzle(String[] listOfPuzzles) {
		int randomPuzzle = (int)(Math.random()*2);
		return listOfPuzzles[randomPuzzle];
	}

	/**
	 * This methods allows for the  
	 * @param puzzle
	 * @return
	 */
	public static int[] play(String puzzle) {
		boolean turn1 = true;
		boolean guessed = false;
		boolean[] letterGuessed = new boolean[26];
		
		//this array holds the values of the score in two separate indexes.
		int scores[] = new int[2];
		
		boolean[] charsToDisplay = new boolean[puzzle.length()];

		int charsLeft = setupPuzzle(puzzle, charsToDisplay);
		displayPuzzle(puzzle, charsToDisplay);

		Scanner sc = new Scanner(System.in);
		
		//continues to read user input if the puzzle has not yet been solved.
		while (!guessed && charsLeft > 0) {
			char guess = sc.next().charAt(0);

			if (letterGuessed[guess - 'a']){
				continue;
			}

			letterGuessed[guess - 'a'] = true;
			
			int count = guessLetter(guess, puzzle, charsToDisplay);
			displayPuzzle(puzzle, charsToDisplay);

			int multiply = 1;
			if (isVowel(guess)) {
				multiply = -1;
			}

			if (turn1) {
				scores[0] += multiply * count;
			} 

			else {
				scores[1] += multiply * count;
			}

			turn1 = !turn1;

			charsLeft -= count;
			displayScore(scores[0], scores[1]);
		}
		return scores;
	}

	/**
	 * This method displays the players' scores.
	 * @param score1
	 * @param score2
	 */
	public static void displayScore(int score1, int score2) {
		System.out.println("Player 1: " + score1 + " points");
		System.out.println("Player 2: " + score2 + " points");
	}

	/**
	 * 
	 * @param letter
	 * @param puzzle
	 * @param charsToDisplay
	 * @return
	 */
	public static int guessLetter(char letter, String puzzle, boolean[] charsToDisplay) {
		int count = 0;
		
		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.charAt(i) == letter) {
				charsToDisplay[i] = true;
				count++;
			}
		}

		return count;
	}

	/**
	 * This methods displays the puzzle.
	 * @param puzzle
	 * @param charsToDisplay
	 */
	public static void displayPuzzle(String puzzle, boolean[] charsToDisplay) {

		String displayPuzzle = "";

		for (int i = 0; i < puzzle.length(); i++) {
			if (charsToDisplay[i] == true) {
				displayPuzzle += puzzle.charAt(i);
			} else {
				displayPuzzle += " _ ";
			}
		}

		System.out.println(displayPuzzle);
	}
	/**
	 * 
	 * @param puzzle
	 * @param charsToDisplay
	 * @return
	 */
	public static int setupPuzzle(String puzzle, boolean[] charsToDisplay) {
		int count = 0;

		for (int i = 0; i < puzzle.length(); i++) {   
			//get the ith character.
			char curr = puzzle.charAt(i);

			//if the ith character is not a letter...
			if (!isLetter(curr)) {
				//make sure that character is already displayed.
				charsToDisplay[i] = true;
				count++;
			}
		}

		return puzzle.length() - count;
	}

	/**
	 * This method holds all the possible vowels the user can choose from.
	 * @param c
	 * @return the vowel in the puzzle.
	 */
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}

	/**
	 * 
	 * @param c
	 * @return any letter in the puzzle.
	 */
	public static boolean isLetter(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}


}