package exam12_inheritance06_Polymorphims;

public class TestEmployee2 {

	public static void main(String[] args) {
		
		// 다형성이 적용 안된 방식
		Manager m = new Manager("홍길동", 2000, "인사");
		Enginner eng = new Enginner("유관순", 1800, "자바");
		
		
		System.out.println(m); // 홍길동	2000	인사
		System.out.println(eng); // Enginner [skill=자바, name=유관순, salary=1800]

		
	}

}
