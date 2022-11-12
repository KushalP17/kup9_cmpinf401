package kup9_lab9;

public class Circle {
	private double radius = 5.0;
	private String color = "Green";
	
	public Circle(){
		radius = 5.0;
		color = "Green";
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
