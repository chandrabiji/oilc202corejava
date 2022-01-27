package oops;

abstract class Bike {
	public void color() {
		System.out.println("Red color");
	}

	public abstract void run();
}

class ActiveHonda extends Bike{
	public void run() {
		System.out.println("Good @ Hyderabad Roads");
	}
}
class FZ extends Bike{
	public void run() {
		System.out.println("Feel Like a Sports Bike");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		ActiveHonda activeHonda = new ActiveHonda();
		activeHonda.color();
		activeHonda.run();
		
		FZ fz = new FZ();
		fz.color();
		fz.run();
		
		Bike b1 = new ActiveHonda();
		b1.color();
		b1.run();
		
		Bike b2 = new FZ();
		b2.color();
		b2.run();

	}

}
