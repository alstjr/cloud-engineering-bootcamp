package exam16_lambda;

// 인터페이스
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int n);
}



public class TestMain2 {

	public static void main(String[] args) {
		
		// 익명클래스
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				System.out.println("fly()" + n);
			}
		};
		f.fly(10);
		
		// 람다표현식 ( =>(자바스크립트) ->(자바))
		Flyer2 f2 = (int n) -> {System.out.println("람다.fly()" + n);};
		f2.fly(10);
		
		Flyer2 f3 = (n) -> {System.out.println("람다.fly()" + n); };
		f3.fly(10);
		
		Flyer2 f4 = n -> {System.out.println("람다.fly()" + n); };
		f4.fly(10);
		
		Flyer2 f5 = n -> System.out.println("람다.fly()" + n); ;
		f5.fly(10);
		
	}

}
