package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>();
		lhmap.put("En", "English");
		lhmap.put("Hi", "Hindi");
		lhmap.put("Te", "Telugu");
		lhmap.put("Fr", "French");
		System.out.println("LinkedHashMap Elements are : "+lhmap);

	}

}
