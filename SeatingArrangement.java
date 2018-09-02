package pkg;

import java.util.*;

public class SeatingArrangement {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int N;
		int[] a = new int[T];
		for(int x=0;x<T;x++){
			N = in.nextInt();
			a[x] = N;
		}
		
		for(int y=0;y<T;y++){
			int n = a[y];
			int cabin_seat = n%12;
			int div = cabin_seat/6;
			int rem = cabin_seat%3;
			char ch;
			if(div<1 || ((div==1)&&(rem==0))){
				ch = 'l';
			}
			else{
				ch = 'r';
			}
			int seat;
			if(ch=='l'){
				seat = cabin_seat+
			}
		}
	}
}
