package exam07_array;

public class ArrayTest_01 {
	public static void main(String[] args) {
		// 정수값 1,2,3 관리하자
		
		// 1. 배열선언
		// 생성 메모리? 로컬변수이기 때문에 stack에 저장
		int[] num;
		// 2. 배열생성
		// 배열이 생성되면서 데이터형에 맞는 값으로 자동초기화
		// 생성 메모리? 힙(heap)영역
		num = new int[3];
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
//		System.out.println(num[3]); //ArrayIndexOutOfBoundsException 에러 발생
		
		// 3. 배열 초기화
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println("배열길이 : " + num.length);
		
		// i값이 인덱스 역할
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] = %d\n",i , num[i]);
		}
		
		// 향상된 for문
		for(int n : num) {
			System.out.println(n);
		}
		
	}

}
