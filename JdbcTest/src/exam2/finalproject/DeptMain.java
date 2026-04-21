package exam2.finalproject;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		
		// 메뉴 보여주기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 부서 목록보기");
			System.out.println("2. 부서 저장");
			System.out.println("3. 부서 삭제");
			System.out.println("4. 부서 수정");
			System.out.println("0. 종료");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			
			// 변수 읽기
			String num = scan.next();
			if("1".equals(num)) {
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				List<DeptDTO> list = service.list();
				System.out.println("부서번호 \t\t 부서명 \t\t 부서위치");
				System.out.println("---------------------------------");
				for(DeptDTO dto : list) {
					System.out.printf("%d     %s     %s \n",
							dto.getDeptno(),dto.getDname(),dto.getLoc());
				}
			}else if("2".equals(num)) {
				System.out.println("부서번호를 입력하세요 ");
				int deptno = scan.nextInt();
				System.out.println("부서명을 입력하세요 ");
				String dname = scan.next();
				System.out.println("부서위치를 입력하세요 ");
				String loc = scan.next();
				
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				 
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n;
				try {
					n = service.insert(dto);
					if(n>=1) System.out.println("저장성공");
				} catch (DuplicatedDeptNoException e) {
//					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				
			}else if("3".equals(num)) {
				 
				System.out.println("삭제할 부서번호를 입력하세요 ");
				int deptno = scan.nextInt();		
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				int n = 0;
				try {
					n = service.delete(deptno);
					if(n>=1) System.out.println("삭제성공");
				} catch (RecordNotFoundException e) {
					e.printStackTrace();
				}
				
			}else if("4".equals(num)) {
				 
				System.out.println("수정할 부서번호를 입력하세요 ");
				int deptno = scan.nextInt();
				System.out.println("수정할 부서명을 입력하세요 ");
				String dname = scan.next();
				System.out.println("수정할 부서위치를 입력하세요 ");
				String loc = scan.next();
				
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n = service.update(dto);
				if(n>=1) System.out.println("수정 성공");
			}else {
				// "0"
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}// end while
		
		// DeptService와 연동
		
	}

}
