package exam06_control;
// 중첩반복문

public class Statement10 {

	public static void main(String[] args) {
		
		// 구구단 출력
		for(int dan=2; dan<=9; dan++) {
		for(int n=1; n <= 9; n++) {
			System.out.printf("%d * %d = %d \n",dan, n, (dan*n));				
		}
	}

}

}
