package basics;

public class VTypes {

	int b = 30;//instance variable
	static int c = 40;//static variable / class variable
	public static void main(String[] args) {
		VTypes v = new VTypes();//instance
		int a = 10;//Local Variable
		System.out.println("A = "+a);
		System.out.println("B = "+v.b);//instance variable
		System.out.println("C = "+c);
		v.m1();//instance method

	}
	public void m1() {
		System.out.println("B = "+b);
		System.out.println("C = "+c);
	}

}
