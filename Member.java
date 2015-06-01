package workshop;

public class Member extends Person{
	private int memberNumber;

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public Member(int memberNumber, String surname, String firstname, String secondname) {
		super(surname, firstname, secondname);
		// TODO Auto-generated constructor stub
		this.memberNumber=memberNumber;
	}

	@Override
	public String toString() {
		return  memberNumber+ " " +  super.toString();
	}
	
	public String show() {
		return  memberNumber+" " +  super.show();
	}
	
	
	
}
