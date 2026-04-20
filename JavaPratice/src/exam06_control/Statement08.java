package exam06_control;
// break

public class Statement08 {

	public static void main(String[] args) {
		// hello 3번만 출력하고 중지
		
		for(int n = 1; n<6; n++) {
			if(n==4)break;
			System.out.println("Hello" + n);
		}
		System.out.println("END");

	}

}
