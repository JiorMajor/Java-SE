package workshop;

import java.util.ArrayList;
import java.util.HashMap;

public class Club {
	/*
	 * private int currentNumber = 0; private Member members[] = new Member[0];
	 * 
	 * public Member addMember(Person p) { checkArraySize(); currentNumber++;
	 * Member m = new Member(currentNumber, p.getSurname(), p.getFirstname(),
	 * p.getSecondname()); members[currentNumber - 1] = m; //
	 * System.out.println(m.show()); return m; }
	 * 
	 * public void checkArraySize() { if (currentNumber >= members.length) {
	 * Member newMember[]; int newsize = currentNumber + 1; newMember = new
	 * Member[newsize]; for (int i = 0; i < currentNumber; i++) { newMember[i] =
	 * members[i]; } members = newMember; } }
	 * 
	 * public void showMembers() { for (Member m : members) { if (m != null) {
	 * System.out.println(m.show()); } } }
	 * 
	 * public void removeMember(int memberNo) { for (int i = 0; i <
	 * members.length; i++) { if (i == memberNo) members[memberNo - 1] = null; }
	 * }
	 * 
	 * public void removeMembers() { for (int i = 0; i < members.length; i++) {
	 * members[i] = null; } System.out.println("No Members."); }
	 */
	private int currentNumber = 0;
	private ArrayList<Member> members;
	private HashMap<String, Facility> facilityHashMap;

	public Club() {

		members = new ArrayList<Member>();
		facilityHashMap = new HashMap<String, Facility>();

	}

	public Member addMember(Person p) {
		Member m = new Member(currentNumber + 1, p.getSurname(),
				p.getFirstname(), p.getSecondname());
		currentNumber++;
		members.add(m);
		return m;
	}

	public void showMembers() {
		for (Member member : members) {
			System.out.println(member.show());

		}
	}

	public void removeMember(int memberNo) {
		members.remove(memberNo - 1);
	}

	public void removeMembers() {
		members.removeAll(members);
		System.out.println("No Members.");
		showMembers();
	}

	public void addFacility(Facility f) {
		facilityHashMap.put(f.getName(), f);
	}
	
	public void addFacility2(String name, String description) {
		if(name==null) {
			return;
		}
		else if(description==null) {
			Facility f = new Facility(name);
			facilityHashMap.put(f.getName(), f);
		}
		else {
			Facility f = new Facility(name, description);
			facilityHashMap.put(f.getName(), f);
		}
	}
	
	public Facility getFacility(String name) {
		if (facilityHashMap.containsKey(name)) {
			Facility f = facilityHashMap.get(name);
			return f;
		} else {
			System.out.println("not found");
			return null;
		}
		
	}
	
	public ArrayList<Facility> getFacilities(){
		ArrayList<Facility> facilitiesList = new ArrayList<Facility>(facilityHashMap.values());
		return facilitiesList;
	}
	
	public void showFacilities() {
		ArrayList<Facility> newFacilitiesList = getFacilities();
		for (Facility facility : newFacilitiesList) {
			System.out.println(facility.show());
		}
	}
}
