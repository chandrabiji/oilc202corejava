package oops;
//parent class
class Employee{
	public double salary = 5000;
}
//child class
class RegularEmployee extends Employee {
	public double bonus = 1000;
}
//child class
class PartTimeEmployee extends Employee {
	public double bonus = 500;
}
public class InheritanceDemo {

	public static void main(String[] args) {
		RegularEmployee regularEmployee = new RegularEmployee();
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		System.out.println("-----------------------------------------------------");
		System.out.println("             Regular Employee Pay Slip               ");
		System.out.println("-----------------------------------------------------");
		System.out.println("  Regular Employee Salary      :      "+regularEmployee.salary);
		System.out.println("  Regular Employee Bonus       :      "+regularEmployee.bonus);
		System.out.println("-----------------------------------------------------");
		System.out.println("  Total Salary                 :      "+(regularEmployee.salary+regularEmployee.bonus));
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("             PartTime Employee Pay Slip               ");
		System.out.println("-----------------------------------------------------");
		System.out.println("  PartTime Employee Salary      :      "+partTimeEmployee.salary);
		System.out.println("  PartTime Employee Bonus       :      "+partTimeEmployee.bonus);
		System.out.println("-----------------------------------------------------");
		System.out.println("  Total Salary                 :      "+(partTimeEmployee.salary+partTimeEmployee.bonus));
		System.out.println("-----------------------------------------------------");

	}

}
