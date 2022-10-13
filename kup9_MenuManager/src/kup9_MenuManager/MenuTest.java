package kup9_MenuManager;

public class MenuTest {

	public static void main(String[] args) {

		//declare new entree objects
		Entree turkey = new Entree("Turkey", "It's Turkey", 20);
		Entree chicken = new Entree("Chicken", "It's Chicken", 25);

		//declare side object
		Side corn = new Side("Corn", "Corn", 15);

		//declare salad objects
		Salad caesar = new Salad("Caesar Salad", "Stab", 120);
		Salad italian = new Salad("Italian Salad", "So much dressing", 150);

		//declare dessert object
		Dessert brownie = new Dessert("Brownie", "N/A", 75);

		//Menu constructor with entree and salad
		Menu turkMeal = new Menu("Turkey Meal", turkey, null, caesar, null);

		//Menu constructor with all parameters filled
		Menu chickMealBig = new Menu("Big Ol' Chicken Meal", chicken, corn, italian, brownie);


		//print out menu attributes for both menu objects
		System.out.println(turkMeal.getName());
		System.out.println(turkMeal.description());
		System.out.println(turkMeal.totalCalories() + " calories\n");
		System.out.println(chickMealBig.getName());
		System.out.println(chickMealBig.description());
		System.out.println(chickMealBig.totalCalories() + " calories");



	}

}
