package exam13_abstractclass;

public abstract class AbstractClass {
	
	// 구성요소 4가지
	int num;
	public void a() {
		System.out.println("a 메서드");
		
	}
	public AbstractClass() { }
	
	// 추상 메서드(반드시는 아니다)
	public abstract void b();
	public abstract void c();

}
