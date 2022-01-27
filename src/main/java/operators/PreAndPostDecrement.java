package operators;

public class PreAndPostDecrement {

	public static void main(String[] args) {
		System.out.println("--Pre Decrement---");
		int p = 8;
		System.out.println("P = "+p);//8
		int q = --p;//p = p-1=8-1=7
		System.out.println("Q = "+q);//7
		System.out.println("P = "+p);//7
		System.out.println("--post Decrement--");
		int m = 9;
		System.out.println("M = "+m);//9
		int n = m--;
		System.out.println("N = "+n);//9
		System.out.println("M = "+m);//8

	}

}
