import javax.swing.JOptionPane;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nStr = JOptionPane.showInputDialog("Enter a number: ");
		int myNum = Integer.parseInt(nStr);
		if(myNum == 7) {
			System.out.println("Lucky Number!");
		} else {
			System.out.println("Try again!");
		}
	}
}
