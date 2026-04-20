package exam07_array;

public class ArrayTest01_4 {

	public static void main(String[] args) {

		// new + 리터럴
		
		int [] num;
		num = new int[] {10,20,30};
		
		String [] name = new String[] {"홍길동", "이순신"};
		
		for( int n : num) {
			System.out.println(n);
		}
		
		for (String s:name) {
			System.out.println(s);
		}
	

	}

}
