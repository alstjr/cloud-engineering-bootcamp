package exam12_inheritance04_overriding;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 2000, "인사");
		Enginner eng = new Enginner("유관순", 1800, "자바");
		
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
		
		// 수정 : 원래는 setter 메서드 이용
		m.salary = 3000;
		// 조회: 원래는 getter 메서드 이용
		System.out.println(m.name + "\t" + m.salary + "\t" + m.depart);
	}

}
