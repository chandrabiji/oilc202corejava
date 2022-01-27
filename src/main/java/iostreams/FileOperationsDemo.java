package iostreams;

import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {

	public static void main(String[] args) throws IOException{
		
		File f1 = new File("student1.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.isFile());
		File f2 = new File("Chandra");
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.isDirectory());
		File f3 = new File("Chandra","abc.txt");
		f3.createNewFile();
		f1.delete();
		f3.renameTo(f1);
		File path = new File("D:\\OILC_600_Vue");
		String[] fnames = path.list();
		for(String name:fnames) {
			System.out.println(name);
		}
		File f4 = new File("pqr.txt");
		f4.createNewFile();
		f4.delete();
		f4.renameTo(f1);
		
		

	}

}
