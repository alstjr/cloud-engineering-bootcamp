package exam11_static;

class Count{
	
	int num;
	static int count;
	public Count() {
		num++;
		count++;
	}
	
}

public class StaticTest2 {

	public static void main(String[] args) {
		
		System.out.println(Count.count);
		
		// Count를 객체생성 시 생성 횟수를 카운트하자
		Count c1 = new Count();
		System.out.println(Count.count);
//		System.out.println(c1.num);
		Count c2 = new Count();
		System.out.println(Count.count);
//		System.out.println(c2.num);
	}
}
