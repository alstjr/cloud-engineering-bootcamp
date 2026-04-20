package exam12_inheritance01;

// 엔지니어
public class Enginner {
	
	String name;
	int salary;
	String skill; // 엔지니어의 기술
	public Enginner() {}
	public Enginner(String name, int salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	
	// getter
	// setter
	
	public String getEnginner() {
		return name+"\t"+salary+"\t"+skill;
	}
	
	

}
