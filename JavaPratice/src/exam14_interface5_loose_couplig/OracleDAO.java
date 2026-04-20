package exam14_interface5_loose_couplig;

public class OracleDAO implements DBDAO {
	
	// Oracle DB 연동
	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}
}
	
