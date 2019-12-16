package gummaluru.unit3;

public class TenThousandDiceRolls {
	/**
	 * This program simulates rolling two six sided dice and adds up the score.
	 * After 10000 rolls, it prints out how many times each number came up.
	 * Wed, Nov 27th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		
		//Variables...
		int rolls[]= {0,0,0,0,0,0,0,0,0,0,0,0};
		int diceSides;
		int diceSides2;
		int counter=2;
		int sum=0;
		
		//Prints out the title.
		System.out.println("Total Number of Rolls");
		
		for (int i= 0; i<10000; i++) {
			//Selects a random number for the variable, diceSides, from 1-6.
			diceSides=(int)(Math.random()*6)+1;
			
			//Selects a random number for the variable, diceSides2, from 1-6.
			diceSides2=(int)(Math.random()*6)+1;
			
			//Calculates the sum of the random numbers.
			sum = diceSides+diceSides2;
			
			//Adds 1 to index 0, each time the sum of the random numbers is 2.
			if(sum ==2) 
				rolls[0]++;	
			
			//Adds 1 to index 1, each time the sum of the random numbers is 3.
			else if(sum==3) 
				rolls[1]++;

			//Adds 1 to index 2, each time the sum of the random numbers is 4.
			else if(sum==4) 
				rolls[2]++;
			
			//Adds 1 to index 3, each time the sum of the random numbers is 5.
			else if(sum==5) 
				rolls[3]++;
			
			//Adds 1 to index 4, each time the sum of the random numbers is 6.
			else if(sum==6) 
				rolls[4]++;
			
			//Adds 1 to index 5, each time the sum of the random numbers is 7.
			else if(sum==7) 
				rolls[5]++;
			
			//Adds 1 to index 6, each time the sum of the random numbers is 8.
			else if(sum==8) 
				rolls[6]++;
			
			//Adds 1 to index 7, each time the sum of the random numbers is 9.
			else if(sum==9) 
				rolls[7]++;
			
			//Adds 1 to index 8, each time the sum of the random numbers is 10.
			else if(sum==10) 
				rolls[8]++;
			
			//Adds 1 to index 9, each time the sum of the random numbers is 11.
			else if(sum==11) 
				rolls[9]++;
			
			//Adds 1 to index 10, each time the sum of the random numbers is 12.
			else if(sum==12) 
				rolls[10]++;

		}
		for(int i=0; i<=10; i++) {
			//Prints out all the possible sum values.
			System.out.print("Sum "+counter+": ");	
			
			//Prints out the number of time that sum has been totaled.
			System.out.println(rolls[i]);
			counter++;
		}



	}


}


