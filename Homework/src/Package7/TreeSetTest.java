package Package7;

import java.util.*;

public class TreeSetTest{
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

		TreeSet cc = new TreeSet(new MyComparator2());   
		for(int i=1; i<=10; i++)
			cc.add(new Integer(i));
    
		it = cc.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
