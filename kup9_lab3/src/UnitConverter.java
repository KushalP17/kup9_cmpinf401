import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input from User
		String unitInput = JOptionPane.showInputDialog("Enter a measurement of either weight or distance: ");
		String unit;
		double measurement, convertedMeasurement;
		
		//Variables that get input attributes so the string can be processed
		int splice = unitInput.indexOf(' '), length = unitInput.length();
		
		//space exists between measurement and unit
		if(splice >= 0) {
			//separate unit and measurement
			unit = unitInput.substring(splice+1, length);
			measurement = Double.parseDouble(unitInput.substring(0,splice));
			
			//conversion switch case
			switch(unit) {
			case "in": 
				convertedMeasurement = measurement * 2.54;
				System.out.println(unitInput + " = " + convertedMeasurement + " cm");
				break;
			case "cm":
				convertedMeasurement = measurement / 2.54;
				System.out.println(unitInput + " = " + convertedMeasurement + " in");
				break;
			case "yd":
				convertedMeasurement = measurement * .9144;
				System.out.println(unitInput + " = " + convertedMeasurement + " m");
				break;
			case "m":
				convertedMeasurement = measurement / .9144;
				System.out.println(unitInput + " = " + convertedMeasurement + " yd");
				break;
			case "oz":
				convertedMeasurement = measurement * 28.35;
				System.out.println(unitInput + " = " + convertedMeasurement + " gm");
				break;
			case "gm":
				convertedMeasurement = measurement / 28.35;
				System.out.println(unitInput + " = " + convertedMeasurement + " oz");
				break;
			case "lb":
				convertedMeasurement = measurement * .4536;
				System.out.println(unitInput + " = " + convertedMeasurement + " kg");
				break;
			case "kg":
				convertedMeasurement = measurement / .4536;
				System.out.println(unitInput + " = " + convertedMeasurement + " lb");
				break;
			default: 
				//Error Check unit inputs
				System.out.println("Invalid Unit Entered!");
				System.out.println("Only converts normal SI and Imperial Mass and Distance Measurements!");
			}
			
		}else {
			System.out.println("Please separate the measurement and unit by a space!");
			System.out.println("Run the Program Again!");
		}
		
		
	}

}
