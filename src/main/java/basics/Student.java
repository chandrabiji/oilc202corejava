package basics;

public class Student {
	//instance variables
	public int sid;
	public String sname;
	public int marks;
	
	//default constructor
	public Student() {
	  System.out.println("--default constructor--");
	}
	
	//parameterized constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	
	public String grade() {
		String result = null;
		if(marks>=90) {
			result = "A Grade";
		}else if(marks>80 && marks <90) {
			result = "B Grade";
		}else {
			result = "C Grade";
		}
		return result;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(100,"abc",90);
		System.out.println("Student Id   :  "+s1.sid);
		System.out.println("Student Name : "+s1.sname);
		System.out.println("Student Marks: "+s1.marks);
		System.out.println("Student Grade: "+s1.grade());

	}

}
