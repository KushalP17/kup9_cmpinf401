package kup9_MenuManager;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * MenuManagerGUI
 * @author parek
 * created 12/12/2022
 */

public class MenuManagerGUI implements ActionListener {

	//GUI Properties

	//window, layout, menus, list model for created menus
	private JFrame MMG;
	private JPanel panel;
	private MenuManager menus;
	private ArrayList<Menu> menuList = new ArrayList<Menu>();
	//private Menu[] menuList = new Menu[] {new Menu("m")};
	private ListModel<Menu> menuItems = new DefaultListModel<Menu>();

	//right side of GUI
	//created menus, and buttons, and label
	private JLabel lblCreatedMenus;
	private JList<Menu> listCreatedMenus;
	private JButton btnDetails;
	private JButton btnDeleteAll;
	private JButton btnSaveFile;

	//top left of GUI
	//labels, dropdown boxes, and create menu button
	private JLabel lblBuildMenu;
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
	private JComboBox<Entree> cboEntree;
	private JComboBox<Side> cboSide;
	private JComboBox<Salad> cboSalad;
	private JComboBox<Dessert> cboDessert;
	private JButton btnCreateMenu;

	//bottom left of GUI
	//label and buttons
	private JLabel lblGenerateMenu;
	private JButton btnGenerateRand;
	private JButton btnGenerateMin;
	private JButton btnGenerateMax;



	//class constructor
	public MenuManagerGUI() {
		//new MenuManager
		menus = new MenuManager("data/dishes.txt");

		//sets window properties
		MMG = new JFrame("Menu Manager GUI");
		MMG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MMG.setSize(650, 430);
		MMG.setLocation(300, 100);

		//set layout properties
		panel = new JPanel();
		panel.setLayout(null);
		MMG.add(panel);

		//Build menu label & placement
		lblBuildMenu = new JLabel("Build your own Menu");
		lblBuildMenu.setBounds(10, 5, 150, 20);
		panel.add(lblBuildMenu);

		//menu item labels & placement
		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(lblBuildMenu.getX(), lblBuildMenu.getY() + 30, 100, 20);
		panel.add(lblEntree);

		lblSide = new JLabel("Side");
		lblSide.setBounds(lblBuildMenu.getX(), lblEntree.getY() + 30, 100, 20);
		panel.add(lblSide);

		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(lblBuildMenu.getX(), lblSide.getY() + 30, 100, 20);
		panel.add(lblSalad);

		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(lblBuildMenu.getX(), lblSalad.getY() + 30, 100, 20);
		panel.add(lblDessert);

		//combobox placement and loading of data
		cboEntree = new JComboBox(menus.getEntrees().toArray());
		cboEntree.setBounds(lblEntree.getX() + 55, lblEntree.getY(), 200, 20);
		panel.add(cboEntree);

		cboSide= new JComboBox(menus.getSides().toArray());
		cboSide.setBounds(lblSide.getX() + 55, lblSide.getY(), 200, 20);
		panel.add(cboSide);

		cboSalad = new JComboBox(menus.getSalads().toArray());
		cboSalad.setBounds(lblSalad.getX() + 55, lblSalad.getY(), 200, 20);
		panel.add(cboSalad);

		cboDessert = new JComboBox(menus.getDesserts().toArray());
		cboDessert.setBounds(lblDessert.getX() + 55, lblDessert.getY(), 200, 20);
		panel.add(cboDessert);

		//create menu button, placement, and event handler
		btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.setBounds(lblBuildMenu.getX(), lblDessert.getY() + 30, 255, 20);
		btnCreateMenu.addActionListener(this);
		panel.add(btnCreateMenu);


		//label and placement
		lblGenerateMenu = new JLabel("Or Generate a Menu");
		lblGenerateMenu.setBounds(lblBuildMenu.getX(), btnCreateMenu.getY() + 80, 150, 20);
		panel.add(lblGenerateMenu);

		//Generate menu buttons, with placements and event handlers
		btnGenerateRand = new JButton("Generate a Random Menu");
		btnGenerateRand.setBounds(lblBuildMenu.getX(), lblGenerateMenu.getY() + 40, 255, 20);
		btnGenerateRand.addActionListener(this);
		panel.add(btnGenerateRand);

		btnGenerateMin = new JButton("Generate a Minimum Calories Menu");
		btnGenerateMin.setBounds(lblBuildMenu.getX(), btnGenerateRand.getY() + 40, 255, 20);
		btnGenerateMin.addActionListener(this);
		panel.add(btnGenerateMin);

		btnGenerateMax = new JButton("Generate a Maximum Calories Menu");
		btnGenerateMax.setBounds(lblBuildMenu.getX(), btnGenerateMin.getY() + 40, 255, 20);
		btnGenerateMax.addActionListener(this);
		panel.add(btnGenerateMax);


		//created menu label and placement
		lblCreatedMenus = new JLabel("Created Menus:");
		lblCreatedMenus.setBounds(lblBuildMenu.getX() + 300, lblBuildMenu.getY(), 250, 20);
		panel.add(lblCreatedMenus);

		//created menus list
		listCreatedMenus = new JList<Menu>(menuItems);
		listCreatedMenus.setBounds(lblCreatedMenus.getX(), lblCreatedMenus.getY() + 20, 315, 320);
		panel.add(listCreatedMenus);

		//menu list buttons, placement and event handlers
		btnDetails = new JButton("Details");
		btnDetails.setBounds(lblCreatedMenus.getX(), listCreatedMenus.getY() + listCreatedMenus.getHeight() + 10, 100, 20);
		btnDetails.addActionListener(this);
		panel.add(btnDetails);

		btnDeleteAll = new JButton("Delete all");
		btnDeleteAll.setBounds(lblCreatedMenus.getX() + btnDetails.getWidth() + 8, listCreatedMenus.getY() + listCreatedMenus.getHeight() + 10, 100, 20);
		btnDeleteAll.addActionListener(this);
		panel.add(btnDeleteAll);

		btnSaveFile = new JButton("Save to File");
		btnSaveFile.setBounds(btnDeleteAll.getX() + btnDeleteAll.getWidth() + 8, listCreatedMenus.getY() + listCreatedMenus.getHeight() + 10, 100, 20);
		btnSaveFile.addActionListener(this);
		panel.add(btnSaveFile);

	}

