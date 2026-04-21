package exam2.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DB 연동 
public class DeptDAO {
	// dto 는 화면처리(main)에서 입력된 데이터를 받기 위해 사용
	public int insert(Connection con, DeptDTO dto) 
		throws DuplicatedDeptNoException{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int n = 0;
		 try {
			 String sql = "insert into dept(deptno,dname,loc) values (?, ?, ?)" ;
			 pstmt = con.prepareStatement( sql );
			 pstmt.setInt(1, dto.getDeptno());
			 pstmt.setString(2, dto.getDname());
			 pstmt.setString(3, dto.getLoc());
			 n= pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DuplicatedDeptNoException(dto.getDeptno() + "값이 중복되어 예외발생");
//			e.printStackTrace();
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