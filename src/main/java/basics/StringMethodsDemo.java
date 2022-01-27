package basics;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String str1 = "abc";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		char[] ch = {'a','b','c'};
		String str2 = new String(ch);
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		String str3 = new String("abc");
		System.out.println(str3);
		System.out.println(str3.hashCode());
		
		str1 = str1+"def";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		String value = "Hyderabad";
		System.out.println(value.charAt(0));
		System.out.println(value.length());
		System.out.println(value.indexOf('d'));
		System.out.println(value.contains("bad"));
		System.out.println(value.substring(6,9));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());

	}

}
