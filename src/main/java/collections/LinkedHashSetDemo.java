package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Chandra");
		lhs.add('B');
		lhs.add(10);
		lhs.add(12.34);
		lhs.add(null);
		lhs.add(false);
		lhs.add(-21);
		lhs.add(10);
		lhs.add(22);
		System.out.println("LinkedHashSet Elements are : "+lhs);

	}

}
