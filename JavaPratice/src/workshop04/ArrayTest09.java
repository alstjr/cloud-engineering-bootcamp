package workshop04;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr3 = new int[5];
		int sum = 0;
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = ran.nextInt(10)+1;
			System.out.print(arr3[i]+" ");
			
		}
		System.out.println();
		for (int i=0; i<arr3.length; i++) {
			sum+=arr3[i];
		}
		System.out.println("sum="+sum);
		System.out.println("avg=" + ((double)sum)/(double)arr3.length);
	}
// 결과
//	6 8 7 8 4 
//	sum=33
//	avg=6.6
}
