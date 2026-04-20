package exam12_inheritance02;

// 관리자
//Manager is a Employee (상속관계)
public class Manager extends Employee {

	String depart; // 관리부서
	public Manager() {}
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		System.out.println("Manager 생성자");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}
	
	// getter
	// setter
	
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

}
