package exam02_variable;

public class VariableTest01 {

	public static void main(String[] args) {
		
		// 변수 선언
		// 저장할 데이터 : 홍길도 20 서울 180.3 67.4 결혼여부
		
		//	1. 변수 선언
		String name;// 4byte 크키 영역 확보
		int age; // 4byte 크키 영역 확보
		String address; // 4byte 크키 영역 확보
		float height; // 4byte 크키 영역 확보
		double weight; // 8byte 크키 영역 확보
		boolean isMarried; // 1byte 크키 영역 확보
		
		// 2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		height = 180.3F; // 4byte 크기 = 8byte값 따라서 180.3F가 된다
		weight = 67.4;
		isMarried = false;
		
		// 3. 변수 사용
		// 출력 포맷 : 이름: 홍길동
		System.out.println("이름 : " + name); // 문자열 연결
		System.out.printf("이름 : %s \n" , name); // 문자열 연결
		System.out.printf("나이 : %d \n" , age);  
		System.out.printf("주소 : %s \n" , address); 
		System.out.printf("몸무게 : %.2f \n" , height); 
		System.out.printf("키 : %.2f \n" , weight); 
		System.out.printf("결혼? : %b \n" , isMarried); 
		
		// 4. 변수 변경
		age = age + 1;
		System.out.printf("내년 나이 : %d \n" , age);
	}

}
