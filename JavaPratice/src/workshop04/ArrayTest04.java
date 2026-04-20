package workshop04;

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int i = arr.length-1;
		while(0<=i) {
			System.out.print(arr[i] + " ");
			i--;
		}
		
		// 결과
//		100 90 80 70 60 50 40 30 20 10 
		
		// 다른 방법
//		for(int i = 0; i < 10; i++) {
//			System.out.print( arr[arr.length-1-i] + " ");
//			}

	}

}
