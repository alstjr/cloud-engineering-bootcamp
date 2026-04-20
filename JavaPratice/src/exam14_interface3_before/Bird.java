package exam14_interface3_before;
// 인터페이스 적용전

public class Bird extends Pet {

	public Bird() {}

	public Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat() { }
	@Override
	public void sleep() { }
	
	//
	public void birdFly() {}
}
