package exam18_exception;

class Test2{
	public void a() throws NullPointerException,ArithmeticException{
		b();
	}
	
	public void b() throws NullPointerException,ArithmeticException {
//		public void b() throws Exception { 다형성 가능 (권장안함)	
		// NullPointerException 발생가능
		String s = null;
		System.out.println(s.length());
		
		//ArithmeticException 발생가능
		int n = 0;
		int result = 10/n;
		System.out.println("결과 : " + result);
	}
}

public class ExceptionTest6 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		Test t = new Test();
		try {
		t.a();
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 정상종료");
	}

}
