package Models;

public class Table {

	/// Attributes

	private String number;
	private int capacity;
	private String ubication;

	/// Constructor

	public Table(String number, int capacity, String ubication) {

		this.number = number;
		this.capacity = capacity;
		this.ubication = ubication;

	}

	/// Methods / get / set

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

}
