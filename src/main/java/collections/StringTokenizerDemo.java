package collections;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "This is Collection Frame work";
		StringTokenizer st = new StringTokenizer(str, " ");
		int noOfWords = 0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			++noOfWords;
		}
		System.out.println("No of Words = "+noOfWords);

	}

}
