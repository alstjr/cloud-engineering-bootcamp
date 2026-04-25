import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class DeptMain {

	
	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		// 단일행
		DeptDTO dto = session.selectOne("com.config.DeptMapper.findByDeptno", 20);
		System.out.println(dto);
		//----------------------------------------------------------------------------
		
		
		DeptDTO data = new DeptDTO();
		data.setDeptno(10);
		data.setDname("ACCOUNTING");
		DeptDTO dto2 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDname", data);
		System.out.println(dto2);
		//----------------------------------------------------------------------------

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", 10);
		map.put("y", "ACCOUNTING");
		DeptDTO dto3 = session.selectOne("com.config.DeptMapper.findByDeptnoAndDnameMap", map);
		System.out.println(dto3);

		// 다중행
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.findAll");
		System.out.println(list);
		
		DeptDTO data2 = new DeptDTO();
		data2.setDeptno(40);
		data2.setDname("인사과");
		List<DeptDTO> list2 = session.selectList("com.config.DeptMapper.findByDnameOrDeptno", data2); 
		System.out.println(list2);
		
		//insert문
//		DeptDto data3 = new DeptDto(61, "개발", "서울");
//		int n = session.insert("insert", data3);
//		if(n>=1) System.out.println("저장 성공");
//		session.commit();
		
		// update문
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("deptno", 61);
		map2.put("dname", "IT개발");
		map2.put("loc", "서울시");
		int n2 = session.update("com.config.DeptMapper.update", map2);
		if(n2>=1)System.out.println("수정 성공");
		session.commit();
		
		//delete 문
		int n3 = session.delete("com.config.DeptMapper.delete", 61);
		if(n3>=1)System.out.println("삭제 성공");
		session.commit();
		
		// &lt; 실습
		List<DeptDTO> list3 = session.selectList("com.config.DeptMapper.findByDeptnoLessThan",40);
		System.out.println(list3);
		
		//  DeptMapper2.xml 호출
		List<DeptDTO> list4 = session.selectList("com.config.DeptMapper2.findByDeptno",30);
		System.out.println(list4);
		
		// 자원반납
		session.close();
	
	
	}

}
