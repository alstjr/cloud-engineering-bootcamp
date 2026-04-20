package exam14_interface5_loose_couplig;

public interface DBDAO {

	// DB 연동시 종류와 무관하게 연동할 수 있는 메서드 정의
	public abstract void connectDB();
}
