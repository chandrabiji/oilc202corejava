package basics;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle ?");
	float radius = sc.nextFloat();
	float area = 3.14f * radius * radius;
	System.out.println("Area of Circle = "+area);

	}

}
