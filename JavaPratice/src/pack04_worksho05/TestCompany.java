package pack04_worksho05;

public class TestCompany {

	public static void main(String[] args) {
		// eclipse Argument 월 기본급 입력 받기
		double salary = Double.parseDouble(args[0]);
		
		Company cp = new Company(salary);
		System.out.println("연 기본급 합 : " + cp.getIncome() + " 세후 : "  + cp.getAgterTaxIncome());
		System.out.println("연 보너스 합 : " + cp.getBonus() + " 세후 : "  + cp.getAfterTaxBonus());
		double sum=  cp.getAgterTaxIncome() + cp.getAfterTaxBonus();
		System.out.println("연 지급액 합 : " + sum);
	}

}

