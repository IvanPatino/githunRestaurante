package Models;

public class Client {

	/// Attributes

	private String name;
	private String lastname;
	private String id;
	private boolean hasChildrens;

	/// Constructor

	public Client(String name, String lastname, String id, boolean hasChildrens) {

		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.hasChildrens = hasChildrens;

	}

	/// Methods / get / set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public boolean isHasChildrens() {
		return hasChildrens;
	}

	public void setHasChildrens(boolean hasChildrens) {
		this.hasChildrens = hasChildrens;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
