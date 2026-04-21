package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transection {

	public static void main(String[] args) {
	
		// Dept 테이블 저장
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
			
			 // 1. insert문
			 String sql = "insert into dept(deptno,dname,loc) values (?, ?, ?)" ;
			 pstmt = con.prepareStatement( sql );
			 
			 // ? 대신에 나중에 값을 설정
			 // pstmt.setXXX(?위치, 값);
			 pstmt.setInt(1, 51);
			 pstmt.setString(2, "인사");
			 pstmt.setString(3, "제주");
			
			 int n = pstmt.executeUpdate();
			 if(n>=1) System.out.println("저장성공");
			 
			 // 2. update문
			 String sql2 = "update dep set dname=?, loc=? where deptno=?";
			 pstmt = con.prepareStatement(sql2);
			 
			 pstmt.setInt(3, 51);
			 pstmt.setString(2, "인사과");
			 pstmt.setString(1, "제주도");
			 
			 int n2 = pstmt.executeUpdate();
			 if(n2>=1) System.out.println("수정성공");
			 
			 con.commit();
		} catch (SQLException e) {
			try {
				if(con != null) con.rollback();
				System.out.println("오류발생");
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
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
