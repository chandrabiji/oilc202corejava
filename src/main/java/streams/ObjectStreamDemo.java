package streams;

import java.util.Arrays;
import java.util.List;

class Emp{
	
	public int eid;
	public String ename;
	public double salary;
	
	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	

	public String toString() {
		return eid+"\t"+ename+"\t"+salary;
	}
}

public class ObjectStreamDemo {
	
	public static Emp[] arrayOfEmps = {
			
			new Emp(1,"Siva",120000),
			new Emp(2,"Jyothi",150000),
			new Emp(3,"Chandra",40000)
	};

	public static void main(String[] args) {
		List employees = Arrays.asList(arrayOfEmps);
		employees
				.stream()
				.forEach(e -> System.out.println(e));
	}

}
