package innerclasses;

public class MemberInnerClass {

	private int data = 10;
	
	class InnerClass {
		public void m1() {
			System.out.println("Data : "+data);
		}
	}
	
	public void display() {
		InnerClass in = new InnerClass();
		in.m1();
	}
	public static void main(String[] args) {
		
		MemberInnerClass obj = new MemberInnerClass();
		obj.display();
		MemberInnerClass.InnerClass obj1 = new MemberInnerClass().new InnerClass();
		obj1.m1();
	}

}
