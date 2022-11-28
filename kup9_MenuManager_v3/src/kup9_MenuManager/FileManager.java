package kup9_MenuManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * class FileManager
 * @author Kushal Parekh
 * created 11/3/22
 * edited last 11/24/22
 *
 */

public class FileManager {

	/**
	 * 
	 * @param fileName
	 * @return ArrayList of all MenuItems from file
	 */
	static public ArrayList<MenuItem> readItems(String fileName){
		//arraylist full of MenuItem objects
		ArrayList<MenuItem> readIn = new ArrayList<MenuItem>();

		//try catch for file reading
		try {

			//enclosed file reading formats
			FileReader fr = new FileReader(fileName);
			BufferedReader infile = new BufferedReader(fr);

			String line = null;
			String[] itemDescrip;

			//read all lines from file
			while((line = infile.readLine()) != null) {
				//split item using @@
				//format of entry is
				//name@@type@@description@@calories@@price
				itemDescrip = line.split("@@");

				String type = itemDescrip[1];

				//make calories an integer
				int cals = Integer.parseInt(itemDescrip[3]);

				//make price into double
				double price = Double.parseDouble(itemDescrip[4]);

				//specified object created for each line read in
				switch(type){
				case "entree":
					Entree entItem = new Entree(itemDescrip[0], itemDescrip[2], cals, price);
					readIn.add(entItem);
					break;
				case "side":
					Side sideItem = new Side(itemDescrip[0], itemDescrip[2], cals, price);
					readIn.add(sideItem);
					break;
				case "salad":
					Salad salItem = new Salad(itemDescrip[0], itemDescrip[2], cals, price);
					readIn.add(salItem);
					break;
				case "dessert":
					Dessert desItem = new Dessert(itemDescrip[0], itemDescrip[2], cals, price);
					readIn.add(desItem);
					break;
				}

			}

			//close files
			infile.close();
			fr.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return readIn;

	}

	/**
	 * 
	 * @param filename for outfile
	 * @param ArrayList<Menu> of all made Menus
	 */
	static public void writeMenus(String filename, ArrayList<Menu> menus){


		try {

			File obj = new File(filename);
			obj.createNewFile();
			FileWriter fw = new FileWriter(filename);
			BufferedWriter outfile = new BufferedWriter(fw);

			for(int i = 0; i < menus.size(); i++) {
				Menu menu = menus.get(i);

				Entree e = menu.getEntree();
				Side si = menu.getSide();
				Salad sa = menu.getSalad();
				Dessert d = menu.getDessert();

				outfile.write("Menu " + menu.getName() + ":\n");
				outfile.write("\tSalad: " + sa.getName() + "\n");
				outfile.write("\t\t" + sa.getDescription() + "\tCalories: " + String.valueOf(sa.getCalories()) + "\t$" + String.valueOf(sa.getPrice()) + "\n");
				outfile.write("\tSide: " + si.getName() + "\n");
				outfile.write("\t\t" + si.getDescription() + "\tCalories: " + String.valueOf(si.getCalories()) + "\t$" + String.valueOf(si.getPrice()) + "\n");
				outfile.write("\tEntree: " + e.getName() + "\n");
				outfile.write("\t\t" + e.getDescription() + "\tCalories: " + String.valueOf(e.getCalories()) + "\t$" + String.valueOf(e.getPrice()) + "\n");
				outfile.write("\tDessert: " + d.getName() + "\n");
				outfile.write("\t\t" + d.getDescription() + "\tCalories: " + String.valueOf(d.getCalories()) + "\t$" + String.valueOf(d.getPrice()) + "\n");
				outfile.write("Total Calories: " + String.valueOf(menu.totalCalories()) + "\n");
				outfile.write("Total Price: $" + String.valueOf(menu.totalPrice()));
				outfile.write("\n\n\n");

			}

			outfile.close();
			fw.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
