package workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class BookingRegister {
	
	private HashMap<Facility, ArrayList<Booking>> bookRegisterhm;

	public BookingRegister() {
		bookRegisterhm = new HashMap<Facility, ArrayList<Booking>>();
	}
	
	public void addBooking(Facility f, Member m, Date sDate, Date eDate) throws BadBookingException{
		Booking b = new Booking(m, f, sDate, eDate);
		ArrayList<Booking> bookings = bookRegisterhm.get(f);
		if(bookings==null) {
			bookings = new ArrayList<Booking>();
			bookRegisterhm.put(f, bookings);
		}
		else {
			for (Booking booking : bookings) {
				
				if(booking.overlaps(b)) {
					throw new BadBookingException("Bookings are ovelap.");
				}
					
			}
		}
		bookings.add(b);
//		System.out.println("Booking success!");
	}
	
	public ArrayList<Booking> getBooking(Facility f){
		ArrayList<Booking> bookinglist = new ArrayList<Booking>(bookRegisterhm.get(f));
		System.out.println(bookinglist.toString());
		return bookinglist;
		
	}

	@Override
	public String toString() {
		return "BookingRegister [bookRegisterhm=" + bookRegisterhm + "]";
	}

	
}
