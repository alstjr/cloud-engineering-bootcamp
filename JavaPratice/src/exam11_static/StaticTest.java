package exam11_static;

class Test{
	int num = 10;	// 인스턴스 변수
	static int size = 20; // static 변수
	
	public void print_num() { // 일반 메서드
		System.out.println(num);
		System.out.println(size);
	}
	public static void print_size() { // static 메서드
		System.out.println(size);
//		System.out.println(num);
//		System.out.println(this);
	}
	// 생성자
	public Test() { }
}// end test

public class StaticTest {

	public static void main(String[] args) {
		
		System.out.println(Test.size);
		Test.print_size();
		
		//new
		Test t = new Test();
		System.out.println(t.num);
		t.print_num();

	}

}
