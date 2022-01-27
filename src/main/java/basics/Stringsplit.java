package basics;

import java.util.Scanner;

public class Stringsplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Input String ?");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		int wordCount = 0;
		for(String word:words) {
			System.out.println(word);
			++wordCount;
		}
		System.out.println("No Of Words = "+wordCount);

	}

}
