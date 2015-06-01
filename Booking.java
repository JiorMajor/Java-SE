package workshop;

import java.util.Date;

public class Booking {

	private Member m;
	private Facility f;
	private Date startDate, endDate;

	public Booking(Member m, Facility f, Date startDate, Date endDate) throws BadBookingException {
		try {
			if(m==null)
				throw new BadBookingException("Member cannot be null.");
			else if(f==null)
				throw new BadBookingException(" Facility cannot be null.");
			else if(startDate.after(endDate))
				throw new BadBookingException(" Start Date shoule before endDate.");
			 else {
				this.m = m;
				this.f = f;
				this.startDate = startDate;
				this.endDate = endDate;
		}

		}
		catch (BadBookingException b) {
			b.printStackTrace();
		}
	}

	public Member getMember() {
		return m;
	}

	public void setMember(Member m) {
		this.m = m;
	}

	public Facility getFacility() {
		return f;
	}

	public void setFacility(Facility f) {
		this.f = f;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean overlaps(Booking another) {
		if (this.getFacility().equals(another.getFacility())
				&& this.getStartDate().equals(another.getStartDate()))
			return true;

		return false;
	}

	@Override
	public String toString() {
		return "Booking made by : " + m + "\n for " + f + " startDate : "
				+ startDate + ", endDate : " + endDate;
	}

	public String show() {
		return ("Booking made by : " + m + "\n for " + f + " startDate : "
				+ startDate + ", endDate : " + endDate);
	}

}
