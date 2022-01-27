package oops;

class Parent1{
	public void m1() {
		System.out.println("From Parent1 m1 method");
	}
}
class Parent2 extends Parent1{
	public void m2() {
		System.out.println("From Parent2 m2 method");
	}
}

public class MultipleInheritance extends Parent2 {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.m1();
		obj.m2();
		

	}

}
