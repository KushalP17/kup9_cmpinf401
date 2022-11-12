package kup9_lab9;

public class Driver {

	public static void main(String[] args) {
		//test program for classes/constructors
		
		Cylinder cyl = new Cylinder();
		System.out.println(cyl.getVolume());
		
		Cylinder c = new Cylinder(1, 1);
		System.out.println(c.getVolume());
		
		Student inko = new Student("Aiko", "249 Meyran", "Pharm", 2027, 80000.5);
		System.out.println(inko.toString());
		
		Staff kush = new Staff("Kushal", "201 Chesty", 125764.43);
		System.out.println(kush.toString());
		
	}

}
