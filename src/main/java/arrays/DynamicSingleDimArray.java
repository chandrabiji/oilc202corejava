package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicSingleDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements ?");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println("--without sorting array elements are--");
		for(int k:arr) {
			System.out.println(k);
		}
		Arrays.sort(arr);
		System.out.println("--After sorting Array Elements --");
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("Array Minimum Value : "+arr[0]);
		System.out.println("Array Maximum Value : "+arr[size-1]);
		System.out.println("Array Second Highest Value : "+arr[size-2]);

	}

}
