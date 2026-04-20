package exam01_basic;

public class PDT03_char {
	public static void main(String[] args) {
		
		// char
		System.out.println('남');
		System.out.println('여');
		//System.out.println('여자'); 홀따옴표는 한글자 여러글자 에러
		System.out.println("여자"); // 여러 글자 ( 문자열 )는 "" 사용, String 클래스가 관리
		System.out.println("================================");
		
		// escape 문자
		System.out.println("안녕하세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\'하세요");
		System.out.println("안녕\\하세요");
		System.out.println("c:\\apm");
	}

}
