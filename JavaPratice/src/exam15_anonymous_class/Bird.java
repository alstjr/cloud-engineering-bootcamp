package exam15_anonymous_class;

// 이름 있는 클래스
public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}

	@Override
	public void land() {
		System.out.println("Bird.land()");
	}

}
