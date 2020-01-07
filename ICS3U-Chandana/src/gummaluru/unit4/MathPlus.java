package gummaluru.unit4;

import java.util.Scanner;

public class MathPlus {
	/**
	 * Mon, Jan 6th, 2020
	 * @author Chandana Gummaluru
	 * @return 
	 */	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//Asks the user to enter how many numbers they want in the array.
		System.out.println("How many numbers would you like in your array?");

		//Saves the user's input in a variable named arrayNum.
		int arrayNum = sc.nextInt();

		//Creates a new array with the given indices. 
		int[] array = new int[arrayNum];

		//Asks the user to enter values for each index.
		System.out.println("Enter the " +arrayNum+ " index values one by one.");
		for(int i = 0; i<arrayNum; i++) {
			array[i] = sc.nextInt();
		}

		int small = min(array);
		System.out.println(small);

		int big = max(array);
		System.out.println(big);
		
		int sum = sum(array);
		System.out.println(sum);
				
				
				
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
		//Sends the biggestIndex to the main method.
		return indexSum;
	}
	
	public static int average(int[]avNum){
		int indexAv = avNum[0];
		for(int i=1; i<avNum.length; i++) {
		indexAv = indexAv + avNum[i];
		}
		indexAv/avNum.length;
		//Sends the biggestIndex to the main method.
		return indexSum;
	}
}


