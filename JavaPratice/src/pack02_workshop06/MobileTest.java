package pack02_workshop06;

public class MobileTest {

	public static void main(String[] args) {

		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println(ltab.getMobileName() + "\t\t" + ltab.getBatterySize() + "\t\t" + ltab.getOsType());
		System.out.println(otab.getMobileName() + "\t\t" + otab.getBatterySize() + "\t\t" + otab.getOsType());
		
		System.out.println("10분 충전");
		System.out.println("-----------------------------------");
		ltab.charge(10);
		otab.charge(10);
		System.out.println(ltab.getMobileName() + "\t\t" + ltab.getBatterySize() + "\t\t" + ltab.getOsType());
		System.out.println(otab.getMobileName() + "\t\t" + otab.getBatterySize() + "\t\t" + otab.getOsType());

		
		System.out.println("5분 통화");
		System.out.println("-----------------------------------");
		ltab.operate(5);
		otab.operate(5);
		System.out.println(ltab.getMobileName() + "\t\t" + ltab.getBatterySize() + "\t\t" + ltab.getOsType());
		System.out.println(otab.getMobileName() + "\t\t" + otab.getBatterySize() + "\t\t" + otab.getOsType());

	
	
	
	
	}

}
