package pkg;

import java.util.Scanner;

public class RepeatCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		char s[] = str.toCharArray();
		int repeat;
		char ch;
		for(int i=0;i<s.length;){
			ch=s[i];
			i++;
			repeat=0;
			while(i<s.length && s[i]>='0' && s[i]<='9'){
				if(repeat==0){
					repeat=(int)(s[i]-'0');
				}
				else{
					repeat=10*repeat+(int)(s[i]-'0');
				}
				i++;
			}
			while(repeat>0){
				System.out.print(ch);
				repeat--;
			}
		}
	}

}