	//all event handlers
	public void actionPerformed(ActionEvent e) {
		//get the button that signaled an event
		JButton btnAction = (JButton) e.getSource();

		//according to the button label, perform a different task
		switch (btnAction.getText()) {
		//new menu from combo boxes, prompted with name
		//if null name, no menu created, default name of " "
		//menu added to list
		case "Create Menu with these dishes":
			Entree en = (Entree) cboEntree.getSelectedItem();
			Side si = (Side) cboSide.getSelectedItem();
			Salad sa = (Salad) cboSalad.getSelectedItem();
			Dessert d = (Dessert) cboDessert.getSelectedItem();
			String mName;
			mName = JOptionPane.showInputDialog("Name of Your Menu:", " ");

			if(mName != null) {
				Menu m = new Menu(mName, en, si, sa, d);
				menuList.add(m);
				((DefaultListModel<Menu>) menuItems).addElement(m);
			}

			break;

		case "Generate a Random Menu":
			//generate random menu, name prompted and checked
			//menu added to list
			String randName = JOptionPane.showInputDialog("Name of Your Random Menu:", " ");

			if(randName != null) {
				Menu rM = menus.randomMenu(randName);
				menuList.add(rM);
				((DefaultListModel<Menu>) menuItems).addElement(rM);
			}
			break;

		case "Generate a Minimum Calories Menu":
			//generate min cals menu, name prompted/checked
			//menu added to list
			String minName = JOptionPane.showInputDialog("Name of Your Minimum Calories Menu:", " ");

			if(minName != null) {
				Menu minM = menus.minCaloriesMenu(minName);
				menuList.add(minM);
				((DefaultListModel<Menu>) menuItems).addElement(minM);
			}
			break;

		case "Generate a Maximum Calories Menu":
			//generate max cals menu, name prompted/checked
			//menu added to list
			String maxName = JOptionPane.showInputDialog("Name of Your Maximum Calories Menu:", " ");

			if(maxName != null) {
				Menu maxM = menus.maxCaloriesMenu(maxName);
				menuList.add(maxM);
				((DefaultListModel<Menu>) menuItems).addElement(maxM);
			}
			break;

		case "Details":
			//constructs new window for menu selected, otherwise no 
			//new window created
			if(listCreatedMenus.getSelectedIndex() != -1) {
				Menu s = menuList.get(listCreatedMenus.getSelectedIndex());
				detailWindow(s);
			}
			break;

		case "Delete all":
			//clears the menu arraylist and menu displayed list
			menuList.clear();
			((DefaultListModel<Menu>) menuItems).removeAllElements();
			break;

		case "Save to File":
			//creates file of all current created menus
			FileManager.writeMenus("data/menu.txt", menuList);
			break;


		}
	}

