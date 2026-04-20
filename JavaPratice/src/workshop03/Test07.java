package workshop03;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%n == 0) {
				sum +=n;
				if(i!=n) System.out.print("+");
				System.out.print(i);
			}
		}
		System.out.println(" = " + sum);
		scan.close();
	}

}
