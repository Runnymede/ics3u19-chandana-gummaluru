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

		//variables for Player 1 and Player 2 scores.
		int score1 = 0;
		int score2 = 0;
		
        
		boolean firstTurn = true;
		boolean guessed = false;

		//answers for each puzzle.
		String puzzle = "Captain Jack Sparrow";
		boolean[] charsToDisplay = new boolean[puzzle.length()];
		int charsLeft = setupPuzzle(puzzle, charsToDisplay);
		displayPuzzle(puzzle, charsToDisplay);

	

	}
    
	/**
	 * This method returns the player's scores.
	 * @param score1
	 * @param score2
	 */
	public static void displayScore(int score1, int score2) {
		System.out.println("Player 1: " + score1);
		System.out.println("Player 2: " + score2);
	}
	/**
	 * This method 
	 * @param letter
	 * @param puzzle
	 * @param charsToDisplay
	 * @return
	 */
	public static int guessLetter(char letter, String puzzle, boolean[]charsToDisplay) {
		int count = 0;
		
		//checks through the entire puzzle to see if the guessed letter is within it.
		for(int i =0; i<puzzle.length(); i++) {
			if (puzzle.charAt(i)==letter) {
				charsToDisplay[i] = true;
				count++;
			}	
		}
		return count;	
	}
	/**
	 * 
	 * @param puzzle
	 * @param charsToDisplay
	 */
	public static void displayPuzzle(String puzzle, boolean[]charsToDisplay) {
		String displayPuzzle = "";

		for(int i = 0; i<puzzle.length(); i++) {
			if (charsToDisplay[i] == true) {
				displayPuzzle = displayPuzzle + charAt(i);
			}
			else {
				displayPuzzle = displayPuzzle+"__";
			}

			System.out.println(displayPuzzle);
		}	
	}
	/**
	 * 
	 * @param puzzle
	 * @param charsToDisplay
	 * @return
	 */
	public static int setupPuzzle(String puzzle, boolean[]charsToDisplay) {
		int counter = 0;
		for(int i = 0; i<puzzle.length(); i++) {
			char display = puzzle.charAt(i);
			if(!letter(display)) {
				charsToDisplay[i]=true;
				counter++;
			}
		}
		return puzzle.length()-counter;
	}
	/**
	 * 
	 * @param letter
	 * @return
	 */
	public static boolean isVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u' || letter == 'i' 
			|| letter == 'A' || letter == 'E' || letter == 'O' || letter == 'U' || letter == 'I') {
			isVowel = true;
			
		}
	}



}
