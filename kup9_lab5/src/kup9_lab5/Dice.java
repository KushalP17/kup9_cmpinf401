package kup9_lab5;

import java.util.Arrays;
import java.util.Random;

public class Dice {
	
	static void RollDice(int rolls, Random r) {
		
		int score;
		
		//probabilities array
		double probabilities[] = new double[11];
		
		//found from Stack Overflow - 
		//https://stackoverflow.com/questions/2154251/any-shortcut-to-initialize-all-array-elements-to-zero
		Arrays.fill(probabilities, 0);
		
		//double for loop
		//first loop for number of double rolls (experiment n)
		for(int rollTimes = 0; rollTimes < rolls; rollTimes++) {
			score = 0;
			
			//second loop to accurately simulate single dice rolled twice
			for(int roll = 0; roll < 2; roll++) {
				score += r.nextInt(6) + 1;
			}
			
			//put score occurrences in array after each double roll
			probabilities[score - 2] += 1;
			
		}
		
		//iterate over array to print out probabilities
		for(int i = 0; i < 11; i++) {
			System.out.println("Probability of Roll Score of " + (i+2) + ": " + (probabilities[i]/rolls) + "\n");
		}
	}
	
}
