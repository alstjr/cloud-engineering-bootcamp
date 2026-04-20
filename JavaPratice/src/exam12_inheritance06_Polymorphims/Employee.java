package exam12_inheritance06_Polymorphims;

public class Employee {
	String name;
	int salary;
	public Employee() {
//		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
//		System.out.println("Employee (String name, int salary) 생성자");
		this.name = name;
		this.salary = salary;
	}
	// getter
	// setter
	
	// Object의 toString 재정의
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
