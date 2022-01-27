package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(200, "pqr");
		hm.put(100, "abc");
		hm.put(300, "xyz");
		hm.put(null, "nnn");
		hm.put(400, null);
		System.out.println("HashMap Elements are : "+hm);
		Set keys = hm.keySet();
		System.out.println("HashMap keys are : "+keys);
		Collection c = hm.values();
		System.out.println("HashMap Values are : "+c);
		Set<Entry<Integer, String>> entries=hm.entrySet();
		for(Entry<Integer, String> e:entries) {
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println(hm.get(300));
		
	}

}
