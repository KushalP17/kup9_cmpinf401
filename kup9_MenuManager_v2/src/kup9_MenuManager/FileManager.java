package kup9_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * class FileManager
 * @author Kushal Parekh
 * created 11/3/22
 *
 */

public class FileManager {

	/**
	 * 
	 * @param fileName
	 * @return ArrayList of all entrees from file
	 */
	static ArrayList<Entree> readEntree(String fileName){
		//arraylist full of entree objects
		ArrayList<Entree> readIn = new ArrayList<Entree>();

		//try catch for file reading
		try {

			//enclosed file reading formats
			FileReader fr = new FileReader(fileName);
			BufferedReader infile = new BufferedReader(fr);

			String line = null;
			String[] entDescrip;

			//read all lines from file
			while((line = infile.readLine()) != null) {
				//split entries using @@
				entDescrip = line.split("@@");

				//make calories an integer
				int cals = Integer.parseInt(entDescrip[2]);

				//entree object created for each line read in
				Entree entNew = new Entree(entDescrip[0], entDescrip[1], cals);

				//entree object added to arrayList
				readIn.add(entNew);
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
	 * @param fileName
	 * @return ArrayList of all sides from file
	 */
	static ArrayList<Side> readSides(String fileName){
		//"" from Entree
		ArrayList<Side> readIn = new ArrayList<Side>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader infile = new BufferedReader(fr);

			String line = null;
			String[] siDescrip;


			while((line = infile.readLine()) != null) {
				siDescrip = line.split("@@");
				int cals = Integer.parseInt(siDescrip[2]);
				Side siNew = new Side(siDescrip[0], siDescrip[1], cals);
				readIn.add(siNew);
			}

			infile.close();
			fr.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return readIn;

	}

	/**
	 * 
	 * @param fileName
	 * @return ArrayList of all salads from file
	 */
	static ArrayList<Salad> readSalads(String fileName){
		//"" from Entree
		ArrayList<Salad> readIn = new ArrayList<Salad>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader infile = new BufferedReader(fr);

			String line = null;
			String[] salDescrip;


			while((line = infile.readLine()) != null) {
				salDescrip = line.split("@@");
				int cals = Integer.parseInt(salDescrip[2]);
				Salad saNew = new Salad(salDescrip[0], salDescrip[1], cals);
				readIn.add(saNew);
			}

			infile.close();
			fr.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return readIn;

	}

	/**
	 * 
	 * @param fileName
	 * @return ArrayList of all desserts from file
	 */
	static ArrayList<Dessert> readDesserts(String fileName){
		//"" from Entree
		ArrayList<Dessert> readIn = new ArrayList<Dessert>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader infile = new BufferedReader(fr);

			String line = null;
			String[] desDescrip;


			while((line = infile.readLine()) != null) {
				desDescrip = line.split("@@");
				int cals = Integer.parseInt(desDescrip[2]);
				Dessert dNew = new Dessert(desDescrip[0], desDescrip[1], cals);
				readIn.add(dNew);
			}

			infile.close();
			fr.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return readIn;

	}
}
