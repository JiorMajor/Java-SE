package workshop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClubApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person");
		Person p1 = new Person("Phoo", "Pwint", "Wai");
		Person p2 = new Person("Chan", "Pyae", "Aung");
		System.out.println(p1.show());
		System.out.println(p2);
		System.out.println("------------------------------------------");
		System.out.println("Facility");
		Facility f1 = new Facility("San Si Ro");
		Facility f2 = new Facility("Old Trafford", "Football stadium own by ManchesterUnited");
		System.out.println(f1);
		System.out.println(f2.show());
		System.out.println("------------------------------------------");
		System.out.println("Member");
		Member m1 = new Member(111, p1.getSurname(), p1.getFirstname(), p1.getSecondname());
		Member m2 = new Member(112, p2.getSurname(), p2.getFirstname(), p2.getSecondname());
		System.out.println(m1);
		System.out.println(m2.show());
		System.out.println("------------------------------------------");
		System.out.println("Club");
		Club c1 = new Club();
		c1.addMember(p1);
		c1.addMember(p2);
		c1.addMember(p1);
		c1.addMember(p2);
		System.out.println("Current Members");
		c1.showMembers();
		System.out.println("Remove one member");
		c1.removeMember(3);
		c1.showMembers();
		System.out.println("Remove All members");
		c1.removeMembers();
		c1.showMembers();
		System.out.println("------------------------------------------");
		System.out.println("HashMap");
		c1.addFacility(f1);
		c1.addFacility(f2);
		c1.addFacility2("House Lannister", "Lannisters always pays his debt.");
		c1.addFacility2("House of Black & White","Valar Moghulis.");
		System.out.println("Get one facilities.");
		System.out.println(c1.getFacility("Old Trafford"));
		System.out.println("Get all facilities.");
		System.out.println(c1.getFacilities());
		System.out.println("Show all facilities.");
		c1.showFacilities();
		System.out.println("Booking");
		SimpleDateFormat df = new SimpleDateFormat("d-MMM-yyyy");
		try {
			Booking b = new Booking(m1, c1.getFacility("House Lannister"), df.parse("1-Jun-2015"),df.parse("10-Jun-2015"));
			Booking b1 = new Booking(m2, c1.getFacility("House Lannister"), df.parse("1-Jun-2015"),df.parse("10-Jun-2015"));
			//Booking b2 = new Booking(m1, c1.getFacility("House Lannister"), df.parse("16-Jun-2015"),df.parse("10-Jun-2015"));
			if(b1.overlaps(b)) {
				throw new BadBookingException("This Facility is already booked.");
			}
			b.show();
			b1.toString();
			//b2.show();
		}
		catch (BadBookingException b) {
			System.out.println(b.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
