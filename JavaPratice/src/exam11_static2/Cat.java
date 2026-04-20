package exam11_static2;

public class Cat {
	
	private String name;
	private int age;
	private String gender;
	
	public Cat() {}

	// 생성자에서 검증 set 메서드에서 검증이 중복되고 조건도 중복되면 한번만 사용한다.
	
	public Cat(String name, int age, String gender) {
		this.name = name;
		
		//age 검증
		//if(age >20) {
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 입력 오류발생");
		}else {
			this.age = age;	
		}
		this.gender = gender;
	}
	
	// 필요시 메서드 추가
	// age 검증하는 메서드		
//	private boolean ageValidCheck(int age) {
//		boolean result = false;
//		// 조건체크
//		if(age >= 20) result = true;
//		return result;
//	}
//		
//	private boolean ageValidCheck2(int age) {
//		// 조건체크
//		if(age >= 20) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// age 검증
		//if(age >20) {
		
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 입력 오류발생");
		}else {
			this.age = age;	
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 리턴타입 있는 메서드는 변수를 하나 만들고 변수를 리턴하는 형태
	
	

}
