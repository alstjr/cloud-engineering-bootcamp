package exam12_inheritance01;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 2000, "인사");
		Enginner eng = new Enginner("유관순", 1800, "자바");
		
		System.out.println(m.getManager());
		System.out.println(eng.getEnginner());
	}

}
