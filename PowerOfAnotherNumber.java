package pkg;

import java.util.Scanner;

public class PowerOfAnotherNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0){
	        long x = in.nextLong();
	        long y = in.nextLong();
	        
	        int i=0;
	        long pow = 1;
	        if(x!=0 && x!=1){
	            while(pow<y){
	                pow = (long)Math.pow(x,i);
	                i++;
	            }
	            if(pow==y)
	                System.out.println(1);
	        }
	        else{
	            if(x==0 && y==0)
	                System.out.println(1);
	            else if(x==1 && y==1)
	                System.out.println(1);
	            else
	                System.out.println(0);
	        }
	        
	    }
	}

}
