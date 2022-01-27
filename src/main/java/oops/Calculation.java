package oops;

import java.util.Scanner;

interface Calc{
	public int add(int i, int j);
	public int sub(int i, int j);
	public int mul(int i,int j);
	public int div(int i,int j);
}
public class Calculation implements Calc{



	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		System.out.println(obj.add(a, b));
		System.out.println(obj.sub(a,b));
		System.out.println(obj.mul(a, b));
		System.out.println(obj.div(a, b));

	}

	
}
