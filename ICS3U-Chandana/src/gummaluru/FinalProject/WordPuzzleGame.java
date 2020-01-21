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
		System.out.println("Welcome to Puzzling Words! You will receive a random puzzle to solve.");
		System.out.println("");
		System.out.println("Here are the rules:");
		System.out.println("- You may pick a letter, buy a vowel, or solve the puzzle.");
		System.out.println("- Players will alternate turns.");
		System.out.println("");
		System.out.println("Remember:");
		System.out.println("- When guessing a letter, it must be typed in capitals.");
		System.out.println("- Buying a vowel costs you points. You may still buy a vowel with 0 points.");
		System.out.println("- For example, if there are 3 a's in the puzzle, you will lose 3 points.");
		System.out.println("- If you have no points and you buy a vowel, you will recieve negative points.");
		System.out.println("- When you are solving, you must include punctuation "
				+ "if the puzzle includes any.");
		System.out.println("- If a letter has already been guessed, the player may guess again.");
		System.out.println("");
		System.out.println("");

		//array of 2 indexes that holds the values of both player's scores.
		int totalScores[] = new int[2];

		//array of various word puzzles.
		String listOfPuzzles[] = new String[]{
				"Climbing up the big birch tree.",
				"Frolicking through the steep meadows.",
				"Watching the sun rise over the hills.", 
				"Prince Hans of the Seven Isles", 
				"Prince Arthur of Camelot", 
				"Prince George of Cambridge",
				"May the Force be with you.", 
				"Elementary, my dear Watson!", 
				"Just keep swimming."};

		//variable that stores how many puzzles have been solved.
		int puzzlesSolved = 0;

		//continues to implement the rest of the code while the number of puzzles solved is less than 3.
		while (puzzlesSolved < 3) {
			//variable that is being assigned a randomly selected puzzle from the list of puzzles.
			String puzzle = selectPuzzle(listOfPuzzles);

			//variable that is being assigned the scores obtained from the round.
			int scores[] = playRound(puzzle);

			//adds the total score obtained in the game to the initial score.
			totalScores[0] += scores[0];
			totalScores[1] += scores[1];

			//adding one to the number of puzzles played.
			puzzlesSolved += 1;
		}
		if (puzzlesSolved ==3 && totalScores[0]>totalScores[1]){
			//if 3 puzzles have been solved and player 1's total score is greater...
			System.out.println("Player 1 wins!");
		}
		else if (puzzlesSolved ==3 && totalScores[0]<totalScores[1]){
			//if 3 puzzles have been solved and player 2's score is greater...
			System.out.println("Player 2 wins!");
		}
		else {
			//if the scores are tied...
			System.out.println("It's a tie!");
		}
	}
	/**
	 * This method selects a random puzzle from the list of puzzles.
	 * @param listOfPuzzles
	 * @return listOfPuzzles[randomPuzzle] - the random puzzle.
	 */
	public static String selectPuzzle(String[] listOfPuzzles) {
		//random generator to select a puzzle from the array of puzzles.
		int randomPuzzle = (int)(Math.random()*8);
		//array of category titles.
		String categories[] = new String[]{"Outdoor activities","Prince Names","Famous Movie Quotes"}; 

		//Displays the category title depending on the puzzle that has been selected.
		if (randomPuzzle==0|| randomPuzzle==1 || randomPuzzle==2) {
			System.out.println(categories[0]);
		}
		else if (randomPuzzle==3 || randomPuzzle==4 || randomPuzzle==5) {
			System.out.println(categories[1]);
		}
		else {
			System.out.println(categories[2]);
		}
		return listOfPuzzles[randomPuzzle];
	}
	/**
	 * This methods plays a round of the game.
	 * @param puzzle
	 * @return scores - the points earned in the round.
	 */
	public static int[] playRound(String puzzle) {
		//it is currently player 1's turn.
		boolean turn1 = true;
		//they have not yet guessed.
		boolean guessed = false;

		//boolean array of 26 indices to represent letters of the alphabet.
		boolean[] letterGuessed = new boolean[26];
		//variable that holds the original puzzle, but in upper case.
		String uPuzzle = puzzle.toUpperCase();
		//this array stores the values of the score in two separate indexes.
		int scores[] = new int[2];

		//boolean array that have indexes for each character of the puzzle.
		boolean[] charsToDisplay = new boolean[puzzle.length()];
		//calling the method, setupPuzzle, to assign the return value to charsLeft. 
		int charsLeft = setupPuzzle(puzzle, charsToDisplay);
		Scanner sc = new Scanner(System.in);

		//calling displayPuzzle method.
		displayPuzzle(puzzle, charsToDisplay);

		//continues if the puzzle has not been guessed and there are still letters to guess.
		while (!guessed && charsLeft > 0) {

			//user's guess is stored in this variable
			String guess = sc.nextLine().toUpperCase();
			int count = 0;
			int multiplier = 1;

			if (guess.length() == 1){
				//if the guess is a character... 
				char guessChar = guess.charAt(0);
				if (letterGuessed[guessChar - 'A']){
					System.out.println("Letter already guessed! Guess again.");

					//goes through the next increments of code.
					continue;
				}
				letterGuessed[guessChar - 'A'] = true;

				if (isVowel(guessChar)) {
					//if the guess is a vowel, deduct points. 
					multiplier = -1;
				}

				//stores the number of times the user's input shows up in the puzzle.
				count = guessLetter(guessChar, uPuzzle, charsToDisplay);
			}
			else {
				count = solvePuzzle(guess, uPuzzle, charsToDisplay);
			}
			//calling the displayPuzzle methods.
			displayPuzzle(puzzle, charsToDisplay);

			if (turn1) {
				//if it's player 1's turn, add points to their score.
				scores[0] += multiplier * count;
			}
			else {
				//if it's player 2's turn, add points to their score.
				scores[1] += multiplier * count;
			}
			//it is no longer player 1's turn.
			turn1 = !turn1;

			//subtracts from how many characters are left in the puzzle.
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
	 * This method allows the user to guess a letter.
	 * @param letter
	 * @param puzzle
	 * @param charsToDisplay
	 * @return count 
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
	 * This methods allows for the user to solve the puzzle.
	 * @param guess
	 * @param uPuzzle
	 * @param charsToDisplay
	 * @return counter
	 */
	public static int solvePuzzle(String guess, String uPuzzle, boolean[]charsToDisplay){
		if (uPuzzle.equalsIgnoreCase(guess)) {
			//if the player solved the puzzle correctly...
			int counter= 0;
			System.out.println("Correct! Here's your next puzzle: ");
			System.out.println("");
			System.out.println("");
			for(int i = 0; i<charsToDisplay.length; i++){
				if (!charsToDisplay[i]){
					charsToDisplay[i] = true; 
					counter++;   
				}
			}
			return counter;
		}
		return 0;
	}
	/**
	 * This methods displays the puzzle.
	 * @param puzzle
	 * @param charsToDisplay
	 */
	public static void displayPuzzle(String puzzle, boolean[] charsToDisplay) {
		//Puzzle starts off blank.
		String displayPuzzle = "";

		//Displays the char if it's within the puzzle.
		for (int i = 0; i < puzzle.length(); i++) {
			if (charsToDisplay[i] == true) {
				displayPuzzle += puzzle.charAt(i);
			} 
			else {
				//prints out the blank spaces in the puzzle.
				displayPuzzle += " _ ";
			}
		}
		System.out.println(displayPuzzle);
	}
	/**
	 * This method sets up the puzzle.
	 * @param puzzle
	 * @param charsToDisplay
	 * @return puzzle.length() - count;
	 */
	public static int setupPuzzle(String puzzle, boolean[] charsToDisplay) {
		int count = 0;

		for (int i = 0; i < puzzle.length(); i++) {  
			//gets the ith character.
			char current = puzzle.charAt(i);
			//if the ith character is not a letter...
			if (!isLetter(current)) {
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
	 * @return c - the vowel in the puzzle.
	 */
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
	/**
	 * This method holds all the possible letters the user can choose from.
	 * @param c
	 * @return any letter in the puzzle.
	 */
	public static boolean isLetter(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}
}