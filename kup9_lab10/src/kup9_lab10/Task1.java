package kup9_lab10;

import java.lang.Math;

public class Task1 {
	
	static int sumOfDigits(int x) {
		
		//shift down 1 digit
		int next = Math.abs(x)/10;
		
		//grab lowest digit
		int sum = Math.abs(x)%10;
		
		if(next == 0) {
			return x % 10;
		}else {
			sum += sumOfDigits(next);
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
	
	//change this variable to calculate sum
	//of digits for different numbers
	int var = 2022;	
	
	System.out.println(sumOfDigits(var));
	
	}
	
}
