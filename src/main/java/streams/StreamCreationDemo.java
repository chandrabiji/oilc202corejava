package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCreationDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,45,23,98);
		//list1.add(2);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(12);
		list2.add(87);
		list2.add(8);
		System.out.println(list2);
		List<Integer> evenList = new ArrayList<>();
		System.out.println("--Event Numbers List--");
		for(int k:list2) {
			if(k%2==0) {
				evenList.add(k);
			}
		}
		System.out.println("Even Number List : "+evenList);
		
		List<Integer> listOfEvenNumber =list2.stream().filter(i -> (i%2==0)).collect(Collectors.toList());
		System.out.println(listOfEvenNumber);

	}

}
