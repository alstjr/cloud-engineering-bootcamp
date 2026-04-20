package pack06_worksho05;

public class StudentTest {

	public static void main(String[] args) {

		Student  studentArray[] = new Student[3];
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
		System.out.println(studentArray[0].getName() + studentArray[0].getAge() + studentArray[0].getHeight() + studentArray[0].getWeight());
		System.out.println(studentArray[1].getName() + studentArray[1].getAge() + studentArray[1].getHeight() + studentArray[1].getWeight());
		System.out.println(studentArray[2].getName() + studentArray[2].getAge() + studentArray[2].getHeight() + studentArray[2].getWeight());
		
		double avgAge =(double) (studentArray[0].getAge()+studentArray[1].getAge()+studentArray[2].getAge())/3;
		double avgHeight = (double)(studentArray[0].getHeight()+studentArray[1].getHeight()+studentArray[2].getHeight())/3;
		double avgWeight = (double)(studentArray[0].getWeight()+studentArray[1].getWeight()+studentArray[2].getWeight())/3;
		System.out.printf("나이의 평균 :  %.2f \n", avgAge);
		System.out.printf("신장의 평균 :  %.2f \n", avgHeight);
		System.out.printf("몸무게의 평균 :  %.2f", avgWeight);
		
		// 반복문으로 배열 안에 값 총합 구하고 값 표현
//		for (int i = 0; i < studentArray.length; i++) {
//			totalAge += studentArray[i].getAge();
//			totalHeight += studentArray[i].getHeight();
//			totalWeight += studentArray[i].getWeight();
//			System.out.println(studentArray[i].getName() + " \t " + studentArray[i].getAge() + " \t "
//					+ studentArray[i].getHeight() + " \t " + studentArray[i].getWeight());
//		}
	}

}
