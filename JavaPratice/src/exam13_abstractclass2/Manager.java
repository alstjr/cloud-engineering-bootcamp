package exam13_abstractclass2;

public class Manager extends Employee {
	
	String depart;

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	// name과 slary, depart를  리턴하는 메서드가 필요하다고 order가 옴
	public String getEmployee() {
		return depart + "\t" + name + "\t" + salary;
	}
}
	
