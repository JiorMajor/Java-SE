package workshop;

import java.util.Comparator;

public class sortByMemNumber implements Comparator<Member>{
	
	public int compare(Member m1, Member m2) {
		
		int result;
		Integer r1 = m1.getMemberNumber();
		Integer r2 = m2.getMemberNumber();
		result = r1.compareTo(r2);
		return result;
	}

}
