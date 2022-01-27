package langpack;

public class Test {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 = s1+"World";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("World");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		StringBuilder sbb = new StringBuilder();

	}

}
