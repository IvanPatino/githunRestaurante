package Models;

public class Recipe {

	/// Attributes

	private String name;
	private double price;

	/// Constructor

	public Recipe(String name, double price) {

		this.name = name;
		this.price = price;

	}

	/// Methods / get / set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
