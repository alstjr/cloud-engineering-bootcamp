package exam14_interface2;

public class Cat extends Pet {
	
	String color; // 고양이 색상

	public Cat() {}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public void catEat() { }
	public void catSleep() { }
	
	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
