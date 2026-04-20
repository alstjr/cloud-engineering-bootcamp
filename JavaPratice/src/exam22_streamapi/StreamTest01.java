package exam22_streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {

		// 컬렉션에서 Stream 생성
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		
		List<String> list2 = Arrays.asList("이순신1","이순신2", "이순신3");
		
		Stream<String> stream = list.stream();
		
		Set<String> set = new HashSet<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		
		Stream<String> stream2 = set.stream();
		
		// 배열에서 Stream 생성
		String [ ] names = {"이순신1", "이순신2", "이순신3"};
		Stream<String> stream3 = Arrays.stream(names);
	}

}
