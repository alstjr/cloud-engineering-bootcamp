package exam03_TypeCasting;
// 자동 형변환(묵시적 형변환)

public class CastTset01 {

	public static void main(String[] args) {
			
		
		// 1. 수치형
		byte b= 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		
		float f = b4;
		double d = f;
		
		//byte x = f2 // 역은 불가
		
		// char > int ( 문자가 정수인 int로 자동변경 가능, 아스키코드값 )
		char c = 'A';
		int n = c;
		System.out.println(n); //65
		System.out.println(c+1); // 문자 연산이 가능하다
		
		char c2 = 'a';
		int n2 = c2;
		System.out.println(n2); // 97
		
		// 2.정수형중에서 int보다 작은 타입의 연산결과는 int로 형변환되어 반환된다
		short s = 10;
		short s2 = 20;
		//short s3 = s+s2; //에러, 각각은 short지만 연산된 s+s2 결과값은 int 임
		int s4 = s+s2;
		
		// 3. 작은 타입과 큰 타입이 연산하면 결과가 큰 타입으로 변환
		int k = 10;
		double k2 = 20;
//		int k3 = k+k2; // k+k2 타입은 double로 변환
		double k4 = k + k2;
		
		//4. 문자열 + (비)문자열 ==> 문자열
		System.out.println("hello" + "world");
		System.out.println("hello" + 10);
		System.out.println("hello" + 3.15);
		System.out.println("hello" + true);
		
		System.out.println("hello" + 10 + 20 + 30); // hello102030
		System.out.println(10 + 20 + 30 + "hello"); // 60hello
	}

}
