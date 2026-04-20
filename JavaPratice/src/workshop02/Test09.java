package workshop02;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요");
		int num = scan.nextInt();
		System.out.println("2. 정수 입력하세요");
		int num2 = scan.nextInt();
		int max = (num > num2)? num:num2;
		System.out.printf("정수 %d과 정수 %d중에서 최대값: %d",num,num2,max);
		
		scan.close();


	}

}
