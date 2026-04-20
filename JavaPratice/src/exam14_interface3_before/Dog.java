package exam14_interface3_before;

public class Dog extends Pet{
	
	String gender;

	public Dog() {}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
	
	@Override
	public void eat() { }
	@Override
	public void sleep() { }
	
	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
