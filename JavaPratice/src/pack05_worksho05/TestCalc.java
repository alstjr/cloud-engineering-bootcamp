package pack05_worksho05;

public class TestCalc {

	public static void main(String[] args) {
		int data = Integer.parseInt(args[0]);
		
		if(data>=5 && data <=10) {
			Calc c = new Calc();
			System.out.println("결과 : " + c.calculate(data));
			
			
		}else {
			System.out.println("다시 입력하세요.");
		}
	
		
	}

}
