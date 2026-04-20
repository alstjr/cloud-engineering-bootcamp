package exam12_inheritance06_Polymorphims2;

public class TestEmployee2 {

	public static void main(String[] args) {
		
		Employee[] e = { new Engineer(),
						new Manager(),
						new Engineer(),
						new Engineer(),
						new Manager() };
		
		// Engineer 만 추출해서 c 호출하자.
		for( Employee emp : e ) {
			
			if (emp instanceof Engineer) {
				// emp.c();
		
				Engineer eng = (Engineer)emp;
				eng.c();
				
				//한꺼번에
				((Engineer)emp).c();
			}
		}
		
	}
		
}


