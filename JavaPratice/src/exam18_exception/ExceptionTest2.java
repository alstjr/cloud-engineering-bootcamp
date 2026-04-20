package exam18_exception;

public class ExceptionTest2 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		try {
			// (ArithmeticException 발생 가능성
			int n = 2;
			int result = 10/n; 
			System.out.println("결과 : " + result);
			
			// NullPointerException 발생 가능성
			String s = null;
			System.out.println(s.length());
			
			
		}catch(ArithmeticException e) { // 제대로된 예외처리 클래스를 적어줘야 한다 // / by zero
			System.out.println("0으로 나누어서 예외발생" + e.getMessage());
		}catch(NullPointerException e) { 
			System.out.println("객체 생성없이 메서드 호출해서 예외발생" + e.getMessage()); // Cannot invoke "String.length()" because "s" is null
		}catch(Exception e) {
			System.out.println("포괄적인 예외처리용 - 예외발생" + e.getMessage());
		}finally {
			System.out.println("반드시 실행되는 문장");
		}
		
		// 예외처리 목적이 아님
		try {
			int x= 10;
			System.out.println(x);
		}finally {
			System.out.println("catch 없이 finally 가능 반드시 실행되는 문장임");
		}
		
		System.out.println("프로그램 정상종료");
	}

}
