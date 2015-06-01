package workshop;

public class Facility {
	private String name;
	private String description;

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// constructor
	public Facility(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Facility(String name) {
		this.name = name;
	}

	// Methods
	@Override
	public String toString() {
		if (getDescription() == null) {
			return  name;
		} else {
			return  name + " ( " + description +" )";
		}

	}

	public String show() {
		if (getDescription() == null) {
			return  name;
		} else {
			return  name + " ( " + description+" )";
		}
	}
}
