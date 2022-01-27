package basics;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ?");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number ?");
		int secondNumber = sc.nextInt();
		System.out.println("Sum = "+(firstNumber+secondNumber));

	}

}
