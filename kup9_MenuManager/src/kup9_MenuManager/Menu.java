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
	Menu(String n){
		this.name = n;
		this.entree = null;
		this.dessert = null;
		this.side = null;
		this.salad = null;
	}

	//menu with entree and side
	Menu(String n, Entree e, Side s){
		this.entree = e;
		this.name = n;
		this.side = s;
		this.salad = null;
		this.dessert = null;
	}

	//menu with full course meal
	Menu(String n, Entree e, Side s, Salad sa, Dessert d){
		this.entree = e;
		this.name = n;
		this.side = s;
		this.salad = sa;
		this.dessert = d;
	}

	//total calories adder
	//if no menu item, then no calories counted
	public int totalCalories() {
		int calories = 0;

		if(this.dessert == null) {
			calories += 0;
		}else {
			calories += this.dessert.calories;
		}

		if(this.side == null) {
			calories += 0;
		}else {
			calories += this.side.calories;
		}

		if(this.entree == null) {
			calories += 0;
		}else {
			calories += this.entree.calories;
		}

		if(this.salad == null) {
			calories += 0;
		}else {
			calories += this.salad.calories;
		}

		return calories;
	}

	//concatenate all item descriptions
	//no menu item, "N/A" appended
	public String description() {
		String des;

		des = "Entree: ";
		if(this.entree == null) {
			des += "N/A\n";
		}else {
			des += this.entree.name + ". " + this.entree.description + "\n";
		}

		des += "Side: ";
		if(this.side == null) {
			des += "N/A\n";
		}else {
			des += this.side.name + ". " + this.side.description + "\n";
		}

		des += "Salad: ";
		if(this.salad == null) {
			des += "N/A\n";
		}else {
			des += this.salad.name + ". " + this.salad.description + "\n";
		}

		des += "Dessert: ";
		if(this.dessert == null) {
			des += "N/A";
		}else {
			des += this.dessert.name + ". " + this.dessert.description;
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
