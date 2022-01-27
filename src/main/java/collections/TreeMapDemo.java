package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String, String>();
		tm.put("R", "Red");
		tm.put("G", "Green");
		tm.put("B", "Blue");
		tm.put("O","Orange");
		tm.put("P", "Pink");
		//tm.put(null, null);
		//tm.put(null,"nnn");
		tm.put("N", null);
		System.out.println("TreeMap Elements are : "+tm);

	}

}
