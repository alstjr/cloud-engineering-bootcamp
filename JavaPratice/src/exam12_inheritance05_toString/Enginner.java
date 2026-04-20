package exam12_inheritance05_toString;

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
	
//	public String getEnginner() {
//		return name+"\t"+salary+"\t"+skill;
//	}
	// 오버라이딩
	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+skill;
//		return name+"\t"+salary+"\t"+skill;
	}
	

}
