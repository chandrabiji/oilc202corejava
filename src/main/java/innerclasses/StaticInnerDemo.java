package innerclasses;

public class StaticInnerDemo {
	
	public static int data =40;
	
	static class Inner{
		public static void m1() {
			System.out.println("Data = "+data);
		}
	}

	public static void main(String[] args) {
		Inner.m1();

	}

}
