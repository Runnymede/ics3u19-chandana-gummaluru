package gummaluru.unit2;

public class LicenseToRide {
	/**
	 * 
	 * Thurs, Nov 14th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		
		//Variable declarations...
		int sum = 0;
		double counter = 0;
		double prob = 0;
		
		//Nested for loops...
		for (int a = 9; a>=0; a--){	
			for (int b = 9; b>=0; b--) {
				for (int c = 9; c>=0; c--) {
					for(int d = 9; d>=0; d--) {
						
						//Adds the values for a, b, c, and d. 
						sum = a+b+c+d;
						
						/*Adds 1 to the counter if the sum of the values 
					    are greater than or equal to 34.*/
						if (sum>=34)
						{
							counter++;			
						}						
					}					
				}
			}
		}
		//Displays the possible combinations of the variables that have a sum of 34 or greater.
		System.out.println("Possible combinations : " + counter);
		
		//Determines the percentage of the probability.
		prob = (counter/100)*100;
		
		//Displays percentage.
		System.out.println("Therefore, the probability is: " + prob + "%");
	}
}