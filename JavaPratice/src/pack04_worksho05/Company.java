package pack04_worksho05;

public class Company {
	private double salary;
	private double income;
	private double agterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}

	public Company(double salary) {
		this.salary = salary;
	}
	
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		
		for(int i=1; i<=12; i++) {
			income += salary;
		}
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getAgterTaxIncome() {
		
		double tax = income*0.1;
		
		agterTaxIncome = income - tax;
		return agterTaxIncome;
	}

	public void setAgterTaxIncome(double agterTaxIncome) {
		this.agterTaxIncome = agterTaxIncome;
	}

	public double getBonus() {
		
		for(int i = 1; i<=12; i++ ) {
			if (i % 3 == 0) {
				bonus += salary * 0.2;
			}
		}
		
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		
		double TaxBonus = bonus * 0.055;
		afterTaxBonus = bonus - TaxBonus;
		
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	
	
	
}
