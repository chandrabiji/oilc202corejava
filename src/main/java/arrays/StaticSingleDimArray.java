package arrays;

public class StaticSingleDimArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		System.out.println("--Array Elements----");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
			
		}
		System.out.println("--ForEach Demo--");
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
