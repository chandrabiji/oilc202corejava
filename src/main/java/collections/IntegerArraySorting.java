package collections;

import java.util.Arrays;

public class IntegerArraySorting {

	public static void main(String[] args) {
		int[] arr = {10,23,12,65,78,88,93};
		System.out.println("--Without Sorting Array Elements--");
		for(int i = 0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("--ForEach based Elements--");
		for(int k:arr) {
			System.out.println(k);
		}
		//Arrays is the Utility class
		Arrays.sort(arr);
		System.out.println("After sorting Array Elements");
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("Array Elements in Reverse Order");
		for(int i=arr.length-1;i>=0;--i) {
			System.out.println(arr[i]);
		}

	}

}
