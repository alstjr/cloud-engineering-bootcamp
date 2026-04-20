package exam07_array;

public class ArrayTest02_3 {

	public static void main(String[] args) {
		
		// 2차원 배열 ( 비정방형 가능 )
		
		// 1. 배열 선언
		int [][] num;
		
		// 2. 행 생성
		num = new int[3][]; // [행크기][열크기]
		
		// 3. 열 생성
		num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];
		
		//4. 초기화
		num[0][0] = 1;
		
		num[1][0] = 2;
		num[1][1] = 3;
		
		num[2][0] = 4;
		num[2][1] = 5;
		num[2][2] = 6;
		
		// 5. 출력
		
		// 일반 for
		for(int i=0; i<num.length; i++){ // 행반복
			for (int j=0; j < num[i].length; j++){ // 열반복
				System.out.println(num[i][j]);
			}
		 }
		System.out.println("======================");
		// 향상된 for
		for ( int[ ] k : num){ // 행반복
			for (int x : k) { // 열반복
				System.out.println(x);
			}
		}
		
		System.out.println("행의 길이 " + num.length);
		System.out.println("1행에 열의 길이 " + num[0].length);
		System.out.println("2행에 열의 길이 " + num[1].length);
		System.out.println("3행에 열의 길이 " + num[2].length);
		
	}

}
