package exam12_inheritance06_Polymorphims;

// 엔지니어
// Engineer is a Employee (상속관계)
public class Enginner extends Employee {

	String skill; // 엔지니어의 기술
	public Enginner() {
		super();
	}
	
	public Enginner(String name, int salary) {
		super(name, salary);
	}
	

	public Enginner(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	// getter
	// setter
	
	// Employee의 toString 재정의
	@Override
	public String toString() {
		return "Enginner [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
