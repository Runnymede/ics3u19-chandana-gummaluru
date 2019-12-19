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
		
		for (int i=1;i<=lineNum;i
		drawSpaces(lineNum);
		drawStars(lineNum);
	}

	public static void drawSpaces(int num){
		for(int a=num-1; a>0; a--) {
			for(int b=0; b<a; b++) {
				System.out.print(" .");
			}
		}
		System.out.println();
	}

	public static void drawStars(int stars){
		for (int c=1; c<stars*2; c=c+2) {
			for(int d=0; d<c; d++) {
				System.out.print("*");	
			}
		}
		System.out.println();
	}

}
