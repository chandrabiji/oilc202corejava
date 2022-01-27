package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);
		al.add(new Integer(30));
		al.add("Chandra");
		al.add('B');
		al.add(false);
		al.add(10);
		al.add(12.34);
		al.add(-43);
		System.out.println("ArrayList Elements are: "+al);
		System.out.println("--forward direction---");
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("---Backward direction---");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
