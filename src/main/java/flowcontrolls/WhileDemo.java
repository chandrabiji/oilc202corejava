package flowcontrolls;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 10,sum=0;
		while(i>=1) {
			System.out.println(i);
			if(i%2==0) {
			sum +=i;//sum = sum+i;
			}
			--i;
		}
		System.out.println("Sum of Numbers = "+sum);

	}

}
