package innerclasses;

abstract class Greetings{
	public abstract void sayHello();
}
interface Shape{
	public void draw();
}
public class Anonymous {

	public static void main(String[] args) {
	
		Greetings g = new Greetings() {
			public void sayHello() {
				System.out.println("Hello Welcome to Anonymous class");
			}
		};
		g.sayHello();
		Shape s = new Shape() {
			public void draw() {
				System.out.println("Right Triangle");
			}
		};
		s.draw();
	}

}
