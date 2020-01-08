package gummaluru.unit4;

import java.util.Scanner;

public class IsoTriangle {
	/**
	 * Tues, Dec 17th, 2019
	 * @author Chandana Gummaluru
	 */	

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What size do you want for your isosceles triangle?");
		int lineNum = sc.nextInt();

		for (int i=1;i<=lineNum;i++) {
			drawSpaces(lineNum-i);
			drawStars(i*2-1);
			System.out.println();
		}	
		sc.close();
	}

	public static void drawSpaces(int num){
		for(int a=0; a<num; a++) {

			System.out.print("*");
		}
	}

	public static void drawStars(int stars){
		for (int b=0; b<stars; b++) {
			System.out.print("");	
		}
	}

}


