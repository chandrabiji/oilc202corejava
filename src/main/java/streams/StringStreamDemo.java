package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamDemo {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		 l1.add("Phani");
		 l1.add("Jyothi");
		 l1.add("Siva");
		 l1.add("Chandra");

		System.out.println(l1); 

		List<String> names = l1.stream()
				  .filter(n ->(n.equals("Chandra")))
				   .collect(Collectors.toList());
		System.out.println(names);


	}

}
