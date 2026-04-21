package workshop01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentSelectMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String driver = "com.mysql.cj.jdbc.Driver"; // 핵심이 되는 클래스명
		String url = "jdbc:mysql://localhost:3306/workshop";
		String userid = "root";
		String passwd = "1234";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int menu = 0;
		do {
		System.out.println("********************************");
		System.out.println("    [학생 정보 관리 메뉴]    ");
		System.out.println("********************************");
		System.out.println("1. 전체 학생 목록");
		System.out.println("0.종료");
		System.out.println("********************************");
		System.out.print("메뉴 입력 => ");
		menu = sc.nextInt();
		if (menu == 1) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				 con = DriverManager.getConnection(url, userid, passwd);
				 String sql = "Select STUDENT_NO, DEPARTMENT_NO, STUDENT_NAME,"
				 		+ "concat(SubString(STUDENT_SSN,1,8),'******') as STUDENT_SSN,"
				 		+ "CASE WHEN LENGTH(STUDENT_ADDRESS) > 10 "
			            + "THEN CONCAT(SUBSTRING(STUDENT_ADDRESS, 1, 10), '...') "
			            + "ELSE STUDENT_ADDRESS END as STUDENT_ADDRESS,"
				 		+ "DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE, "
				 		+ "ABSENCE_YN "
				 		+ "from tb_student";
				 pstmt = con.prepareStatement( sql );
				 rs = pstmt.executeQuery();
					while(rs.next()) { // 행선택
						// 열선택
						String stno = rs.getString("STUDENT_NO"); // 컬럼헤더값
						String departmentno = rs.getString("DEPARTMENT_NO"); // rs.getString("dname")
						String stname = rs.getString("STUDENT_NAME"); // rs.getString("loc")
						String stssn = rs.getString("STUDENT_SSN");
						String staddress = rs.getString("STUDENT_ADDRESS");
						String enterdate = rs.getString("ENTRANCE_DATE");
						 String abyn = rs.getString("ABSENCE_YN");
						System.out.printf("%s, %s, %s, %s, %s, %s, %s  \n", stno, departmentno, stname, stssn,staddress, enterdate,abyn);
					}
				String sql2 = "select count(*) from tb_student";
				pstmt = con.prepareStatement(sql2);
				rs = pstmt.executeQuery();
				if(rs.next()) {
				System.out.println("총 학생수 : " + rs.getString(1));
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
		}else {
			System.out.println("프로그램이 종료되었습니다.");
		}
		}while(menu != 0);
	}

}
