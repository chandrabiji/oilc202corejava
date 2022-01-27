package collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("date & Time : "+d);
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,Locale.US);
		String date = df.format(d);
		System.out.println(date);
	}

}
