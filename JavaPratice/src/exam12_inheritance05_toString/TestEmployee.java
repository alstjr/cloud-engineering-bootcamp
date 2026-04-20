package exam12_inheritance05_toString;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 2000, "인사");
		Enginner eng = new Enginner("유관순", 1800, "자바");
		
		System.out.println(m.getEmployee()); // 홍길동	2000	인사
		
		// 참조변수 출력
		System.out.println(m); // 홍길동	2000	인사
		System.out.println(m.toString()); // 홍길동	2000	인사
		
		
		//Object의 toString()
		//주소 exam12_inheritance05_toString.Manager@404b9385
	}

}
