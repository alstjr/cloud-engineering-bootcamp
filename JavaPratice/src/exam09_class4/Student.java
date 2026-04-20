package exam09_class4;

public class Student {
	String name;
	int age;
	String adress;
	
	
	public Student() {}

	public Student(String name, int age, String adress) {
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

	public Student(String name, int age) {
		this(name, age, null);
	}
	
	
	

}
