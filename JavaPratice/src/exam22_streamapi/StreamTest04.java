package exam22_streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {

	public static void main(String[] args) {

		
		// 최종처리
		List<Integer> list = Arrays.asList(5, 100, 42, 57, 2, 1);
		
		// 1. 갯수
		long count = list.stream() // 리턴타입은 Stream<Integer>
									.count();
		
		long count2 = list.stream()
									.filter(n->n%2==0)
									.count();
		
		System.out.println("count : " + count2);
		
		// 2. 최대값
		int max = Arrays.stream(new int[ ] {5, 100, 42, 57, 2, 1}) // 리턴타입은 IntStream 이고 Stream 보다 더 많은 메서드가 제공된다
				.max() // OptionalInt 반환
				.getAsInt();
		System.out.println("max : " + max);
		
		// 3. 최소값
		int min = Arrays.stream(new int[ ] {5, 100, 42, 57, 2, 1}) // 리턴타입은 IntStream 이고 Stream 보다 더 많은 메서드가 제공된다
				.min() // OptionalInt 반환
				.getAsInt();
		System.out.println("min : " + min);
		
		// 4. 총합
		int sum = Arrays.stream(new int[ ] {5, 100, 42, 57, 2, 1}) // 리턴타입은 IntStream 이고 Stream 보다 더 많은 메서드가 제공된다
				.sum(); 
		
		System.out.println("sum : " + sum);
		
		// 5. 평균
		double avg = Arrays.stream(new int[ ] {5, 100, 42, 57, 2, 1}) // 리턴타입은 DoubleStream 이고 Stream 보다 더 많은 메서드가 제공된다
				.average() // OptionalDouble 
				.getAsDouble(); 
		
		System.out.println("avg : " + avg);
				
		
		
	}

}

