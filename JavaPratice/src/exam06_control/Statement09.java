package exam06_control;
// continue

public class Statement09 {

	public static void main(String[] args) {
		
		for(int n = 1; n<6; n++) {
			
			System.out.println("Hello" + n);
			if(n==3) continue;
			System.out.println("world" + n);
			System.out.println("happy" + n);
		}
		System.out.println("END");

	}

}
