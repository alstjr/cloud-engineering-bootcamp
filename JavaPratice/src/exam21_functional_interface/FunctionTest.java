package exam21_functional_interface;

import java.util.function.Function;

/*
 @FunctionalInterface
public interface Function<T,R>{
  R apply(T t);   // public abstract R apply(T t); 동일
}  
 */

public class FunctionTest {

	public static void main(String[] args) {
		
		// Function<T,R> 인터페이스 사용
		
		//익명클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		int n = f.apply("hello");
		System.out.println("Function : " + n);
		
		// 람다표현식
		Function<String, Integer> f2  = t -> t.length();
		int n2 = f2.apply("hello");
		System.out.println("람다.Function : " + n2);
	}

}
