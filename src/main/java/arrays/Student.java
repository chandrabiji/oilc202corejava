package arrays;

import java.util.Scanner;

public class Student {
	//instance method
	public String grade(int sid,String name,int[] marks) {
		String result = null;
		int total = 0;
		for(int m:marks) {
			total +=m;
		}
		double avg = total/(marks.length);
		if(avg>90) {
			result = "A grade";
		}else if(avg>80 && avg<90) {
			result = "B grade";
		}else {
			result = "C grade";
		}
		return result;
	}

	public static void main(String[] args) {
		Student s1 = new Student();//instance
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id ?");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name ?");
		String name = sc.next();
		System.out.println("How many Subject do you have ?");
		int size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter Each Subject Marks ?");
		for(int i=0;i<size;++i) {
			marks[i]=sc.nextInt();
		}
		String grade =s1.grade(sid, name, marks);
		System.out.println("Student Id      :    "+sid);
		System.out.println("Student Name    :    "+name);
		System.out.println("Student Grade   :    "+grade);

	}

}
