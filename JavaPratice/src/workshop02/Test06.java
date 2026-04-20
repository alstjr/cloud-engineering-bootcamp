package workshop02;

public class Test06 {
	public static void main(String[] args) {
		int i = 5;
		String result = (i%2 == 0)?"숫자 " + i +"는 짝수입니다.":"숫자 " + i + "는 홀수 입니다.";
		System.out.println("선언 변수 " + i + "일때 결과 : \n" + result );
	}

}
