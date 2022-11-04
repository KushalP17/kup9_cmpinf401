package kup9_MenuManager;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * Class MenuRandomize
 * @author parek
 * Created 11/4/22
 *
 */
public class MenuRandomize {

	//arrayLists for all dish objects
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;


	/**
	 * Method MenuRandomize
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 * Constructor
	 * //runs each loading function for the dishes
	 */
	MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile){
		this.entrees = FileManager.readEntree(entreeFile);
		this.sides = FileManager.readSides(sideFile);
		this.salads = FileManager.readSalads(saladFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}

	/**
	 * 
	 * @returns Menu object
	 * 
	 * //creates randomMenu
	 */
	Menu randomMenu() {

		//random object declaration
		Random rand = new Random();

		//dish object from dish arrayList
		//chosen by randomly selecting int with the range of 0 to the size of ArrayList
		Entree e = entrees.get(rand.nextInt(entrees.size()));
		Side s = sides.get(rand.nextInt(sides.size()));
		Salad g = salads.get(rand.nextInt(salads.size()));
		Dessert d = desserts.get(rand.nextInt(desserts.size()));

		//initialize random Menu from random dishes
		Menu randMenu = new Menu("Random Menu", e, s, g, d);
		return randMenu;
	}
}
