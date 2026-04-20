package workshop03;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("양의 정수값의 자릿수 구하기");
		do {
			System.out.print("정수값");
			n = scan.nextInt();
		}while(n<0); 
		
		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");

	}

}
