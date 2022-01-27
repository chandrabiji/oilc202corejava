package flowcontrolls;

import java.util.Scanner;

public class SwitchWithCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice (A,B AND C ONLY");
		char choice = sc.next().charAt(0);
		switch(choice) {
		case 'A':System.out.println("Apple");
		         break;
		case 'B':System.out.println("Ball");
		         break;
		case 'C':System.out.println("Cat"); 
		         break;
		default:System.out.println("Please select your choice A,B and C only");         
		}

	}

}
