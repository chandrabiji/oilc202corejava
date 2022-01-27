package langpack;

public class CloneTest implements Cloneable {
	//instance variables
	public int a = 10;
	public int b = 20;

	public static void main(String[] args)  {
		CloneTest t1 = new CloneTest();//Object / Instance
		System.out.println("A = "+t1.a);
		System.out.println("B = "+t1.b);
		
		CloneTest t2 = null;
		try {
			t2 = (CloneTest)t1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Clone Object A = "+t2.a);
		System.out.println("Clone Object B = "+t2.b);
		
		t2.a=100;
		t2.b=200;
		System.out.println("A = "+t1.a);
		System.out.println("B = "+t1.b);
		System.out.println("Clone Object A = "+t2.a);
		System.out.println("Clone Object B = "+t2.b);
		
		

	}

}
