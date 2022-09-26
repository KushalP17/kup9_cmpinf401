package lab2;

import javax.swing.JOptionPane;

public class kup9_L2P1 {

	public static void main(String[] args) {
		
		// Pythagorean Theorem Program
		String s1Str = JOptionPane.showInputDialog("Length of the first side: ");
		String s2Str = JOptionPane.showInputDialog("Length of the second side: ");
		double side1 = Double.parseDouble(s1Str);
		double side2 = Double.parseDouble(s2Str);
		
		// Hypotenuse rounding
		double hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2, 2));
		hypotenuse *= 1000;
		int hypotenusePlaceholder = (int) Math.round(hypotenuse);
		hypotenuse = hypotenusePlaceholder / 1000.0;
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse + ".");
	}

}
