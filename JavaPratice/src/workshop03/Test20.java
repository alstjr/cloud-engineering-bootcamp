package workshop03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double bonus = 1;
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		int time = scan.nextInt();
		System.out.print("월급입력 : ");
		int money = scan.nextInt();
		System.out.println("=========");
		if(time >= 25)  bonus = money*1;
		else if(time >=20) bonus = money*0.8;
		else if(time >=18) bonus = money*0.5;
		else bonus = money*0;
		System.out.println("보너스 : " + (int)bonus );
		System.out.println("지급될 급여 : " + (int)(money + bonus));
		
		
	}

}
