package kup9_MenuManager;

import java.util.ArrayList;

/**
 * 
 * Class MenuTester
 * @author parek
 * created 11/4/22 (copied from assignment doc)
 * edited last 11/24/22
 *
 */
public class MenuTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize random menu object
		//loads all dishes into system
		MenuManager menuLoader = new MenuManager("data/dishes.txt");

		//creates randomized Menu object from randomMenu
		Menu m = menuLoader.randomMenu("random");
		Menu min = menuLoader.minCaloriesMenu("min");
		Menu max = menuLoader.maxCaloriesMenu("max");

		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(m);
		menus.add(min);
		menus.add(max);

		FileManager.writeMenus("data/menu.txt", menus);

	}

}
