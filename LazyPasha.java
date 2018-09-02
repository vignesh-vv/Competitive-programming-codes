package pkg;
import java.util.*;
import java.lang.*;
import java.io.*;

class LazyPasha{
	public static void main (String[] args){
	    //code
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0){
	        int n = in.nextInt();
	        int q = in.nextInt();
	        in.nextLine();
	        String str = in.nextLine();
	        char[] chstr = str.toCharArray();
	        int type;
	        int k=0;
	        int I=0;
	        char[] ch = new char[n];
	        for(int i=0;i<q;i++){
	        	type = in.nextInt();
	        	if(type==1){
	        		k = in.nextInt();
	        		ch = rotateArray(chstr,n,k);
	        	}
	        	if(type==2)
	        		I = in.nextInt();
	        		System.out.println(ch[I]);
	        }
	    }
	 }

	public static char[] rotateArray(char[] a, int n, int k) {
		// TODO Auto-generated method stub
		char c;
		k = k%n;
		for(int i=n-1;i>=n-k;i--){
			int j;
			c = a[i];
			for(j=n-1;j>0;j--){
				a[j] = a[j-1];
			}
			a[j] = c;
		}
		return a;
	}
}