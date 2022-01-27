package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtiltityMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(12);
		al.add(98);
		al.add(9);
		al.add(44);
		System.out.println("ArrayList Elements"+al);
		Collections.reverse(al);
		System.out.println("After ArrayList Reverse "+al);

	}

}
