package pkg;

import java.util.Scanner;

public class PatternPrinting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder str = new StringBuilder();
		char ch = 'A';
		for(int i=0;i<(2*n-1);i++){
			if(i<n-1)
				str.append(ch++);
			if(i==(n-1))
				str.append(ch);
			if(i>n-1)
				str.append(--ch);
		}
		
		//System.out.println(str);
		
		int x = n-1;
		int y = n-1;
		for(int i=0; i<n; i++){
			int space = 2*i-1;
			if(space<0) space = 0;
			if(i==0)
				System.out.println(str);
			else{
				y++;
				System.out.print(str.substring(0,x));
				while(space-->0)
					System.out.print(" ");
				System.out.println(str.substring(y));
				x--;
			}
		}
		
		/*int x = n;
		
		int spaces = 0;
		for(int k=0; k<n; k++){
			spaces = 2*k-1;
			if(spaces<0)	
				spaces = 0;
			
			for(int i=0; i<(2*n-1); i++){	
				if(i<(n-k))
					str.append(ch++);
				else if(i>=(n+k))
					str.append(--ch);
				else{
					
				}
			}
			System.out.println(str);
			str.delete(0, str.length());
		}*/
	}

}
