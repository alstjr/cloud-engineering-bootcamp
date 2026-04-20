package exam14_interface3_after;

public class Bat extends Pet implements Flyer{

	public Bat() {}

	public Bat(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat() { }
	@Override
	public void sleep() { }
	
	@Override
	public void fly() {}
}
