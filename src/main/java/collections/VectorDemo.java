package collections;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		int[] arr = {10,30,56,23,12};
		Vector v = new Vector();
		for(int i=0;i<arr.length;++i) {
			v.add(arr[i]);
		}
		System.out.println("Vector Element");
		for(int i=0;i<v.size();++i) {
			System.out.println(v.get(i));
		}
		System.out.println("---Enumeration---");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
