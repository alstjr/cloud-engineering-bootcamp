package exam20_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		// Map 계열 : key/value 쌍으로 저장
		
//		HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>(); // 다형성 적용
		
		// 데이터 저장
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "유관순2"); // 동일한 key 사용하여 수정
		
		// 데이터 출력1 - get(key)
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4")); // null, 존재하지 않는 key값은 null 리턴
		System.out.println("=====================");
		
		// 데이터 출력2 - toString
		System.out.println(map);
		System.out.println(map.toString());
		System.out.println("=====================");
		
		// 데이터 출력3 - keyset() 이용해서 key만 추출하고 나중에 value 추출
		Set<String> keys = map.keySet();
		System.out.println(keys); // 키값
		for(String key : keys) {
			System.out.println(map.get(key)); 
		}
		System.out.println("=====================");

		// 데이터 출력4 - values() - 값만얻기
		Collection<String> data = map.values();
		for(String v : data) {
			System.out.println(v); 
		}
		System.out.println("=====================");
		
		// 추가 메서드
		System.out.println("key 존재여부 : " + map.containsKey("p1"));
		System.out.println("key 존재여부 : " + map.containsValue("홍길동"));
		System.out.println("값 크기 : " + map.size());
		
		//삭제
		String del = map.remove("p1");
		System.out.println("삭제된 데이터 : " + del);
		System.out.println(map);
		
		// 전체삭제
		map.clear();
		System.out.println(map);
		
		// 생성방법2
		Map<String, Integer> map2 = Map.of("k1",10, "k2",20); // 수정 불가
		System.out.println(map2);
		
		
	}

}
