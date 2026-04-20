package exam12_inheritance05_toString;

public class Employee {
	String name;
	int salary;
	public Employee() {
		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
		System.out.println("Employee (String name, int salary) 생성자");
		this.name = name;
		this.salary = salary;
	}
	
	
	// getter
	// setter
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
