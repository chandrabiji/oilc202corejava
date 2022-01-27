package exception;

public class ThrowsDemo {
	//instance method
	public void m1() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("first line");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last Line");
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();//Object or instance
		System.out.println("main method first line");
		obj.m1();
		System.out.println("main method last line");

	}

}
