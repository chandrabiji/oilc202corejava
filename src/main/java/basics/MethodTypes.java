package basics;

/**
 * 
 * @author Chandra Method Types Example(document comments)
 *
 */
public class MethodTypes {
	// 1.instance methods
	public void sayHello() {
		System.out.println("Welcome to Ojas");
	}

	public int add(int i, int j) {
		return i + j;
	}

	// 2.static method
	public static void m1() {
		System.out.println("From static method");
	}

	// 3.final method
	public final void m2() {
		System.out.println("From final method");
	}

	// 4.synchronized method
	public synchronized void m3() {
		System.out.println("From synchronized method");
	}

	// 5.abstract method
	// public abstract void m4();
	/*
	 * This is multi line comments
	 */
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();// instance
		obj.sayHello();
		System.out.println(obj.add(10, 5));
		System.out.println(obj.add(40, 50));
		m1();
		obj.m2();
		obj.m3();

	}

}
