package demo12;

import java.util.Comparator;

public class CompletionDateComparator implements Comparator <School> {
	 @Override
	public int compare(School o1, School o2) {
		 School E1 = (School) o1;
		 School E2 = (School) o2;
			return E1.Completion_date.compareTo(E2.Completion_date);
}
}


