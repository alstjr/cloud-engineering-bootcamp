package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {

	public static void main(String[] args) {
	
		// Dept 테이블 조회
		// 1. 4가지 정보
		String driver = "com.mysql.cj.jdbc.Driver"; // 핵심이 되는 클래스명
		String url = "jdbc:mysql://localhost:3306/testdb";
		String userid = "root";
		String passwd = "1234";
		
		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 3. Connection 맺기
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			 con = DriverManager.getConnection(url, userid, passwd);
			 String sql = "select deptno as no, dname, loc from dept";
			 pstmt = con.prepareStatement( sql );
			 rs = pstmt.executeQuery();
				while(rs.next()) { // 행선택
					// 열선택
					int deptno = rs.getInt("no"); // 컬럼헤더값
					String dname = rs.getString(2); // rs.getString("dname")
					String loc = rs.getString(3); // rs.getString("loc")
					System.out.printf("%d, %s, %s \n", deptno, dname, loc);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// 4. sql문 작성
		// 5. PrepareStatement 객체 ( sql문 전송 객체 )
		// 6. sql문 실행
		// 7. 자원반납 ( 사용했던 자원 역순으로 close() )
		
		
	}

}
