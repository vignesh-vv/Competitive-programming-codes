package pkg;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FourElements {
		public static void main (String[] args)
		 {
		 //code
		    Scanner in = new Scanner(System.in);
		    int t = in.nextInt();
		    while(t-->0){
	            int n = in.nextInt();
	            int[] a = new int[n];
		        for(int i=0;i<n;i++)
		        	a[i] = in.nextInt();
		        int number = in.nextInt();
		        
		        boolean flag = false;
		        int f = 0;
		        while(f<n){
		        	int sum = a[f];
		        	while()
		        	if(sum==number){
		        		System.out.println("1");
		        		flag = true;
		        		break;
		        	}
		        	f++;
		        }
		        if(!flag)
		        	System.out.println("0");
	        }
		 }
}

