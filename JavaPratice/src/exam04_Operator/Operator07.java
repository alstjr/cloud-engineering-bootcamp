package exam04_Operator;
// 증감연산자2

public class Operator07 {
	public static void main(String[] args) {
		
		// 증감연산자와 다른 연산자와 같이 사용
		
		int n = 10;
		int result = ++n; // 먼저 증가하고 나중에 할당
		System.out.println(result + "\t" + n);
		
		//후치
		int n2 = 10;
		int result2 = n2++; // 먼저 할당하고 나중에 증가
		System.out.println(result2 + "\t" + n2);
		
		
		
	}

}
