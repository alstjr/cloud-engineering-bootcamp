package exam06_control;
// while 반복문

public class Statement06 {

	public static void main(String[] args) {
		// hello 문자열 5번 출력
		
		for(int n = 1; n<6; n++) {
			System.out.println("Hello" + n);
		}
		System.out.println("====================");
		
		int n2=1;
		// ....
		while(n2 <= 5) {
			System.out.println("world" + n2);
			// .......
			n2++;
		}

	}

}
