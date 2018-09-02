package pkg;

import java.util.Scanner;

public class Checkifsumofprimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = in.nextInt();
		int primes[] = new int[num];
		
		//listing prime numbers within that range
		int index=num-2;
		int factor;
		int i=0;
		while(index>1){
			factor=2;
			while(index%factor!=0 && factor<index){
				factor++;
			}
			if(factor==index){
				primes[i++]=index;
			}
			index--;
		}
		
		int j=0;
		while(j<i){
			System.out.print(primes[j]+" ");
			j++;
		}
		
		//checking for sum of primes
		boolean flag=false;
		for(int x=0;x<i;x++){
			for(int y=x+1;y<i;y++){
				if(primes[x]+primes[y]==num){
					flag=true;
					System.out.println(primes[x] +"," +primes[y]);
					break;
				}
			}
		}
		
		System.out.println(flag);
	}
}


