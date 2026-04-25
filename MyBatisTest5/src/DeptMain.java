import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	
	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
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
		
		
		String num = scan.next();
		if("1".equals(num)) {
			DeptService service = new DeptServiceImpl();
			service.setDao(new DeptDAO());
			
			List<DeptDTO> list = service.findAll();
			for(DeptDTO dto : list) {
				System.out.println(dto);
			}
			session.close();
		}else if ("2".equals(num)) {
			System.out.println("부서번호를 입력하세요 ");
			int deptno = scan.nextInt();
			System.out.println("부서명을 입력하세요 ");
			String dname = scan.next();
			System.out.println("부서위치를 입력하세요 ");
			String loc = scan.next();
			
			DeptService service = new DeptServiceImpl();
			service.setDao(new DeptDAO());
			DeptDTO dto = new DeptDTO(deptno, dname, loc);
			int n = service.insert(dto);
			if(n>=1)System.out.println("저장성공");
		}else if ("3".equals(num)) {
			System.out.println("삭제할 부서번호를 입력하세요 ");
			int deptno = scan.nextInt();		
			DeptService service = new DeptServiceImpl();
			service.setDao(new DeptDAO());
			int n = service.delete(deptno);
			if(n>=1)System.out.println("삭제성공");
		}else if("4".equals(num)) {
			
			System.out.println("수정할 부서번호를 입력하시오");
			int deptno = scan.nextInt();
			System.out.println("수정할 부서명 입력하시오");
			String dname = scan.next();
			System.out.println("수정할 부서위치 입력하시오");
			String loc = scan.next();
			
			DeptService service  = new DeptServiceImpl();
			service.setDao(new DeptDAO());
			HashMap<String, Object> map = new  HashMap<String, Object>();
			map.put("deptno", deptno);
			map.put("dname", dname);
			map.put("loc", loc);
			int n = service.update(map);
			if(n>=1)System.out.println("수정 성공");
		}else {
			scan.close();
			System.out.println("프로그램종료");
			System.exit(0);
		}
		}
//		DeptService service = new DeptServiceImpl();
//		service.setDao(new DeptDAO());
//		
//		List<DeptDTO> list = service.findAll();
//		for(DeptDTO dto : list) {
//			System.out.println(dto);
		
		
		// 자원반납
	
	
	}

}
