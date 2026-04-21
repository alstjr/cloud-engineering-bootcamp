package exam2.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB 연동 
public class DeptDAO {
	
	public int delete(Connection con, int deptno)
			throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int n = 0;
		 try {
			 String sql = "delete from dept where deptno=?" ;
			 pstmt = con.prepareStatement( sql );
			 pstmt.setInt(1, deptno);
			 n= pstmt.executeUpdate();
			 // 명시적으로 예외 발생
			 if(n==0) throw new RecordNotFoundException(deptno + " 존재하지 않습니다. 다시 확인하세요");
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