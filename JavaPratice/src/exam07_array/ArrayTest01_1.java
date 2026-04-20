package exam07_array;

public class ArrayTest01_1 {

	public static void main(String[] args) {
		
		// 이름을 배열로 관리 : 홍길동, 이순신, 유관순 관리하자
		
		String[] name;
		name = new String[3];
		name[0] = "홍길동";
		name[1] = "이순신";
		name[2] = "유관순";
		
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("name[%d] : %s\n",i ,name[i]);
		}
		
		//향상된 for문
		for(String n: name) {
			System.out.println(n);
		}
	}

}
