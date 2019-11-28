package gummaluru.unit3;
import java.util.Scanner;
public class TicTacToe {
	/**
	 * This 
	 * Tues, Nov 26th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char[][] tttboard = new char[3][3];

		for (int turns=0; turns<6; turns++){

			//Asks the user where in the row they want to place their X.
			System.out.println("Which row number you would like to place your X? ");
			int rowX= sc.nextInt();

			//Asks the user where in the column they would like to place their X
			System.out.println("Which column number you would like to place your X? ");
			int columnX = sc.nextInt();

			//This declares X to be given the location the user entered.
			tttboard[rowX][columnX]= 'X';

			//
			for (int row = 0; row<tttboard.length; row++) {

				//
				for (int column = 0; column<tttboard[0].length; column++) {
					//
					System.out.print(tttboard[row][column]+"|");
				}
				System.out.println();
				System.out.println("------");			
			}
			System.out.println("Which row number you would like to place your O? ");
			int rowO = sc.nextInt();	
			System.out.println("Which column number you would like to place your O? ");
			int columnO = sc.nextInt();
			tttboard[rowO][columnO]= 'O';
			
			for (int row = 0; row<tttboard.length; row++) {

				//
				for (int column = 0; column<tttboard[0].length; column++) {
					//
					System.out.print(tttboard[row][column]+"|");
				}
				System.out.println();
				System.out.println("------");			
			}

		}
		sc.close();
	}
}
