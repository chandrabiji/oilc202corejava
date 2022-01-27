package oops;

class Course{
	public int cid;
	public String cname;
	public String duration;
	
	public Course(int cid, String cname, String duration) {
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}	
	
}
class Student {
	public int sid;
	public String name;
	public Course course;//This is nothing but Association
	
	public Student(int sid, String name, Course course) {
		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(100,"Java","45 days");
		Student s1 = new Student(1,"ABC",c1);
		System.out.println("Student Id       :     "+s1.sid);
		System.out.println("Student Name     :     "+s1.name);
		System.out.println("Course Name      :     "+s1.course.cname);
		System.out.println("Course Duration  :     "+s1.course.duration);

	}

}
