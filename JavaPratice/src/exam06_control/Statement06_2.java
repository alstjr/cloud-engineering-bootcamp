package exam06_control;
// while 반복문
import java.util.Scanner;

public class Statement06_2 {

public static void main(String[] args) {
		
		// 무한루프 ( 언제든지 빠져나올 수 있는 로직 제공)
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("=================");
			System.out.println("1. 이름입력");
			System.out.println("2. 나이입력");
			System.out.println("3. Quit");
			System.out.println("=================");
			int num = scan.nextInt();
			if(num ==1) {
				String name = scan.next();
				System.out.println("이름 : " + name);
			}else if(num==2) {
				int age = scan.nextInt();
				System.out.println("나이 : " + age);
			}else {
				System.out.println("프로그램 종료");
				scan.close();
				System.exit(0);
			}// end if
		}// end while
	}// end main

}// end class
