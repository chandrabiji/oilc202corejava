package collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TwoDateDifference {

	public static void findDifference(String startDate, String endDate) {
		// To Converting String to Date Format
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			Date d1 = sdf.parse(startDate);
			Date d2 = sdf.parse(endDate);
			long diff = d2.getTime() - d1.getTime();
//			long diffSeconds = diff / 1000 % 60;
//			long diffMinutes = diff / (60 * 1000) % 60;
//			long diffHours = diff / (60 * 60 * 1000) % 24;
//			long diffDays = diff / (24 * 60 * 60 * 1000);
			long diffSeconds = TimeUnit.MILLISECONDS.toSeconds(diff);
            long diffMiliSeconds = TimeUnit.MILLISECONDS.toMinutes(diff)% 60;
            long diffInHours = TimeUnit.MILLISECONDS.toHours(diff) % 24;
            long diffInDays = TimeUnit.MILLISECONDS.toDays(diff)/365;
//			System.out.print(diffDays + " days, ");
//			System.out.print(diffHours + " hours, ");
//			System.out.print(diffMinutes + " minutes, ");
//			System.out.print(diffSeconds + " seconds.");
            System.out.println("Difference in Second = "+diffSeconds);
            System.out.println("Difference in MilliSeconds = "+diffMiliSeconds);
            System.out.println("Difference in Hourse = "+diffInHours);
            System.out.println("Difference in Days = "+diffInDays);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String start_date = "25-01-2021 03:21:20";
		String end_date = "25-01-2022 03:22:20";
		findDifference(start_date,end_date);

	}

}
