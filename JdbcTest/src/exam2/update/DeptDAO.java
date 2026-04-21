package exam2.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB 연동 
public class DeptDAO {
	// dto 는 화면처리(main)에서 입력된 데이터를 받기 위해 사용
	public int update(Connection con, DeptDTO dto) {		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int n = 0;
		 try {
			 String sql = "update dept set dname = ?, loc=? where deptno=?" ;
			 pstmt = con.prepareStatement( sql );
			 pstmt.setInt(3, dto.getDeptno());
			 pstmt.setString(1, dto.getDname());
			 pstmt.setString(2, dto.getLoc());
			 n= pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}// try~catch~finally
		 return n;
	}// end insert
}// end class