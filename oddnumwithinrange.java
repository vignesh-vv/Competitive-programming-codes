package pkg;

import java.util.Scanner;

public class oddnumwithinrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low,high;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range");
		low = in.nextInt();
		high = in.nextInt();
		
		for(int i=low;i<high;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

}
