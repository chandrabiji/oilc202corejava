package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Chandra");
		hs.add('B');
		hs.add(new Integer(45));
		hs.add(null);
		hs.add(23);
		hs.add(true);
		hs.add(-12);
		hs.add(10);
		System.out.println("HashSet Elements are : "+hs);
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(200);
		hs.addAll(hs1);
		System.out.println("After adding : "+hs);
		System.out.println(hs.contains("Chandra"));
		System.out.println(hs.containsAll(hs1));
		hs.remove("Chandra");
		System.out.println("After remove : "+hs);
		hs.removeAll(hs1);
		System.out.println("After removeAll : "+hs);
		System.out.println("HashSet Elements size : "+hs.size());
		hs1.clear();
		System.out.println("After clear : "+hs1);
		System.out.println(hs1.isEmpty());
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
