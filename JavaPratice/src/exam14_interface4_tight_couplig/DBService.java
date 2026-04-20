package exam14_interface4_tight_couplig;

public class DBService {
	
	// MySQL
//	MySQLDAO dao;
	OracleDAO dao;
	
	// set메서드로 초기화 (원래는 생성자로 초기화)
//	public void setDao(MySQLDAO dao) {
	public void setDao(OracleDAO dao) {
		this.dao = dao;
	}

	public void connect() {
//		dao.connectMySQL();
		dao.connectOracle();
	}
}
