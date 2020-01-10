package gummaluru.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {
	/**
	 * Mon, Jan 6th, 2020
	 * @author Chandana Gummaluru
	 * @return 
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int []myArray = {2,4,2,7,8,2,8,5,3,4,2,2};

		//Asks the user to enter how many numbers they want in the array.
		System.out.println("How many numbers would you like in your array?");

		//Saves the user's input in a variable named arrayNum.
		int arrayNum = sc.nextInt();

		//Creates a new array with the given indices. 
		int[] array = new int[arrayNum];
		double[]array2 = new double [arrayNum];


		//Asks the user to enter values for each index.
		System.out.println("Enter the " +arrayNum+ " index values one by one.");
		for(int i = 0; i<arrayNum; i++) {
			array[i] = sc.nextInt();
			array2[i]= array[i];
		}

		int small = min(array);
		System.out.println("The smallest number is at index: " + small);

		int big = max(array);
		System.out.println("The biggst number is at index: " + big);

		int sum = sum(array);
		System.out.println("The sum of all the numbers is: " + sum);

		double average = average(array);
		System.out.println("The average of all the numbers is: " +average);

		double median = median(array2);
		System.out.println("The median of all the numbers is: " +median);




	}
	/**
	 * This method determines the lowest number value in the array.	
	 * @param smallestNum
	 * @return the smallest number value in the array.
	 */
	public static int min(int[]smallestNum){
		int smallestIndex = 0;
		for(int i=0; i<smallestNum.length; i++) {

			if(smallestNum[i]<smallestNum[smallestIndex]) {
				smallestIndex=i;
			}		
		}
		//Sends the smallIndex to the main method.
		return smallestIndex;
	}

	/**
	 * This method determines the highest number value in the array.
	 * @param biggestNum
	 * @return the biggest number value in the array.
	 */
	public static int max(int[]biggestNum){
		int biggestIndex = 0;
		for(int i=0; i<biggestNum.length; i++) {

			if(biggestNum[i]>biggestNum[biggestIndex]) {
				biggestIndex=i;
			}		
		}
		//Sends the biggestIndex to the main method.
		return biggestIndex;
	}

	/**
	 * This method determines the sum of all the values in the array.
	 * @param sumNum
	 * @return the sum of all the values in the array. 
	 */
	public static int sum(int[]sumNum){
		int indexSum = sumNum[0];
		for(int i=1; i<sumNum.length; i++) {
			indexSum = indexSum + sumNum[i];
		}
		//Sends the indexSum to the main method.
		return indexSum;
	}
	/**
	 * 
	 * @param avNum
	 * @return the average of all the values in the array.
	 */
	public static double average(int[]avNum){
		int indexAv = avNum[0];
		for(int i=1; i<avNum.length; i++) {
			indexAv = indexAv + avNum[i];
		}
		int av = indexAv/avNum.length;

		//Sends the av to the main method.
		return av;
	}


	public static int min(double[]smallestNum){
		int smallestIndex = 0;
		for(int i=0; i<smallestNum.length; i++) {

			if(smallestNum[i]<smallestNum[smallestIndex]) {
				smallestIndex=i;
			}		
		}
		//Sends the smallIndex to the main method.
		return smallestIndex;
	}

	public static int max(double[]biggestNum){
		int biggestIndex = 0;
		for(int i=0; i<biggestNum.length; i++) {

			if(biggestNum[i]>biggestNum[biggestIndex]) {
				biggestIndex=i;
			}		
		}
		//Sends the biggestIndex to the main method.
		return biggestIndex;
	}

	public static double sum(double[]sumNum){
		double indexSum = sumNum[0];
		for(int i=1; i<sumNum.length; i++) {
			indexSum = indexSum + sumNum[i];
		}
		//Sends the indexSum to the main method.
		return indexSum;
	}

	public static double average(double[]avNum){
		double indexAv = avNum[0];
		for(int i=1; i<avNum.length; i++) {
			indexAv = indexAv + avNum[i];
		}
		double av = indexAv/avNum.length;

		//Sends the av to the main method.
		return av;
	}

	public static double median(double[]medNum){

		//Sorts the array values in order from smallest to greatest.
		Arrays.sort(medNum);

		//If it's an odd number, it has one median value.
		if (medNum.length%2 != 0) {
			int med = medNum.length/2;
			double num = medNum[med];
			return num;

		}
		else 
		{
			int med = medNum.length/2;
			int med2 = med-1;
			double num = medNum[med];
			double num2 = medNum[med2];
			double median = (num+num2)/2;
			return median;

		}
		
		public static double mode(double[]modeNum) {
			for (int i=0; i<12; i++)
			
			

		}
		
		
		
		



	}
}


