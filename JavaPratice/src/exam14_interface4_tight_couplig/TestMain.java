package exam14_interface4_tight_couplig;

public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
//		service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connect();
	}

}
