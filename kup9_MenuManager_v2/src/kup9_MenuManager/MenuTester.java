package kup9_MenuManager;

/**
 * 
 * Class MenuTester
 * @author parek
 * created 11/4/22 (copied from assignment doc)
 *
 */
public class MenuTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize random menu object
		//loads all dishes into system
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");

		//creates randomized Menu object from randomMenu
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+ myMenu.totalCalories());

	}

}
