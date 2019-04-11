package Package7;

import java.util.*;

public class MyComparator implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = (String)o1;
		String s2 = (String)o2;

		//ÉýÐò
		//return s1.compareTo(s2);

		//½µÐò
		return -s1.compareTo(s2);
	}
}
