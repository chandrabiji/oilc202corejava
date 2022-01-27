package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) throws IOException{
		//step1:attach source file to FileInputStream
		FileInputStream fis = new FileInputStream("abc.txt");
		//step2:attach target file to FileOuputStream
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		//step3:declare byte variable
		int k;
		System.out.println("Reading Started.....");
		while((k=fis.read())!=-1) {
			fos.write(k);
		}
		System.out.println("Writing Completed....");
		fis.close();
		fos.close();

	}

}
