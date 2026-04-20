package exam13_abstractclass;

public class AabstractClassTest {

	public static void main(String[] args) {
		
		// 추상화 클래스이기 때문에 new 안된다
//		AbstractClass a = new AbstractClass(); 
		
//		AbstractChildClass a = new AbstractChildClass();
		AbstractClass a = new AbstractChildClass(); // 다형성
		System.out.println(a.num);
		a.a();
		a.b();
		a.c();
	}

}
