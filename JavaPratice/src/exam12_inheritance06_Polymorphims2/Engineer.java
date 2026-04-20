package exam12_inheritance06_Polymorphims2;

// 관리자
//Manager is a Employee (상속관계)
public class Engineer extends Employee {
	

	@Override
	public void a() {
		System.out.println("Engineer a()");
	}
	
	public void c() {
		System.out.println("Engineer c()");
	}

}
