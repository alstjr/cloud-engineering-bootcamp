package exam21_functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		// Predicate 인터페이스 사용
		// 익명클래스
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length() == 3; // 전달된 파라미터 글자수 3개냐
			}
		};
		boolean result = p.test("홍길동");
		System.out.println(result);
		
		// 람다표현식
		Predicate<String> p2 = t -> t.length() == 3;
		boolean result2 = p2.test("홍길동");
		System.out.println(result2);
	
	BiPredicate<String, Integer> p3 = new BiPredicate<String, Integer>() {
		
		@Override
		public boolean test(String s, Integer n) {
			return s.charAt(n) == '홍'; // (문자열, 문자열의위치값) ex. "홍길동", 0 전달해서 0번째 글자가 홍이냐?
		}
	};
	
	boolean result3 = p3.test("홍길동",0);
	System.out.println(result3);
	
	}
}
