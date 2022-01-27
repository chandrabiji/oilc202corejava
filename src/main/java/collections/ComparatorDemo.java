package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	public int studentId;
	public String studentName;
	public int marks;

	public Student(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

}

class StudentNameSorting implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.studentName.compareTo(s2.studentName);
	}

}

class StudentMarksSorting implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.marks > s2.marks) {
			return 1;
		} else if (s1.marks < s2.marks) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Array Size ?");
		int size = sc.nextInt();
		Student[] students = new Student[size];
		Student student = null;
		for(int i=0;i<size;++i) {
			System.out.println("Enter Student Id ?");
			int studentId = sc.nextInt();
			System.out.println("Enter Student Name ?");
			String name = sc.next();
			System.out.println("Enter Student Marks ?");
			int marks = sc.nextInt();
			student = new Student(studentId,name,marks);
			students[i]=student;
		}
		System.out.println("without sorting Student List");
		for(Student s1:students) {
			System.out.println(s1);
		}
	    Arrays.sort(students,new StudentNameSorting());
	    System.out.println(" Student Name based Sorted List");
	    for(Student s1:students) {
			System.out.println(s1);
		}
	    Arrays.sort(students,new StudentMarksSorting());
	    System.out.println("Student Marks based Sorted List");
	    for(Student s1:students) {
			System.out.println(s1);
		}

	}

}
