package basics;

import java.util.Scanner;

public class StringReverse {
	
	public String reverseString(String input) {
		String output = "";
		for(int i=input.length()-1;i>=0;--i) {
			output +=input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any input String ?");
		String input = sc.next();
		String output = obj.reverseString(input);
		System.out.println("Before Reverse : "+input);
		System.out.println("After Reverse  : "+output);
		if(input.equals(output)) {
			System.out.println("Given Input String is Palindrome");
		}else {
			System.out.println("Given Input String is not a Palindrome");
		}

	}

}
