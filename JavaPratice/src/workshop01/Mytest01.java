package workshop01;

public class Mytest01 {

	public static void main(String[] args) {
		//변수 선언및 초기화
		String name = "홍길동";
		int age = 20;
		String adress = "서울";
		
		System.out.println("1. println 사용");
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age + " 이고 주소는 " + adress);
		
		System.out.println("2. print 사용");
		System.out.print("이름은 " + name + "\n");
		System.out.print("나이는 " + age + " 이고 주소는 " + adress + "\n");
		
		System.out.println("3.printf 사용");
		System.out.printf("이름은 %s \n", name);
		System.out.printf("나이는 %d 이고 주소는 %s",age, adress);
		
	}

}
