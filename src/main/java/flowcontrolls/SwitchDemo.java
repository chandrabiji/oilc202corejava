package flowcontrolls;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Any digit(1-5) only");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("One");
		      // break;
		case 2:System.out.println("Two");
		      // break;
		case 3:System.out.println("Three");
		     //  break;
		case 4:System.out.println("Four");
		     //  break;
		case 5:System.out.println("Five");   
		       break;
		default:System.out.println("Please select your choice range 1-5 only");       
		}

	}

}
