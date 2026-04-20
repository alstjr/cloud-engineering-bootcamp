package workshop04;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int count = scan.nextInt();
		arr = new int[count];
		int height = 0;
		int max = 0;
		for(int i=0; i<count; i++) {
			System.out.print("사람 " + (i+1) + ": " );
			height = scan.nextInt();
			arr[i] = height;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최댓값은 " + max + "입니다.");
	}
	//결과
//	키의 최댓값을 구합니다.
//	사람 수 : 5
//	사람 1: 175
//	사람 2: 189
//	사람 3: 167
//	사람 4: 170
//	사람 5: 152
//	최댓값은 189입니다.


}
