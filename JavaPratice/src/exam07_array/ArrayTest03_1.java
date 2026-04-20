package exam07_array;

public class ArrayTest03_1 {

	public static void main(String[] args) {
		
		// 실행시 command line argument로 정수값을 하나 입력 받아서
		// 입력받은 정수값만큼 반복해서 hello 출력
		
		String s = args[0]; // "3"
		
		int num = Integer.parseInt(s); // "3" ----> 3
		
		for(int i=1; i<=num; i++) {
			System.out.println("hello:" + i);
		}
		
		System.out.println("end");
	}

}
