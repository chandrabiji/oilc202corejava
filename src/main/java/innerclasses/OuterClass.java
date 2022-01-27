package innerclasses;

public class OuterClass {

	private int data = 20;

	public void display() {
		class InnerClass {
			public void m1() {
				System.out.println("Data = " + data);
			}
		}
		InnerClass in = new InnerClass();
		in.m1();
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.display();

	}

}
