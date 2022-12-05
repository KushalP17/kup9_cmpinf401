package kup9_lab10;

public class Task2 {

	static void printArrayElements(int[] a, int index) {
		
		if(index < a.length) {
			
			System.out.println(a[index]);
			printArrayElements(a, index+1);
			
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//change this array to change output
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10};
		
		//change this var to change startIndex
		int startIndex = 5;
		
		printArrayElements(a, startIndex);
		
	}

}
