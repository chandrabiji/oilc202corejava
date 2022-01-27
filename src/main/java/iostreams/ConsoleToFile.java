package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args)throws IOException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("To Stop Reading type @");
		int k;
		while((k=System.in.read())!='@') {
			fos.write(k);
		}
		fos.close();

	}

}
