package collections;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String Array Size ?");
		int size = sc.nextInt();
		//Create a String Array based on size
		String[] names = new String[size];
		System.out.println("Enter String Array Elements ?");
		//to read number of elements use for loop
		for(int i=0;i<=size-1;++i) {
			//based on index read input element and assigned in to array index 
			names[i]=sc.next();
		}
		System.out.println("--without sroting String Array--");
		for(String name:names) {
			System.out.println(name);
		}
		//if you want to sort String Array using Arrays utility class
		Arrays.sort(names);
		System.out.println("--After Sorting String Array Elements are --");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("Enter Search Element Name ?");
		String searchName = sc.next();
		for(String name:names) {
			if(name.equals(searchName)) {
			System.out.println("Your Search Name Found : "+name);
			break;
			}
		}
		

	}

}
