package workshop03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값:");
		int a = scan.nextInt();
		System.out.print("b 값:");
		int b = scan.nextInt();
		System.out.print("c 값:");
		int c = scan.nextInt();
		int max = 0;
		if(a > b) {
			if(a > c) {
				max = a;
			}else if (c < a) {
				max = c;
			}
		}else if (b > a) {
			if (b > c) {
				max = b;
			}else if (c>b)max = c;
		}
		System.out.println("최대값 : " + max);
	}

}
