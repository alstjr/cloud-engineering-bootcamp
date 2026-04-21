package workshop01;

import java.sql.Connection;
import java.util.List;

import exam2.select.DeptDAO;
import exam2.select.DeptDTO;

public interface StService {

	public abstract void setDao(StDAO dao);
	public abstract List<StDTO>select();
	public abstract int count();
	public abstract List<StDTO>nameSelect(String name);
	public abstract List<StDTO>yearSelect(String starYear, String endYear);
	public abstract List<StDTO> stNoSelect(String stNo);
	
}
