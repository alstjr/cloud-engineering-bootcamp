package exam16_lambda;

// 인터페이스
@FunctionalInterface
interface Flyer5{
	public abstract int fly(int n, int n2);
}



public class TestMain4 {

	public static void main(String[] args) {
		
		// 익명클래스
		Flyer5 f = new Flyer5() {
			
			@Override
			public int fly(int n, int n2) {
				return n+n2;
			}
		};
		int num = f.fly(10,20);
		System.out.println(num);
		
		// 람다표현식 
		Flyer5 f2 = (int n, int n2) ->{return n+n2;};
		Flyer5 f3 = (n, n2) ->{return n+n2;};
		Flyer5 f4 = (n, n2) -> n+n2;
		
		int num2 = f4.fly(10,20);
		System.out.println(num2);
				
	}

}
