package workshop03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int n = scan.nextInt();
		int sum = 0;
		double d = 0;
		for (int i=1; i<=n; i++) {
			if(i%2==0) {
				sum += i;
				d++;
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균값 : " + (sum/d));

	}

}
