package workshop01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import exam2.select.DeptDTO;

public class StDAO {

	// 학생정보조회
	public List<StDTO> select(Connection con){
		
		List<StDTO> list = new ArrayList<StDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		 String sql = "Select STUDENT_NO, DEPARTMENT_NO, STUDENT_NAME,"
			 		+ "concat(SubString(STUDENT_SSN,1,8),'******') as STUDENT_SSN,"
			 		+ "CASE "
			 		+ "WHEN STUDENT_ADDRESS IS NULL OR STUDENT_ADDRESS = '' THEN '***주소미상***' "
			 		+ "WHEN LENGTH(STUDENT_ADDRESS) > 10 "
		            + "THEN CONCAT(SUBSTRING(STUDENT_ADDRESS, 1, 10), '...') "
		            + "ELSE STUDENT_ADDRESS END as STUDENT_ADDRESS,"
			 		+ "DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE, "
			 		+ "ABSENCE_YN,"
			 		+ "COACH_PROFESSOR_NO "
			 		+ "from tb_student";
		 try {
				pstmt = con.prepareStatement( sql );
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 try {
				rs = pstmt.executeQuery();
				while(rs.next()) { // 행선택
					// 열선택
					String stuNo = rs.getString("STUDENT_NO");
					String stuName = rs.getString("STUDENT_NAME");
					String stuSsn =  rs.getString("STUDENT_SSN");
					String stuAddress =  rs.getString("STUDENT_ADDRESS");
					String entDate =  rs.getString("ENTRANCE_DATE");
					String absYn = rs.getString("ABSENCE_YN");
					String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");
					// 레코드 저장용 ArrayList에 누적
					StDTO dto = new StDTO(stuNo, stuName, stuSsn, stuAddress,entDate, absYn, coachProfessorNo);
					list.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs != null)rs.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} // try ~ catch ~ finally
		return list;
	}
	public int count(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int cnt = 0;
		try {
		String sql = "select count(*) from tb_student";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			cnt = rs.getInt(1);
		}
		}catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }// try~catch~finally 
		return cnt;
	}// end count
	
	// 학생이름 조회
	public List<StDTO> nameSelect(Connection con, String name){
		List<StDTO> list = new ArrayList<StDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Select STUDENT_NO, DEPARTMENT_NO, STUDENT_NAME,"
		 		+ "concat(SubString(STUDENT_SSN,1,8),'******') as STUDENT_SSN,"
		 		+ "CASE "
		 		+ "WHEN STUDENT_ADDRESS IS NULL OR STUDENT_ADDRESS = '' THEN '***주소미상***' "
		 		+ "WHEN LENGTH(STUDENT_ADDRESS) > 10 "
	            + "THEN CONCAT(SUBSTRING(STUDENT_ADDRESS, 1, 10), '...') "
	            + "ELSE STUDENT_ADDRESS END as STUDENT_ADDRESS,"
		 		+ "DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE, "
		 		+ "ABSENCE_YN,"
		 		+ "COACH_PROFESSOR_NO "
		 		+ "from tb_student where STUDENT_NAME like ?";
		try {
			pstmt = con.prepareStatement( sql );
			pstmt.setString(1, "%" + name + "%"); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 try {
			rs = pstmt.executeQuery();
			while(rs.next()) { // 행선택
				// 열선택
				String stuNo = rs.getString("STUDENT_NO");
				String stuName = rs.getString("STUDENT_NAME");
				String stuSsn =  rs.getString("STUDENT_SSN");
				String stuAddress =  rs.getString("STUDENT_ADDRESS");
				String entDate =  rs.getString("ENTRANCE_DATE");
				String absYn = rs.getString("ABSENCE_YN");
				String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");
				// 레코드 저장용 ArrayList에 누적
				StDTO dto = new StDTO(stuNo, stuName, stuSsn, stuAddress,entDate, absYn, coachProfessorNo);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // try ~ catch ~ finally
	return list;
	}// end selectName
	
	// 학생입학년도조회
	public List<StDTO> yearSelect(Connection con, String startYear, String endYear) {
	    List<StDTO> list = new ArrayList<StDTO>();
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String sql = "Select STUDENT_NO, STUDENT_NAME,"
	             + "IFNULL(concat(SubString(STUDENT_SSN,1,8),'******'), '***주소미상***') as STUDENT_SSN,"
	             + "CASE "
	             + "WHEN STUDENT_ADDRESS IS NULL OR STUDENT_ADDRESS = '' THEN '***주소미상***' "
	             + "WHEN LENGTH(STUDENT_ADDRESS) > 10 THEN CONCAT(SUBSTRING(STUDENT_ADDRESS, 1, 10), '...') "
	             + "ELSE STUDENT_ADDRESS END as STUDENT_ADDRESS,"
	             + "DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE, "
	             + "ABSENCE_YN, COACH_PROFESSOR_NO "
	             + "from tb_student WHERE YEAR(ENTRANCE_DATE) BETWEEN ? AND ?"
	             + "ORDER BY ENTRANCE_DATE DESC"; 
	    try {
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, startYear); // 시작 년도
	        pstmt.setString(2, endYear);   // 끝 년도
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	            String stuNo = rs.getString("STUDENT_NO");
	            String stuName = rs.getString("STUDENT_NAME");
	            String stuSsn = rs.getString("STUDENT_SSN");
	            String stuAddress = rs.getString("STUDENT_ADDRESS");
	            String entDate = rs.getString("ENTRANCE_DATE");
	            String absYn = rs.getString("ABSENCE_YN");
	            String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");
	            list.add(new StDTO(stuNo, stuName, stuSsn, stuAddress, entDate, absYn, coachProfessorNo));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return list;
	}// end yearSelect
	public List<StDTO> stNoSelect(Connection con, String stNo) {
	    List<StDTO> list = new ArrayList<StDTO>();
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String sql = "Select STUDENT_NO, STUDENT_NAME,"
	             + "IFNULL(concat(SubString(STUDENT_SSN,1,8),'******'), '***주소미상***') as STUDENT_SSN,"
	             + "CASE "
	             + "WHEN STUDENT_ADDRESS IS NULL OR STUDENT_ADDRESS = '' THEN '***주소미상***' "
	             + "WHEN LENGTH(STUDENT_ADDRESS) > 10 THEN CONCAT(SUBSTRING(STUDENT_ADDRESS, 1, 10), '...') "
	             + "ELSE STUDENT_ADDRESS END as STUDENT_ADDRESS,"
	             + "DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE, "
	             + "ABSENCE_YN, COACH_PROFESSOR_NO "
	             + "from tb_student WHERE STUDENT_NO = ?"
	             + "ORDER BY ENTRANCE_DATE DESC"; 
	    try {
	        pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, stNo);
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	            String stuNo = rs.getString("STUDENT_NO");
	            String stuName = rs.getString("STUDENT_NAME");
	            String stuSsn = rs.getString("STUDENT_SSN");
	            String stuAddress = rs.getString("STUDENT_ADDRESS");
	            String entDate = rs.getString("ENTRANCE_DATE");
	            String absYn = rs.getString("ABSENCE_YN");
	            String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");
	            list.add(new StDTO(stuNo, stuName, stuSsn, stuAddress, entDate, absYn, coachProfessorNo));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return list;
	}// end stNoSelect
	
} // end class
