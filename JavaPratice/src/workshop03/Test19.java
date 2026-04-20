package workshop03;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오른쪽 아래가 직각인 삼각형");
		System.out.print("몇 단 삼각형 입니까? : ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}

	}

}
