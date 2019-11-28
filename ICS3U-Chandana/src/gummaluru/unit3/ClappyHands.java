package gummaluru.unit3;

public class ClappyHands {
	/**
	 * This 
	 * Mon, Nov 25th, 2019
	 * @author Chandana Gummaluru
	 */	
	public static void main(String[]args) {
		
		String[] actions = {"clap your hands", "stomp your feet", "touch your nose", 
				"twirl around", "brush your teeth", "comb your hair", "shake your feet", 
				"pull your ears","bend your knees", "raise your arms"};
		int arrayNum = 0;
	for (int i = 0; i<9; i++ ) {
		System.out.println("If you're happy and you know it " + actions[i]); 
		System.out.println("If you're happy and you know it " + actions[i]); 
		System.out.println("If you're happy and you know it and you really want to show it");
		System.out.println("If you're happy and you know it " + actions[i]);  
		System.out.println(); 
		if (arrayNum<i) {
			arrayNum++;
		}
	}
		}
	}

