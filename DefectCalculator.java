package pkg;

import java.util.Scanner;

public class DefectCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = 0;
		int count = 0;
		int last_digit = 0;
		int a = 0;
		int b = 0;
		while(num1>0 || num2>0){
			a = num1%10;
			b = num2%10;
			last_digit = (a+b)%10;
			sum = (int) (last_digit*Math.pow(10, count) + sum);
			num1 /= 10;
			num2 /= 10;
			count++;
		}
		
		System.out.println(sum);
	}
}
