package kup9_lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay){
		super(name, address);
		this.pay = pay;
	}
	
	//added constructor to include school
	public Staff(String name, String address, String school, double pay){
		super(name, address);
		this.pay = pay;
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString(){
		return getName() + ", " + getAddress() + ", " + getSchool() + ", " + String.valueOf(getPay());
	}
}
