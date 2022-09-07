package lab2;

import javax.swing.JOptionPane;

public class kup9_L2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = Integer.parseInt(JOptionPane.showInputDialog("Enter an amount of money: "));
		
		int grands = money / 1000;
		int residual = money % 1000;
		
		int benjamins = residual / 100;
		residual %= 100;
		
		int sawbucks = residual / 10;
		residual %= 10;
		
		int bucks = residual;
		
		System.out.println(grands + " grands\n");
		System.out.println(benjamins + " benjamins\n");
		System.out.println(sawbucks + " sawbucks\n");
		System.out.println(bucks + " bucks\n");
	}

}
