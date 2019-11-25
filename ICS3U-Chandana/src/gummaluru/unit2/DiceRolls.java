package gummaluru.unit2;

public class DiceRolls {
	/**
	 * This program displays five random rolls of two dice where each die is numbered from 1 to 6.  
	 * Tues, Nov 12th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		
		//Variable declarations...
		int die1 = 0;
		int die2 = 0;
		int total; 
		
		System.out.format("%12s", "Dice 1");
		System.out.format("%12s", "Dice 2");
		System.out.format("%12s", "Total");
		System.out.println();
		
		for(int i=1; i<5; i++)
		{
		die1 =  (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		total = die1 + die2;
		
		System.out.format("%12s", die1);
		System.out.format("%12s", die2);
		System.out.format("%12s", total);
		System.out.println();
		}
		
		
	}
}
