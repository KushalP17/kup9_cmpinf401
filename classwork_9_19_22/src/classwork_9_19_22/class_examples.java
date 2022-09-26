package classwork_9_19_22;

public class class_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car();
		c1.color = "red";
		c1.make = "SUV";
		c1.speed = 0;
		
		System.out.println(c1.make);
		System.out.println(c1.speed);
		c1.start();
		c1.accelerate(15);
		System.out.println(c1.speed);
		c1.slowDown(100);
		System.out.println(c1.speed);


	}

}
