package kup9_MenuManager;

/**
 * Class Menu
 * @author Kushal Parekh
 * created 10/13/22
 */




public class Menu {
	//member vars
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	//basic menu constructor
	/**
	 * 
	 * @param n
	 * constructor
	 */
	Menu(String n){
		this.name = n;
		this.entree = null;
		this.dessert = null;
		this.side = null;
		this.salad = null;
	}

	//menu with entree and side
	/**
	 * 
	 * @param n
	 * @param e
	 * @param s
	 * constructor with entree, side, name parameters
	 */
	Menu(String n, Entree e, Side s){
		this.entree = e;
		this.name = n;
		this.side = s;
		this.salad = null;
		this.dessert = null;
	}

	//menu with full course meal
	/**
	 * 
	 * @param n
	 * @param e
	 * @param s
	 * @param sa
	 * @param d
	 * constructor with all dish params and name
	 */
	Menu(String n, Entree e, Side s, Salad sa, Dessert d){
		this.entree = e;
		this.name = n;
		this.side = s;
		this.salad = sa;
		this.dessert = d;
	}

	//total calories adder
	//if no menu item, then no calories counted
	/**
	 * 
	 * @returns total amount of calories
	 */
	public int totalCalories() {
		int calories = 0;

		if(this.dessert == null) {
			calories += 0;
		}else {
			calories += this.dessert.getCalories();
		}

		if(this.side == null) {
			calories += 0;
		}else {
			calories += this.side.getCalories();
		}

		if(this.entree == null) {
			calories += 0;
		}else {
			calories += this.entree.getCalories();
		}

		if(this.salad == null) {
			calories += 0;
		}else {
			calories += this.salad.getCalories();
		}

		return calories;
	}

	//concatenate all item descriptions
	//no menu item, "N/A" appended
	/**
	 * 
	 * @return string of all descriptors for a Menu
	 */
	public String description() {
		String des;

		des = "Entree: ";
		if(this.entree == null) {
			des += "N/A\n";
		}else {
			des += this.entree.getName() + ". " + this.entree.getDescription() + "\n";
		}

		des += "Side: ";
		if(this.side == null) {
			des += "N/A\n";
		}else {
			des += this.side.getName() + ". " + this.side.getDescription() + "\n";
		}

		des += "Salad: ";
		if(this.salad == null) {
			des += "N/A\n";
		}else {
			des += this.salad.getName() + ". " + this.salad.getDescription() + "\n";
		}

		des += "Dessert: ";
		if(this.dessert == null) {
			des += "N/A";
		}else {
			des += this.dessert.getName() + ". " + this.dessert.getDescription();
		}

		return des;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}


}
