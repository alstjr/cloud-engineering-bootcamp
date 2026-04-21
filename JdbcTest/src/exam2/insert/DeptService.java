package exam2.insert;

import exam2.insert.DeptDAO;

public interface DeptService {
	
	public  abstract void setDao(DeptDAO dao);
	public abstract int insert(DeptDTO dto) throws DuplicatedDeptNoException;
}
