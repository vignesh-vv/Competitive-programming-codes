package pkg;

import java.util.Scanner;

public class Reverseonlyvowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input string:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char ch[] = input.toCharArray();
		int length = ch.length;
		int i=0,j=length-1;
		while(i<length && i<j){
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				while(j>0 && j>i){
					char tmp;
					if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U'){
						tmp=ch[i];
						ch[i]=ch[j];
						ch[j]=tmp;
						j--;
						break;
					}
					j--;
				}
			}
			i++;
		}
		System.out.println("Output:");
		for(int k=0;k<length;k++){
			System.out.print(ch[k]);
		}
	}

}
