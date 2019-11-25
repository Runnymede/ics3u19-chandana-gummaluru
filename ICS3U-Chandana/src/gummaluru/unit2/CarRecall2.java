package gummaluru.unit2;
import java.util.Scanner;
/**
 * Allows the user to enter as many model numbers as needed.
 * Mon, Oct 28th, 2019
 * @author Chandana Gummaluru
 */
public class CarRecall2 {
	public static void main (String[]args) {
		/** 
		 * This is the entry point to the program.
		 * @param args
		 */

		//Declarations are here...
		Scanner sc = new Scanner(System.in);
		int model;


		//Prompts user to enter the car's model number or quit the program.
		System.out.println("Enter the car's model number or 0 to quit.");

		//Reads the given model number
		model = sc.nextInt();

		//Checks and displays if the model number is defective or not
		while (model !=0)
		{	
			switch (model) {
			case 199: System.out.println("This model is defective. It must be repaired.");
			break;
			case 179: System.out.println("This model is defective. It must be repaired.");
			break;
			case 189: System.out.println("This model is defective. It must be repaired.");
			break;
			case 190: System.out.println("This model is defective. It must be repaired.");
			break;
			case 191: System.out.println("This model is defective. It must be repaired.");
			break;
			case 192: System.out.println("This model is defective. It must be repaired.");
			break;
			case 193: System.out.println("This model is defective. It must be repaired.");
			break;
			case 194: System.out.println("This model is defective. It must be repaired.");
			break;
			case 195: System.out.println("This model is defective. It must be repaired.");
			break;
			case 221: System.out.println("This model is defective. It must be repaired.");
			break;
			case 780: System.out.println("This model is defective. It must be repaired.");
			break; 
			default: System.out.println("This model is not defective. No repairs needed!");

			}

			System.out.println("Enter the car's model number or 0 to quit.");
			model = sc.nextInt();
		}
		
		System.out.println("Bye!");
	}

}
