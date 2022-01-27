package oops;

interface One {
	public void m1();
}

interface Two extends One{
	public void m2();

}

public class MultipleInterfacesDemo implements Two {

	@Override
	public void m2() {
		System.out.println("From Two Interface abstract method implementation");
		
	}

	@Override
	public void m1() {
		System.out.println("From One Interface abstract method implementation");
		
	}
	public static void main(String[] args) {
		MultipleInterfacesDemo obj = new MultipleInterfacesDemo();
		obj.m1();
		obj.m2();
		System.out.println();
		One o = new MultipleInterfacesDemo();
		o.m1();
		System.out.println();
		Two t = new MultipleInterfacesDemo();
		t.m2();
		t.m1();

	}

	
}
