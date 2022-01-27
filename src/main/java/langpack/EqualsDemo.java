package langpack;

import java.util.Objects;

class Emp {

	public int eid;
	public String ename;
	public double salary;

	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	public String toString() {
		return eid+"\t"+ename+"\t"+salary;
	}

}

public class EqualsDemo {

	public static void main(String[] args) {
		// 1st = assignment operator
		int a = 10;
		System.out.println("A = " + a);
		// 2nd == reference comparing
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if (s1 == s2) {
			System.out.println("S1 and S2 are same kind of Object");
		} else {
			System.out.println("S1 and S2 are not same kind of Object");
		}
		
		Emp e1 = new Emp(100,"abc",5000);
		Emp e2 = new Emp(100,"abc",5000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		if(e1.equals(e2)) {
			System.out.println("e1 and e2 are Equals");
		}else {
			System.out.println("e1 and e2 are not Equals");
		}
		System.out.println(e1.getClass().getName());
		System.out.println(e1);

	}

}
