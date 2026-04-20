package exam14_interface2_1;

public class Cat extends Pet {
	
	String color; // 고양이 색상

	public Cat() {}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	@Override
	public void eat() { }
	@Override
	public void sleep() { }
	
	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
