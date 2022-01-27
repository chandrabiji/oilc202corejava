package flowcontrolls;

import java.util.Scanner;

public class SwitchWithStringChoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice ?");
		String color = sc.next();
		switch(color) {
		case "red":System.out.println("Selected color Red");
		           break;
		case "green":System.out.println("Selected color Green");
		             break;
		case "blue":System.out.println("Selected color Blue");   
		            break;
		case "pink":System.out.println("Selected color Pink");
		            break;
		default:System.out.println("Please select Red,Green,Blue or Pink only");            
		}

	}

}
