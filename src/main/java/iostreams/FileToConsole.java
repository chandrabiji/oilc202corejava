package iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsole {

	public static void main(String[] args) throws IOException{
		//attach source file to FileInputStream
		FileInputStream fis = new FileInputStream("abc.txt");
		//declare byte family variable
		int k;
		//read byte by byte use the loop
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
		}

	}

}
