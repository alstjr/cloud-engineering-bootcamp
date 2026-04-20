package exam14_interface5_loose_couplig;

public class MySQLDAO implements DBDAO {
	
	// MySQL DB 연동
	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
	}
}
