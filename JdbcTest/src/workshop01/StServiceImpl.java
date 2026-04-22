package workshop01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import exam2.select.DeptDAO;
import exam2.select.DeptDTO;

public class StServiceImpl implements StService{
	
	// 인스턴스 변수
		String driver = "com.mysql.cj.jdbc.Driver"; // 핵심이 되는 클래스명
		String url = "jdbc:mysql://localhost:3306/workshop";
		String userid = "root";
		String passwd = "1234";
		// DeptDAO 설정
		StDAO dao;
		//set메서드로 초기화
		@Override
		public void setDao(StDAO dao) {
			this.dao = dao;
		}	
		// 기본생성자에서 드라이브 로딩처리
		public StServiceImpl() {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} // end 생성자

// 학생정보조회
	@Override
	public List<StDTO> select() {
		List<StDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			//DeptDAO연동해서 list() 호출
			list = dao.select(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public int count() {
		int cnt = 0;
	    Connection con = null;
	    try {
	        con = DriverManager.getConnection(url, userid, passwd);
	        cnt = dao.count(con); // DAO에 위임
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return cnt;
	}
	// 학생 이름 조회
	@Override
	public List<StDTO> nameSelect(String name) {
		List<StDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			//DeptDAO연동해서 list() 호출
			list = dao.nameSelect(con, name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}// end nameSelect
	// 학생 입학년도 조회
	@Override
	public List<StDTO> yearSelect(String startYear, String endYear) {
	    List<StDTO> list = null;
	    Connection con = null;
	    try {
	        con = DriverManager.getConnection(url, userid, passwd);
	        list = dao.yearSelect(con, startYear, endYear);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return list;
	}// end yearSelect
	//학생 학번조회
	@Override
	public List<StDTO> stNoSelect(String stNo) {
		 List<StDTO> list = null;
		    Connection con = null;
		    try {
		        con = DriverManager.getConnection(url, userid, passwd);
		        StDAO dao = new StDAO();
		        list = dao.stNoSelect(con,stNo);
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return list;
	}
	

}
