package oops;

class Manager{
	
	public void task() {
		System.out.println("Day 1 Task");
	}
}
class Team1 extends Manager{
	public void task() {
		System.out.println("Java Application(BackEnd Task)");
	}
}
class Team2 extends Manager{
	public void task() {
		System.out.println("Vue Js Application(FrontEnd Task");
	}
}
class Team3 extends Manager{
	public void task() {
		System.out.println("Database Application(DB[BackEnd]Task)");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
	Manager m1 = new Team1();
	m1.task();
	System.out.println();
	Manager m2 = new Team2();
	m2.task();
	System.out.println();
	Manager m3 = new Team3();
	m3.task();

	}

}
