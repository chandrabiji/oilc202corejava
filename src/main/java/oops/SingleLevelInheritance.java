package oops;

class Parent{
	public int a = 10;
	public void m1() {
		System.out.println("From Parent m1 method");
	}
}
class Child extends Parent {
	public int b = 20;
	public void m2() {
		System.out.println("From Child m2 method");
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.a);
		p1.m1();
		System.out.println();
		Child c1 = new Child();
		System.out.println("A = "+c1.a);
		System.out.println("B = "+c1.b);
		c1.m1();
		c1.m2();
		System.out.println();
		Parent p2 = new Child();
		System.out.println(p2.a);
	//	System.out.println(p2.b);
		p2.m1();

	}

}
