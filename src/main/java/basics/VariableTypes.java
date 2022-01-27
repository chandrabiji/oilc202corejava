package basics;

public class VariableTypes {
    //instance variable
	int b = 20;
	 int c = 30;
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();//instance/reference/object
		//Local Variable
		int a = 10;
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		obj.m1();
	}
	public void m1() {
		System.out.println("B = "+b);
		System.out.println("C = "+c);
	}
	

}
