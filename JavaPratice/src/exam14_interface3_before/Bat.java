package exam14_interface3_before;

public class Bat extends Pet {

	public Bat() {}

	public Bat(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat() { }
	@Override
	public void sleep() { }
	
	public void batFly() {}
}
