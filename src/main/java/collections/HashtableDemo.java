package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Map<Integer,String> ht = new Hashtable();
		ht.put(200, "pqr");
		ht.put(100, "abc");
		ht.put(300, "xyz");
		//ht.put(null, "nnn");
		//ht.put(400, null);
		System.out.println("Hashtable Elements are : "+ht);
		Set keys = ht.keySet();
		System.out.println("Hashtable keys are : "+keys);
		Collection c = ht.values();
		System.out.println("Hashtable values are : "+c);
		Set<Entry<Integer, String>> entries = ht.entrySet();
		for(Entry<Integer, String> e:entries) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

	}

}
