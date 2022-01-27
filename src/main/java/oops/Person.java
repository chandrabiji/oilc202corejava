package oops;
//class = common(Variables + methods)
public class Person {
	//common properties(variables)
	public int pid;
	public String name;
	public int age;
	public int height;
	public int weight;
	public String color;
	
	//common methods
	public void eat() {
		if(weight>80) {
			System.out.println("Take Veg Food Better for health");
		}else {
			System.out.println("Your in danger zone");
		}
	}
	public void sleep() {
		if(age<12) {
			System.out.println("Better to sleep 9 hours");
		}else {
			System.out.println("Sleep at least 8 hours");
		}
	}

	public static void main(String[] args) {
	Person child = new Person();//Object = Instance of a class
	child.pid=1;
	child.name="Charan";
	child.age=9;
	child.color="white";
	child.height=4;
	child.weight=15;
	child.eat();
	child.sleep();

	}

}
