package kup9_lab4;

import javax.swing.JOptionPane;

public class logFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputValue, inputBase;
		int value, base, startingValue;
		
		//input value and error checking
		do {
		inputValue = JOptionPane.showInputDialog("Enter the value you want to find the logarithm for:");
		value = Integer.parseInt(inputValue);
		}while(value < 1);
		
		//input base and error checking
		do{
			inputBase = JOptionPane.showInputDialog("Enter the base of the logarithm:");
			base = Integer.parseInt(inputBase);
		}while(base < 2);
		
		startingValue = value;
		
		//logarithm finder via repeated integer division
		int counter = 0;
		while(value >= base){
				value /= base;
				counter += 1;
		}
		
		System.out.println("The floor of log base " + base + " of " + startingValue + " is " + counter);
		
		
		
		
	}

}
