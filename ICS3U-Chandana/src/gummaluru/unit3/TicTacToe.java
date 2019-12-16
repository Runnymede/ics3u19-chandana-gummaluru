package gummaluru.unit3;
import java.util.Scanner;
public class TicTacToe {
	/**
	 * TicTacToe Game
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
			//X wins!
			if(tttboard[0][0]=='X' & tttboard[0][1]=='X' & tttboard[0][2]=='X') {
				System.out.println("X wins!");
				break;
			}
			else if(tttboard[1][0]=='X' & tttboard[1][1]=='X'& tttboard[1][2]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[2][0]=='X' & tttboard[2][1]=='X'& tttboard[2][2]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[0][0]=='X' & tttboard[1][0]=='X'& tttboard[2][0]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[0][1]=='X' & tttboard[1][1]=='X'& tttboard[2][1]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[0][2]=='X' & tttboard[1][2]=='X'& tttboard[2][2]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[2][0]=='X' & tttboard[1][1]=='X'& tttboard[0][2]=='X') {
				System.out.println("X wins!");
				break;	
			}
			else if(tttboard[0][0]=='X' & tttboard[1][1]=='X'& tttboard[2][2]=='X') {
				System.out.println("X wins!");
				break;	
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
			
			//O wins!
			if(tttboard[0][0]=='O' & tttboard[0][1]=='O' & tttboard[0][2]=='O') {
				System.out.println("O wins!");
				break;
			}
			else if(tttboard[1][0]=='O' & tttboard[1][1]=='O'& tttboard[1][2]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[2][0]=='O' & tttboard[2][1]=='O'& tttboard[2][2]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[0][0]=='O' & tttboard[1][0]=='O'& tttboard[2][0]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[0][1]=='O' & tttboard[1][1]=='O'& tttboard[2][1]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[0][2]=='O' & tttboard[1][2]=='O'& tttboard[2][2]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[2][0]=='O' & tttboard[1][1]=='O'& tttboard[0][2]=='O') {
				System.out.println("O wins!");
				break;	
			}
			else if(tttboard[0][0]=='O' & tttboard[1][1]=='O'& tttboard[2][2]=='O') {
				System.out.println("O wins!");
				break;	
			}
			

		}
		sc.close();
	}
}
