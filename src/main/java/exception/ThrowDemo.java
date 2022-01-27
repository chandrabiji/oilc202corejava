package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("First Line");
		try {
			throw new ArithmeticException("/ zero");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last Line");

	}

}
