package kup9_lab7;

import javax.swing.JOptionPane;

public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 0;
		while(size < 1) {
			String sizeStr = JOptionPane.showInputDialog("Enter the array size:");
			
			size = Integer.parseInt(sizeStr);
		}
		
		ArrFillAnalyze arr = new ArrFillAnalyze(size);
		
		double[] data = arr.getData();
		for(int index = 0; index < ArrFillAnalyze.size; index++) {
			data[index] = Math.random();
		}
		
		
		System.out.println(ArrFillAnalyze.min(arr.data));
		System.out.println(ArrFillAnalyze.max(arr.data));
		System.out.println(ArrFillAnalyze.sum(arr.data));
		System.out.println(ArrFillAnalyze.ave(arr.data));
		
	}

}
