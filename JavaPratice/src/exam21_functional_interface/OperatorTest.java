package exam21_functional_interface;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjDoubleConsumer;

/*
@FunctionalInterface
public interface Consumer<T>{
	void accept(T t); // public abstract void accept(T t);
}
*/
public class OperatorTest {

	public static void main(String[] args) {
		
		// Operator 인터페이스 사용
		// 익명클래스
		BinaryOperator<String> x = new BinaryOperator<String>() {
			
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		String s = x.apply("hello","world");
		System.out.println(s);
		
		// 람다표현식
		BinaryOperator<String> x2 = (t, u) -> t+u;
		String s2 = x2.apply("hello", "world");
		System.out.println(s2);
		
		IntUnaryOperator x3 = new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int x) {
				return x+100;
			}
		};
		int n = x3.applyAsInt(100);
		System.out.println(n);
		
		// 람다표현식
		IntUnaryOperator x4 = x5-> x5+100;
		int n2 = x4.applyAsInt(100);
		System.out.println(n2);
	}

}
