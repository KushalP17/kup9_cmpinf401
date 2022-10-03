package kup9_lab5;

import java.util.Random;

import javax.swing.JOptionPane;

public class RollingTheDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare random object
		Random rand = new Random();
		
		//program vars
		String decision, intInput;
		int input;
		
		
		do {
			//get # of rolls
			intInput = JOptionPane.showInputDialog("How many times should we roll both die?");
			//convert # of rolls into int
			input = Integer.parseInt(intInput);
			
			//static void method
			Dice.RollDice(input, rand);
			
			//reset decision
			decision = "";
			
			//decision asking and error checking
			while(!decision.equals("yes") && !decision.equals("no")) {
				decision = JOptionPane.showInputDialog("Please enter \"yes\" to run program again, or \"no\" to exit the program.");
			}
			
			//exit program if not yes
		}while(decision.equals("yes"));
		
		
		
		
	}

}
