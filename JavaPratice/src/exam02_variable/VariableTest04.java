package exam02_variable;
// 변수선언03_인스턴스변수
public class VariableTest04 {
	
	int num; //인스턴스 변수, heap 메모리

	public static void main(String[] args) {
		
		// 변수명 중복불가
		int num = 10;
//		int num = 20;
//		long num = 20;
		
		// 로컬변수는 사용전에 반드시 초기화
		int size;
//		System.out.println(size);
		
		// 블럭 scope: 블럭내에서 선언된 변수는 불럭 밖에서 사용 불가
		{
			int age = 20;
			System.out.println(age);
		}
//		System.out.println(age);// 블럭 밖에서는 사용불가
	
	} // main 메서드 블럭

}// 클래스 블럭
