package collections;

import java.time.LocalDate;
import java.time.Period;

public class TwoDateDifferenceWithPeriod {
	
	static void findDifference(LocalDate start_date,LocalDate end_date) {
		Period diff = Period.between(start_date, end_date);
		System.out.println("Difference between two dates is : ");
		System.out.println("Year : "+diff.getYears());
		System.out.println("Month : "+diff.getMonths());
		System.out.println("Days : "+diff.getDays());
	}

	public static void main(String[] args) {
		LocalDate start_date = LocalDate.of(2021, 01, 25);
		LocalDate end_date = LocalDate.of(2022, 02, 10);
		findDifference(start_date, end_date);

	}

}
