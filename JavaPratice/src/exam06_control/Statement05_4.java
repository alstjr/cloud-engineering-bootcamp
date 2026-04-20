package exam06_control;
// for 반복문 문제

public class Statement05_4 {

	public static void main(String[] args) {
		
		// 문제 1: 1~20까지 반복하는데 짝수값만 출력하시오
		
		for(int i=1; i<=20; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
		System.out.println("=================");				
		
		// 문제2 : 1~20까지 반복하는데 3의 배수만 출력하시오
		
		for (int i=1; i<=20; i++) {
			if (i % 3 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("=================");				
		
		// 문제3 : 1~20까지 반복해서 총합을 출력하시오
		int sum = 0;
		for (int i=1; i <= 20; i++) {
			sum +=i;
		}
		System.out.println("1부터20까지의 합 : " + sum);
		
		System.out.println("=================");				

		// 문제4 : 1~20까지 반복해서 짝수값의 총합을 출력하시오
		
		int sum2 = 0;
		for (int i=1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1부터 20까지의 짝수 합 : " + sum2);
		
	}

}
