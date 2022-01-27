package wrapper;

public class Converting {

	public static void main(String[] args) {
		//Primitive to Wrapper
		int a = 10;//Primitive
		Integer i1 = Integer.valueOf(a);//Wrapper Object
		
		//Wrapper to Primitive
		Integer i2 = new Integer("20");//Wrapper Object
		int b = i2.intValue();//Primitive
		
		//Primitive to String
		int c = 30;//primitive
		String s1 = Integer.toString(c);//30
		
		//String to Primitive
		String s2 = "40";//String
		int d = Integer.parseInt(s2);//Primitive
		
		//String to Wrapper
		String s3 = "50";//String
		Integer i3 = Integer.valueOf(s3);
		
		System.out.println(s1+s2);//3040
		System.out.println(d+i3);//40+50=90

	}

}
