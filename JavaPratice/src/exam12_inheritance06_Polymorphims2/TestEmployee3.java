package exam12_inheritance06_Polymorphims2;

public class TestEmployee3 {
	
	// 다형성 적용
	public static void method(Employee e) {
		// Manager만 출력하시오
		
		// instanceof는 내가 원하는 메서드만 뽑아낸다
		if (e instanceof Manager) {
			((Manager) e).b();
		}
	}

	public static void main(String[] args) {
		
		method(new Manager());
		method(new Engineer());
		method(new Engineer());
		method(new Manager());
		method(new Manager());
		
	}
		
}


