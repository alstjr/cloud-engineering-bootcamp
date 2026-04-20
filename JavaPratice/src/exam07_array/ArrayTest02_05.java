package exam07_array;

public class ArrayTest02_05 {

	public static void main(String[] args) {
		
		// 2차원 배열 ( new + 리터럴 )
		
		// 정방형
		int [][] num = new int[][]{ {1, 2}, {3, 4} };
		
		for ( int[ ] k : num){ // 행반복
			for (int x : k) { // 열반복
				System.out.println(x);
			}
		}
				
		}

}
