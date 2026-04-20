package exam02_variable;

public class VariableTest02 {

	public static void main(String[] args) {
		// 변수 선언과 초기화를 한번에
		String name = "홍길동";
		int age = 20;
		
		// 동일한 타입이 여러개 변수
		
		int n = 0;
		int n2 = 10;
		int n3;
		
		// int n, n2=10, n3; // 권장 안함
		
		System.out.println(n);
		System.out.println(n2);
		// System.out.println(n3); // 로컬 변수는 초기화 필수
	}

}
