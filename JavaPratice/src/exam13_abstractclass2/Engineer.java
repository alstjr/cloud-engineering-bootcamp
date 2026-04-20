package exam13_abstractclass2;

public class Engineer extends Employee {
	
	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	
	// name과 slary, skill을 리턴하는 메서드가 필요하다고 order가 옴
	public String getEmployee() {
		return skill + "\t" + name + "\t" + salary;
	}
}
