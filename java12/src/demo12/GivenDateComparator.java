package demo12;

import java.util.Comparator;

public class GivenDateComparator implements Comparator <School> {
		 @Override
		public int compare(School o1, School o2) {
			 School sc1 = (School) o1;
			 School sc2 = (School) o2;
				return sc1.given_date.compareTo(sc2.given_date);
}
}