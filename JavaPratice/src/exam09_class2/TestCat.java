package exam09_class2;

public class TestCat {

	public static void main(String[] args) {
		// 모든 데이터 알고 있는 경우
		Cat c1 = new Cat("야옹이", 2, "암컷");
		
		// gender를 모르는 경우
		Cat c2 = new Cat("야옹이2", 2);
		
		// 이름만 아는 경우
		Cat c3 = new Cat("야옹이3");
		
		// 모든 정보를 모르는 경우
		Cat c4 = new Cat();
		
//		c1.name = "야옹이";
//		c1.age = 2; // 문법적으로 문제없음. 논리적으로 문제 있음
//		c1.gender = "암컷";
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		
		
	}

}
