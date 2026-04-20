package pack03_worksho05;

public class TestAccount {

	public static void main(String[] args) {

		Account ac = new Account("441-0290-1203", 500000, 7.3);
		System.out.println("계좌 정보 : " + ac.getAccount()  + " 현재잔액 : " + ac.getBalance());		
		ac.withdraw(600000);
		ac.deposit(20000);
		System.out.println("계좌 정보 : " + ac.getAccount()  + " 현재잔액 : " + ac.getBalance());
		System.out.println("이자 : " + ac.calculateInteres());
	
	
	
	
	
	
	}

}
