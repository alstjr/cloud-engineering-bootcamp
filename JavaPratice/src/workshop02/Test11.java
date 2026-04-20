package workshop02;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요");
		int num = scan.nextInt();
		System.out.println("2. 정수 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("3. 정수 입력하세요");
		int num3 = scan.nextInt();
		
		int max = (num>num2)?((num>num3)?num:num3):(num2>num3)?num2:num3;
			
		System.out.printf("정수 %d 과 정수 %d, 정수 %d 중에서 최대값 : %d", num,num2,num3,max);
		
		scan.close();
	}

}
