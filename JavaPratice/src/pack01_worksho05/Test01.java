package pack01_worksho05;

public class Test01 {

	public static void main(String[] args) {
		Student st = new Student("Kim", 100, 90, 95, 89);
		Student st1 = new Student("Lee", 60, 70, 99, 98);
		Student st2 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println("Kim 평균 " + st.getAvg() + " 학점 : " + st.getGrade());
		System.out.println("Lee 평균 " + st1.getAvg() + " 학점 : " + st1.getGrade());
		System.out.println("Park 평균 " + st2.getAvg() + " 학점 : " + st2.getGrade());
		
	}

}

