package basics;

import java.util.Scanner;

public class Vechile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vechile Travel Distance ?");
		float distance = sc.nextFloat();
		System.out.println("Enter Vechile Travel Time ?");
		float time = sc.nextFloat();
		float speed = distance/time;
		System.out.println("Your Vechile Speed per hour : "+speed+" km");

	}

}
