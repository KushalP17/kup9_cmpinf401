package kup9_MenuManager;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * Class MenuManager
 * @author parek
 *created 11/24/22
 *
 */


public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);

		for(int i = 0; i < items.size(); i++) {
			MenuItem item = items.get(i);

			if(item instanceof Entree) {
				entrees.add((Entree) item);
			}else if(item instanceof Side){
				sides.add((Side) item);
			}else if(item instanceof Salad) {
				salads.add((Salad) item);
			}else if(item instanceof Dessert) {
				desserts.add((Dessert) item);
			}
		}
	}

	public Menu randomMenu(String name) {
		//random object declaration
		Random rand = new Random();

		//dish object from dish arrayList
		//chosen by randomly selecting int with the range of 0 to the size of ArrayList
		Entree e = entrees.get(rand.nextInt(entrees.size()));
		Side s = sides.get(rand.nextInt(sides.size()));
		Salad g = salads.get(rand.nextInt(salads.size()));
		Dessert d = desserts.get(rand.nextInt(desserts.size()));

		//initialize random Menu from random dishes
		Menu randMenu = new Menu(name, e, s, g, d);
		return randMenu;
	}

	public Menu minCaloriesMenu(String name) {
		Entree minE = entrees.get(0);
		Salad minSa = salads.get(0);
		Side minSi = sides.get(0);
		Dessert minD = desserts.get(0);

		for(int i = 0; i < entrees.size(); i++) {
			if(entrees.get(i).getCalories() < minE.getCalories()) {
				minE = entrees.get(i);
			}
		}

		for(int i = 0; i < sides.size(); i++) {
			if(sides.get(i).getCalories() < minSi.getCalories()) {
				minSi = sides.get(i);
			}
		}

		for(int i = 0; i < salads.size(); i++) {
			if(salads.get(i).getCalories() < minSa.getCalories()) {
				minSa = salads.get(i);
			}
		}

		for(int i = 0; i < desserts.size(); i++) {
			if(desserts.get(i).getCalories() < minD.getCalories()) {
				minD = desserts.get(i);
			}
		}

		Menu M = new Menu(name, minE, minSi, minSa, minD);
		return M;


	}

	public Menu maxCaloriesMenu(String name) {
		Entree maxE = entrees.get(0);
		Salad maxSa = salads.get(0);
		Side maxSi = sides.get(0);
		Dessert maxD = desserts.get(0);

		for(int i = 0; i < entrees.size(); i++) {
			if(entrees.get(i).getCalories() > maxE.getCalories()) {
				maxE = entrees.get(i);
			}
		}

		for(int i = 0; i < sides.size(); i++) {
			if(sides.get(i).getCalories() > maxSi.getCalories()) {
				maxSi = sides.get(i);
			}
		}

		for(int i = 0; i < salads.size(); i++) {
			if(salads.get(i).getCalories() > maxSa.getCalories()) {
				maxSa = salads.get(i);
			}
		}

		for(int i = 0; i < desserts.size(); i++) {
			if(desserts.get(i).getCalories() > maxD.getCalories()) {
				maxD = desserts.get(i);
			}
		}

		Menu M = new Menu(name, maxE, maxSi, maxSa, maxD);
		return M;
	}


	//getters and setters
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}
