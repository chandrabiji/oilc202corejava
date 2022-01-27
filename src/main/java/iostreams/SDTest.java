package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	public int sid;
	public transient String sname;
	public  int marks;

	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public String toString() {
		return sid+"\t"+sname+"\t"+marks;
	}
}

public class SDTest {

	public void serilization(Object obj) {

		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("--Serilization Completed---");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Object deSerilization() {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--DeSerilization Completed--");
		return obj;
	}
	
	

	public static void main(String[] args) {
		SDTest sd = new SDTest();
		Student s1 = new Student(100,"abc",90);
		sd.serilization(s1);
		Student s2 =(Student)sd.deSerilization();
		System.out.println(s2);

	}

}
