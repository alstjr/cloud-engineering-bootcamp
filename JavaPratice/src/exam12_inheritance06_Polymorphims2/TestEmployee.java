package exam12_inheritance06_Polymorphims2;

public class TestEmployee {

	public static void main(String[] args) {
		
		// 다형성을 적용 안한 경우
		Manager m = new Manager();
		Employee em = new Employee();
		
		// 다형성
		Employee e = new Manager();
		e.a(); // 동적 타이핑 발생 컴파일 일때는 Employee를 인식하다가 실행할 때는 Manager a()를 인식
		//e.b();
		Manager m1 = (Manager)e;
		m1.b();
		System.out.println(m1.name);
		

		
	}

}
