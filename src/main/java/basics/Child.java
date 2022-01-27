package basics;

class Parent{
	public Parent() {
		System.out.println("--parent default");
	}
	public Parent(int a) {
		this();
		System.out.println("--parent parameterized");
	}
}
public class Child extends Parent{

	public Child() {
		this(10);
		System.out.println("--child default---");
	}
	public Child(int i) {
		super(5);
		System.out.println("--child parameterized---");
	}

	public static void main(String[] args) {
		Child c = new Child();
	}

}
