package exam04_Operator;
//대입연산자

public class Operator02 {

	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 3;
		
		n+=n2; //n = n + n2 동일
		System.out.println(n+"\t"+n2);
		n-=n2; //n = n - n2 동일
		System.out.println(n+"\t"+n2);
		n*=n2; //n = n * n2 동일
		System.out.println(n+"\t"+n2);
		n/=n2; //n = n / n2 동일
		System.out.println(n+"\t"+n2);
		n%=n2; //n = n % n2 동일
		System.out.println(n+"\t"+n2);

	}

}
