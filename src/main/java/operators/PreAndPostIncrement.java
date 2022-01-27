package operators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		System.out.println("--Pre Increment--");
		int a = 10;
		System.out.println("A = "+a);//10
		int b = ++a;// a = a+1 = 10+1=11
		System.out.println("B = "+b);//11
		System.out.println("A = "+a);//11

		System.out.println("--Post Increment--");
		int x = 6;
		System.out.println("X = "+x);//6
		int y = x++;
		System.out.println("Y = "+y);//6
		System.out.println("X = "+x);//7
	}

}
