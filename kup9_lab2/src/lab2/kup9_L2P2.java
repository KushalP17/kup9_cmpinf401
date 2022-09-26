package lab2;

import javax.swing.JOptionPane;

public class kup9_L2P2 {

	public static void main(String[] args) {
		
		//Input & Calculations
		double r = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of your circle: "));
		double perimeter = 2* Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		//Answer Decimal Manipulation and Output
		
		perimeter *= 1000;
		int perimPH = (int) Math.round(perimeter);
		perimeter = perimPH / 1000.0;
		
		area *= 1000;
		int areaPH = (int) Math.round(area);
		area = areaPH / 1000.0;
		
		System.out.println("The perimeter of the circle is " + perimeter + "\n");
		System.out.println("The area of the circle is " + area + "\n");

	}

}
