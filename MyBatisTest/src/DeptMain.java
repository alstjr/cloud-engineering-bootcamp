import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDto;

public class DeptMain {

	
	public static void main(String[] args) {
		SqlSession session = MySqlSessionFactory.getSession();
		
		// 단일행
		DeptDto dto = session.selectOne("findByDeptno", 20);
		System.out.println(dto);
		//----------------------------------------------------------------------------
		
		
		DeptDto data = new DeptDto();
		data.setDeptno(10);
		data.setDname("ACCOUNTING");
		DeptDto dto2 = session.selectOne("findByDeptnoAndDname", data);
		System.out.println(dto2);
		//----------------------------------------------------------------------------

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", 10);
		map.put("y", "ACCOUNTING");
		DeptDto dto3 = session.selectOne("findByDeptnoAndDnameMap", map);
		System.out.println(dto3);

		// 다중행
		List<DeptDto> list = session.selectList("findAll");
		System.out.println(list);
		
		DeptDto data2 = new DeptDto();
		data2.setDeptno(40);
		data2.setDname("인사과");
		List<DeptDto> list2 = session.selectList("findByDnameOrDeptno", data2); 
		System.out.println(list2);
		
		// 자원반납
		session.close();
	
	
	}

}
