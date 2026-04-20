package workshop03;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오른쪽 아래가 직각인 삼각형");
		System.out.print("몇 단 삼각형 입니까? : ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++)
				System.out.print(' ');
			for (int j=1; j<= i; j++) 
				System.out.print("*");
			
			System.out.println();
		}
	
	}

}
