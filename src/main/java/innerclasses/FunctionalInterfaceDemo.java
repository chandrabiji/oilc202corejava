package innerclasses;

@FunctionalInterface
interface Calculation {
	public int add(int i, int j);
}
interface Test{
	public void m1();
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Calculation c = ( i, j)-> i+j;
		System.out.println(c.add(10, 20));
		
        Test t = ()->{
        	System.out.println("From Test interface m1 method");
            System.out.println("From Test interface m1 method");
        };
        t.m1();
	}

}
