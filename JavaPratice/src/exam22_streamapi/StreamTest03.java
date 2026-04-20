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

public class StreamTest03 {

	public static void main(String[] args) {

		// 컬렉션에서 Stream 생성
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("정조");
		list.add("홍장군");
		list.add("선덕여왕");
		list.add("이순신");
		list.add("정조");
		list.add("이순신");
		
		Stream<String> stream = list.stream();
		
		// 모두출력
		stream.forEach(System.out::println); // 스트림에 한번 태우면 다시 못태우기 때문에 일회성이다.
		System.out.println("===========================");
		
		//중간처리 - 중복제거 distinct()
//		 stream = list.stream();
//		Stream<String> stream2 = stream.distinct();
//		stream2.forEach(System.out::println);
		
		// 최종형태 메소드 체인형태를 보편적으로 사용한다.
		list.stream()
			 .distinct()
			 .forEach(System.out::println);
		System.out.println("===========================");
		
		//중간처리 - 필터링 filter(Predicate)
		stream = list.stream();
	
		// 익명 클래스
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String s) {
				return s.length() == 3;
			}
		};
		// 람다표현식
		Predicate<String> p2 = s -> s.length() == 3;
		
		Stream<String> stream2 = stream.filter(p2);
//		stream2.forEach(System.out::println);
		
		// 최종코드
		list.stream()
			.filter(p2)
			.forEach(System.out::println);
		
		System.out.println("===========================");
		// distinct() + filter()
		// 최종 코드
		list.stream()
			.distinct()
			.filter(p2)
			.forEach(System.out::println);
		System.out.println("===========================");

		// 중간처리 - 가공 map(Function<T, R> )
		List<Student> list2 = Arrays.asList(new Student("홍길동", 100),
																new Student("이순신", 90),
																new Student("유관순", 50),
																new Student("강감찬", 70),
																new Student("정조", 95),
																new Student("선덕여왕", 45)
																                            ); 

		// 이름만 출력
		Stream<Student> stream4 = list2.stream();
		
		// 익명함수
		Function<Student, String> f = new Function<Student, String>() {
			
			@Override
			public String apply(Student stu) {
				return stu.getName() ;
			}
		};
		// 람다표현식
		Function<Student, String> f2 = stu -> stu.getName();
		//메서드참조
		Function<Student, String> f3 = Student :: getName;
		
		Stream<String> stream5 = stream4.map(f3);
		stream5.forEach(System.out::println);
		System.out.println("===========================");
		
		// 최종코드
		list2.stream()
			.map(Student :: getName)
			.forEach(System.out::println);
		System.out.println("===========================");

		// flatMap ( Function<T, Stream>)
		List<String> list9 = Arrays.asList("10,20,30", "40,50,60");
		
		Stream<String> stream9 = list9.stream();
		
		Function<String, IntStream> f9 = new Function<String, IntStream>() {
			@Override
			public IntStream apply(String s) {
				String [] arr = s.split(",");  // ["10", "20", "30"]
				int [ ] arrNum = new int[3]; // [10,20,30]
				for( int i=0; i<arr.length;) {
					arrNum[i] = Integer.parseInt(arr[i]);
				}
				return Arrays.stream(arrNum);
			}
		};
		
			 IntStream is = stream9.flatMapToInt(f9);
			 is.forEach(System.out::println);
		
		
		
		
	}

}

class Student{
	String name; // 이름
	int grade; // 점수
	public Student() {
	}
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	
}
