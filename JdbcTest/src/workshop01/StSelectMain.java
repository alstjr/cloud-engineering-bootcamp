package workshop01;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;



public class StSelectMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menu;
		while(true) { 
		System.out.println("********************************");
		System.out.println("    [학생 정보 관리 메뉴]    ");
		System.out.println("********************************");
		System.out.println("1. 전체 학생 목록");
		System.out.println("2. 학생이름 검색");
		System.out.println("3. 학생 입학년도 범위 검색 (예 > 2000부터 2003년까지)");
		System.out.println("4. 학생 학번으로 다중검색 (쉼표 구분자)");
		System.out.println("0.종료");
		System.out.println("********************************");
		System.out.print("메뉴 입력 => ");
		menu = scan.next();
		if ("1".equals(menu)) {
			System.out.println("===========================");
			System.out.println("학번 \t\t 이름 \t\t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부 ");
		// DeptService와 연동
				StService service = new StServiceImpl();
				service.setDao(new StDAO());
				List<StDTO> list = service.select();
				for(StDTO dto : list) {
					System.out.printf("%s \t %s \t %s \t %s \t %s \t %s  \n ",
							dto.getStuNo(), dto.getStuName(),dto.getStuSsn(),dto.getStuAddress(),dto.getEntDate(),dto.getAbsYn());
				}
				System.out.println("총 학생수 : " + list.size() + "명" );
		}else if("2".equals(menu)){
			System.out.print("검색할 학생명을 입력하세요. ");
			String name = scan.next();
			System.out.println("===========================");
			System.out.println("학번 \t\t 이름 \t\t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부 ");
		// DeptService와 연동
				StService service = new StServiceImpl();
				service.setDao(new StDAO());
				List<StDTO> list = service.nameSelect(name);
				for(StDTO dto : list) {
					System.out.printf("%s \t %s \t %s \t %s \t %s \t %s  \n ",
							dto.getStuNo(), dto.getStuName(),dto.getStuSsn(),dto.getStuAddress(),dto.getEntDate(),dto.getAbsYn());
				}
				System.out.println("총 학생수 : " + list.size() + "명" );
		}else if("3".equals(menu)) {
			 System.out.print("시작 입학년도 입력하시오 => ");
			 String startYear = scan.next();
			 System.out.print("끝 입학년도 입력하시오 => ");
			 String endYear = scan.next();
			 StService service = new StServiceImpl();
			service.setDao(new StDAO());
			 List<StDTO> list = service.yearSelect(startYear, endYear);
			    System.out.println("===========================");
			    for (StDTO dto : list) {
			        System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n",
			                dto.getStuNo(), dto.getStuName(), dto.getStuSsn(),
			                dto.getStuAddress(), dto.getEntDate(), dto.getAbsYn());
			    }
			    System.out.println("총 검색결과 : " + list.size() + "명");
		}else if("4".equals(menu)) {
			System.out.print("검색할 학생의 학번을 입력하시오 => ");
			String st = scan.next();
			StringTokenizer stNo = new StringTokenizer(st);
			
		}
		else {
			scan.close();
			System.out.println("프로그램 종료되었습니다");
			System.exit(0);
		}
		}// end while

	}// end main

}
