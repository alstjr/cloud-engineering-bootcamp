package exam21_functional_interface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
class Test {
	public static int method (int x, int y) {
		return x+y;
	}
	public int method2(int x) {
		return x+100;
	}
	public Test() {}
	public Test(int x) { }
}

public class MethodeReferenceTest {

	public static void main(String[] args) {
		
		// Method Reference ( 메서드 참조 )
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer n, Integer n2) {
				return Test.method(n,n2 );
			}
		};
		
		// 람다표현식
		// static 메서드 축약 : static 메서드: 클래스 : : 메서드명
		BinaryOperator<Integer> x2 = (n, n2) -> Test.method(n, n2);
		int result = x2.apply(10, 20);
		System.out.println(result);
		
		BinaryOperator<Integer> x3 = Test :: method;
		int result2 = x3.apply(10, 20);
		System.out.println(result2);
		
		Function<String, Integer> f = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
			}
		};
		int result3 = f.apply("100");
		System.out.println(result3);
		
		// 람다 표현식
		Function<String, Integer> f2 = s -> Integer.parseInt(s);
		int result4 = f2.apply("100");
		System.out.println(result4);
		// 축약된 표현식
		Function<String, Integer> f3 = Integer :: parseInt;
		int result5 = f3.apply("100");
		System.out.println(result5);
		
		//2. 인스턴스 메서드-  참조변수::메서드
			Test t = new Test();
			UnaryOperator<Integer> op = new UnaryOperator<Integer>() {
				@Override
				public Integer apply(Integer n) {
					return t.method2(n);
				}
			};
			//람다표현식
			UnaryOperator<Integer> op2 = n -> t.method2(n);
			
			//축약표현식
			UnaryOperator<Integer> op3 = t::method2;
			int result6 = op3.apply(100);
			System.out.println(result6);
			
			// 문자열관련 메서드 - 대문자로 반환
			UnaryOperator<String> op4 = new UnaryOperator<String>() {
				@Override
				public String apply(String s) {
					return s.toUpperCase();
				}
			};
			
			//람다표현식
			UnaryOperator<String> op5 = s->s.toUpperCase();
			
			//축약표현식- String::메서드명
			UnaryOperator<String> op6 = String::toUpperCase;
			String result7 = op6.apply("helLo");
			System.out.println(result7);
			
			//3. 생성자 - 클래스명::new
			Supplier<Test> sup = new Supplier<Test>() {
				@Override
				public Test get() {
					return new Test();
				}
			};
			
			//람다표현식
			Supplier<Test> sup2 = ()->new Test();
			
			//축약표현식
			Supplier<Test> sup3 = Test::new;
			Test t2 = sup3.get();
			
			
			Function<Integer, Test> ff = new Function<Integer, Test>() {
				@Override
				public Test apply(Integer n) {
					return new Test(n);
				}
			}; 
			
			//람다표현식
			Function<Integer, Test> ff2 = n -> new Test(n);
			
			//축약표현식
			Function<Integer, Test> ff3 = Test::new;
			Test t3 = ff3.apply(100);
			
			//4. sysout - System.out::println
			Consumer<String> c  = s-> System.out.println(s);
			c.accept("hello");
			
			//축약표현식
			Consumer<String> c2  = System.out::println;
			c2.accept("world");
	}

}
