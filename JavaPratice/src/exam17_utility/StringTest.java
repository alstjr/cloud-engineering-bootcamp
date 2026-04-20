package exam17_utility;

public class StringTest {
	public static void main(String[] args) {
		
		// 1. 리터럴
		String s = "hello";
		String s2 = "hello";
		System.out.println(s+" "+s2);
		System.out.println(s==s2);
		
		// 2. new
		String x = new String("hello");
		String x2 = new String("hello");
		System.out.println(x+" "+x2);
		System.out.println(x==x2);
		
		
	}
}
