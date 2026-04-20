package exam13_abstractclass2;

public abstract class Employee {

	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// name과 slary를 리턴하는 메서드가 필요하다고 order가 옴
	public abstract String getEmployee ();
	
	
}
