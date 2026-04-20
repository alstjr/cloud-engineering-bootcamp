package workshop03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("2자리 정수를 입력하세요");
		do {
			System.out.print("입력");
			n = scan.nextInt();
		}while(n<10 || n> 99);
		System.out.println("입력값은 " + n);
	}

}
