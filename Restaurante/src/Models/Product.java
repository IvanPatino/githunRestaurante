package Models;

public class Product {

	/// Attributes

	private String name;
	private String brand;
	private int quantity;
	private double price;

	/// Constructor
	public Product(String name, String brand, int quantity, double price) {

		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;

	}

	/// Methods / get / set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
