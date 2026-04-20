package exam02_variable;
// 변수선언03_인스턴스변수
public class VariableTest03 {
	
	int size = 20; //인스턴스 변수

	public static void main(String[] args) {
		
		//로컬변수
		int num = 10;
		System.out.println(num); // 스택에 저장된 num 출력
		
		//인스턴스 변수
		
		//System.out.println(size); // 객체생성 전이기 때문에 사용불가
		
		VariableTest03 t = new VariableTest03();
		
		System.out.println(t.size); // 객체생성 후이기 때문에 사용가능
	}

}
