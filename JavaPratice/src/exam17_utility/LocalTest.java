package exam17_utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalTest {
	public static void main(String[] args) {
		
		// 날짜 얻기
		LocalDate today = LocalDate.now();
		System.out.println(today); // 2026-04-09
		
		// 과거로
		LocalDate today2 = today.minusDays(2);
		LocalDate today3 = today.minusMonths(1);
		LocalDate today4 = today.minusYears(1);
		System.out.println(today2); // 2026-04-07
		System.out.println(today3); // 2026-03-09
		System.out.println(today4); // 2025-04-09
		
		// 미래로
		LocalDate today5 = today.plusDays(3);
		LocalDate today6 = today.plusMonths(3);
		LocalDate today7 = today.plusYears(3);
		System.out.println(today5); 
		System.out.println(today6); 
		System.out.println(today7);
		
		// 특정 날짜 설정
		LocalDate my = LocalDate.of(2036, 10, 10);
		System.out.println(my);
		
		// str ------> LocalDate
		String str = "2026-12-24"; // "2026년12월24일", "2026/12/24"
		
		LocalDate my2 = LocalDate.parse(str);
		System.out.println(my2);
		
		String str2 = "2026년12월24일";
		LocalDate my3 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
		System.out.println(my3);
		
		String str3 = "2026/12/24";
		LocalDate my4 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(my4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
