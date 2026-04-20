package exam06_control;

public class Statement04_2 {

	public static void main(String[] args) {
		int num=100;

		switch(num) {
		
		case 5: {
			int n = 200;
			System.out.println("5"); break;
		}
		case 10: {
			System.out.println("10"); break;
		}
		case 15: {
			System.out.println("15"); break;
		}
		case 20: {
			System.out.println("20"); break;
		}
		default: System.out.println("default");
		}// end switch
		
		// switch expression
		int n = 10;
		int result = switch(n) {
		
		case 10 -> 100;
		case 20 -> 200;
		default -> 0;
		};
		System.out.println(result);
		
	}

}
