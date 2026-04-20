package exam06_control;
// 다중 if
import java.util.Scanner;
public class Statement03 {

	public static void main(String[] args) {
		//Scanner 점수를 입력 받아서 학점을 출력하시오
		/*
		 *	점수		학점 
		 *  -------------
		 * 90~100	A
		 * 80~89	B
		 * 70~79	C
		 * 0~69		F
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
			
		if(score>=90 && score<=100) {
			System.out.println("A 학점");
		}else if (score>=80 && score<=89) {
			System.out.println("B 학점");
		}else if (score>=70 && score<=79) {
			System.out.println("C 학점");
		}else {
			System.out.println("F 학점");
		}
		
		scan.close();
		
	}

}