	public void detailWindow(Menu m) {
		//window configuration
		JFrame dFrame = new JFrame("Menu: " + m.getName());
		dFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dFrame.setSize(550, 450);
		dFrame.setLocation(330, 130);

		//window layout
		JPanel pa = new JPanel();
		pa.setLayout(null);
		dFrame.add(pa);

		//menu descriptor labels and placement
		JLabel lblE = new JLabel("Entree");
		lblE.setBounds(10, 20, 75, 20);
		pa.add(lblE);

		JLabel lblSi = new JLabel("Side");
		lblSi.setBounds(lblE.getX(), lblE.getY() + 70, 85, 20);
		pa.add(lblSi);

		JLabel lblSa = new JLabel("Salad");
		lblSa.setBounds(lblSi.getX(), lblSi.getY() + 70, 85, 20);
		pa.add(lblSa);

		JLabel lblD = new JLabel("Dessert");
		lblD.setBounds(lblSa.getX(), lblSa.getY() + 70, 85, 20);
		pa.add(lblD);

		JLabel lblCals = new JLabel("Total Calories:");
		lblCals.setBounds(lblD.getX(), lblD.getY() + 80, 85, 20);
		pa.add(lblCals);

		JLabel lblTotalPrice = new JLabel("Total price: $");
		lblTotalPrice.setBounds(lblCals.getX(), lblCals.getY() + 50, 85, 20);
		pa.add(lblTotalPrice);

		//menu descriptor info configuration, placement, and text formatting
		JTextArea textAreaEntree = new JTextArea(2, 1);
		JScrollPane tAESP = new JScrollPane(textAreaEntree);
		textAreaEntree.setEditable(false);
		textAreaEntree.append(m.getEntree().getName() + "\n" + m.getEntree().getDescription() + " Calories: " + m.getEntree().getCalories() + ". Price $" + String.format("%.2f", m.getEntree().getPrice())); //price displays with 2 decimals always
		textAreaEntree.setLineWrap(true);
		textAreaEntree.setWrapStyleWord(true);
		tAESP.setBounds(lblE.getX() + 100, lblE.getY(), 420, 60);
		pa.add(tAESP);

		JTextArea textAreaSide = new JTextArea(2, 1);
		JScrollPane tASiSP = new JScrollPane(textAreaSide);
		textAreaSide.setEditable(false);
		textAreaSide.append(m.getSide().getName() + "\n" + m.getSide().getDescription() + " Calories: " + m.getSide().getCalories() + ". Price $" + String.format("%.2f", m.getSide().getPrice()));
		textAreaSide.setLineWrap(true);
		textAreaSide.setWrapStyleWord(true);
		tASiSP.setBounds(lblSi.getX() + 100, lblSi.getY(), 420, 60);
		pa.add(tASiSP);

		JTextArea textAreaSalad = new JTextArea(2, 1);
		JScrollPane tASaSP = new JScrollPane(textAreaSalad);
		textAreaSalad.setEditable(false);
		textAreaSalad.append(m.getSalad().getName() + "\n" + m.getSalad().getDescription() + " Calories: " + m.getSalad().getCalories() + ". Price $" + String.format("%.2f", m.getSalad().getPrice()));
		textAreaSalad.setLineWrap(true);
		textAreaSalad.setWrapStyleWord(true);
		tASaSP.setBounds(lblSa.getX() + 100, lblSa.getY(), 420, 60);
		pa.add(tASaSP);

		JTextArea textAreaDessert = new JTextArea(2, 1);
		JScrollPane tADSP = new JScrollPane(textAreaDessert);
		textAreaDessert.setEditable(false);
		textAreaDessert.append(m.getDessert().getName() + "\n" + m.getDessert().getDescription() + " Calories: " + m.getDessert().getCalories() + ". Price $" + String.format("%.2f", m.getDessert().getPrice()));
		textAreaDessert.setLineWrap(true);
		textAreaDessert.setWrapStyleWord(true);
		tADSP.setBounds(lblD.getX() + 100, lblD.getY(), 420, 60);
		pa.add(tADSP);

		//small descriptor boxes, only with numbers displayed
		JTextArea textAreaCalories = new JTextArea(1, 1);
		JScrollPane tACSP = new JScrollPane(textAreaCalories);
		textAreaCalories.setEditable(false);
		textAreaCalories.append(Integer.toString(m.totalCalories()));
		textAreaCalories.setLineWrap(true);
		textAreaCalories.setWrapStyleWord(true);
		tACSP.setBounds(lblCals.getX() + 100, lblCals.getY(), 100, 20);
		pa.add(tACSP);

		JTextArea textAreaPrice = new JTextArea(1, 1);
		JScrollPane tAPSP = new JScrollPane(textAreaPrice);
		textAreaPrice.setEditable(false);
		textAreaPrice.append(String.format("%.2f", m.totalPrice()));
		textAreaPrice.setLineWrap(true);
		textAreaPrice.setWrapStyleWord(true);
		tAPSP.setBounds(lblTotalPrice.getX() + 100, lblTotalPrice.getY(), 100, 20);
		pa.add(tAPSP);

		//show window
		dFrame.setVisible(true);

	}


	public static void main(String[] args) {
		//make main GUI
		MenuManagerGUI app = new MenuManagerGUI();
		app.MMG.setVisible(true);

	}

}
