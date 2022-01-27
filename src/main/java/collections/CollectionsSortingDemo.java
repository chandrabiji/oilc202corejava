package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Customer {

	public int customerId;
	public String customerName;
	public long mobileNo;
	public String emailId;

	public Customer(int customerId, String customerName, long mobileNo, String emailId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + "]";
	}

}

class CustomerNameSorting implements Comparator<Customer> {
	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.customerName.compareTo(c2.customerName);
	}
}

class CustomerMobileNoSorting implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if (c1.mobileNo > c2.mobileNo) {
			return 1;
		} else if (c1.mobileNo < c2.mobileNo) {
			return -1;
		} else {
			return 0;
		}
	}

}
class CustomerEmailIdSorting implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.emailId.compareTo(c2.emailId);
	}
	
}

public class CollectionsSortingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Array Size ?");
		int size = sc.nextInt();
		ArrayList<Customer> customers = new ArrayList<Customer>(size);
		Customer customer = null;
		System.out.println("Enter Customer Element ?");
		for(int i=0;i<size;++i) {
			System.out.println("Enter Customer Id ?");
			int custId = sc.nextInt();
			System.out.println("Enter Customer Name ?");
			String custName = sc.next();
			System.out.println("Enter Customer Mobile Number ?");
			long mobileNo = sc.nextLong();
			System.out.println("Enter Customer Email Id ?");
			String emailId = sc.next();
			customer = new Customer(custId,custName,mobileNo,emailId);
			customers.add(customer);
		}
		System.out.println("--without sorting customer list--");
		for(Customer c1:customers) {
			System.out.println(c1);
		}
		System.out.println("---Name Based Sorted List ---");
		Collections.sort(customers,new CustomerNameSorting());
		for(Customer c1:customers) {
			System.out.println(c1);
		}
		System.out.println("--Mobile Number Based Sorted List--");
		Collections.sort(customers,new CustomerMobileNoSorting());
		for(Customer c1:customers) {
			System.out.println(c1);
		}
		System.out.println("--Email Id Based Sorted List---");
		Collections.sort(customers,new CustomerEmailIdSorting());
		for(Customer c1:customers) {
			System.out.println(c1);
		}

	}

}
