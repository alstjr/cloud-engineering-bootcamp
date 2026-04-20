package exam04_Operator;
// 논리연산자2
public class Operator05 {
	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 20;
			
		// 질문? n 값이 15보다 크고 n2값이 30보다 작냐?
		
		boolean result = (n > 15) && (n2 < 30);
		System.out.println(result);
		
		// 질문? n 값이 15보다 크거나 n2 값이 30보다 작냐?
		boolean result2 = (n > 15) || (n2 < 30);
		System.out.println(result2);
		
	}

}
