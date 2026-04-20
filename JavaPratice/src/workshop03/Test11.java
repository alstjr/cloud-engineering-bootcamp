package workshop03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.print("a의 값: ");
			a = scan.nextInt();
			System.out.print("b의 값: ");
			b = scan.nextInt();
		}while(b>a); {
			System.out.println("a보다 큰 값을 입력하세요");
			System.out.print("b의 값: ");
			b = scan.nextInt();
		}
		System.out.println("b-a는 " + (b-a) + "입니다" );
	}

}
