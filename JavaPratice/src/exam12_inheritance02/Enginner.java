package exam12_inheritance02;

// 엔지니어
// Engineer is a Employee (상속관계)
public class Enginner extends Employee {

	String skill; // 엔지니어의 기술
	public Enginner() {}
	public Enginner(String name, int salary, String skill) {
		super(name, salary); // 명시적 호출 반드시 첫 라인
		System.out.println("Enginner 생성자");
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}
	
	// getter
	// setter
	
	public String getEnginner() {
		return name+"\t"+salary+"\t"+skill;
	}
	
	

}
