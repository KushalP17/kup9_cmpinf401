package kup9_MenuManager;

/**
 * Class Salad
 * @author Kushal Parekh
 * created 10/13/22
 */




public class Salad {
	//members vars
	private String name;
	private String description;
	private int calories;

	//salad constructor
	Salad(String n, String d, int c){
		this.name = n;
		this.description = d;
		this.calories = c;
	}

	//getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


}
