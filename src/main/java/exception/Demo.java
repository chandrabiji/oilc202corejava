package exception;

public class Demo {

	public static void main(String[] args) {
		String str = null;
		System.out.println("Frist Line");
		try {
			System.out.println(10 / 0);
		}  catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
			System.err.println("Some Problem here");
		}catch(Exception ee) {
			ee.printStackTrace();
		} finally {
			System.out.println("--finally--");
		}
		System.out.println("Last Line");

	}

}
