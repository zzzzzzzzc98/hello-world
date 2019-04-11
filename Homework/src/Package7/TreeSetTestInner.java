package Package7;

import java.util.*;

public class TreeSetTestInner{
	public static void main(String[] args) {
		TreeSet c = new TreeSet(new MyComparator());   
		c.add("HashSet");
		c.add("ArrayList");
		c.add("TreeMap");
		c.add("HashMap");
		c.add("TreeSet");
		c.add("LinkedList");
    
		Iterator it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	static class MyComparator implements Comparator{
		public int compare(Object o1, Object o2){
			String s1 = (String)o1;
			String s2 = (String)o2;

			//ÉýÐò
			//return s1.compareTo(s2);

			//½µÐò
			return -s1.compareTo(s2);
		}
	}
}
