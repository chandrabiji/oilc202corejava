package arrays;

import java.util.Scanner;

public class MultiDimDynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no Of Rows ?");
		int rows = sc.nextInt();
		System.out.println("Enter no Of Cols ?");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		System.out.println("Enter Array Elements");
		for(int i=0;i<rows;++i) {
			for(int j=0;j<cols;++j) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<rows;++i) {
			int sum = 0;
			for(int j=0;j<cols;++j) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("Each Row Sum Calculation");
		for(int i=0;i<rows;++i) {
			int sum = 0;
			for(int j=0;j<cols;++j) {
				System.out.print(arr[i][j]+"["+i+","+j+"]");
				sum +=arr[i][j];
			}
			System.out.println(" = "+sum);
		}
		int total = 0;
		for(int i=0;i<rows;++i) {
			for(int j=0;j<cols;++j) {
				if(i==j) {
					System.out.println(arr[i][j]);
					total+=arr[i][j];
				}
			}
		}
		System.out.println("Total = "+total);

	}

}
