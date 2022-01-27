package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFileIntoSingleFile {

	public static void main(String[] args)throws IOException {
		// step1:attach first file in to FileInputStream
		FileInputStream fis1 = new FileInputStream("abc.txt");
		//step2:attach second file in to FileInputStream
		FileInputStream fis2 = new FileInputStream("xyz.txt");
		//step3:attach output file in to FileOutputStream
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		//step4:attach two input stream in to sis stream
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		//step5:declare byte variable
		int k;
		System.out.println("Reading Started......");
		while((k=sis.read())!=-1) {
			fos.write(k);
		}
		System.out.println("Writing Completed....");
		fis1.close();
		fis2.close();
		sis.close();
		fos.close();

	}

}
