package exam07_array;

public class ArrayTest02_4 {

	public static void main(String[] args) {
		
		// 2차원 배열 ( 리터럴 )
		
		// 정방형
		int [][] num = { {1, 2}, {3, 4} };
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		
		// 출력
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
		System.out.println("======================");
		
		// 비정방형
		int [][] num2 = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		
		for ( int[ ] k : num2){ // 행반복
			for (int x : k) { // 열반복
				System.out.println(x);
			}
		}
				
				
				
				
				
		}

}
