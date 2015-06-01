package workshop;

public class Person {
	private String surname;
	private String firstname;
	private String secondname;
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	
	public Person(String surname, String firstname, String secondname) {
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = secondname;
	}
	
	@Override
	public String toString() {
		if(getSecondname()==null) {
			return  getSurname() + " " + getFirstname();
		}
		else {
			return  getSurname() + " " + getFirstname()
					+ " " + getSecondname();
		}
	}
	
	public String show() {
		if(getSecondname()==null) {
			return  getSurname() + " " + getFirstname();
		}
		else {
			return  getSurname() + " " + getFirstname()
					+ " " + getSecondname();
		}
	}
		
}
