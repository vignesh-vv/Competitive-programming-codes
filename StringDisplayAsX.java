package pkg;

import java.util.Scanner;

public class StringDisplayAsX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input string:");
		s = in.nextLine();
		char str[] = s.toCharArray();
		int length = str.length;
		
		int front=0,rear=length-1;
		int numberOfSpaces = length-2;
		int leftSpaces=0;
		while(front<length && rear>=0){
			if(length%2!=0){
				if(front<rear){
					blankSpaces(leftSpaces);
					System.out.print(str[front++]);
					blankSpaces(numberOfSpaces);
					System.out.println(str[rear--]);
					leftSpaces++;
					numberOfSpaces-=2;
				}
				else if(front==rear){
					blankSpaces(leftSpaces);
					System.out.println(str[front++]);
					rear--;
					leftSpaces--;
				}
				else{
					blankSpaces(leftSpaces);
					System.out.print(str[rear--]);
					blankSpaces(numberOfSpaces);
					System.out.println(str[front++]);
					leftSpaces--;
					numberOfSpaces+=2;
				}
			
				if(numberOfSpaces<0)
					numberOfSpaces=-(numberOfSpaces);
			}
			else{
				System.out.println("Enter string of odd length!!");
				break;
				}
		}
		
	}
	
	public static void blankSpaces(int num){
		for(int i=0;i<num;i++){
			System.out.print(" ");
		}
	}

	

}
