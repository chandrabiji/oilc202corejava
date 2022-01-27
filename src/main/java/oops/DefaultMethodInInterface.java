package oops;

interface DefaultTest{
	
	//private int a = 10; Note:private variable can't allowed only public,static and final
	//abstract method
	public String sayHello(String name);
	
	//default method
	public default void hello() {
		System.out.println("This is default method");
	}
	
	//static method
	public static void fromStatic() {
		System.out.println("This is static method");
	}
	
//	private void fromPrivateMethod() {
//		System.out.println("This is private method");
//	}
}
class DefaultMethodInInterface implements DefaultTest{

	
	public String sayHello(String name) {
		return "Welcome to Core Java Mr. "+name;
	}

	public static void main(String[] args) {
		DefaultMethodInInterface obj = new DefaultMethodInInterface();
		DefaultTest.fromStatic();
		obj.hello();
		System.out.println(obj.sayHello("Sekhar"));

	}

}
