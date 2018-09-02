package pkg;

import java.util.Scanner;

public class Alternatesortoddevenpos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[20];
		int size;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		size = in.nextInt();
		System.out.println("Array:");
		for(int i=0;i<size;i++){
			array[i]=in.nextInt();
		}
		
		//logic
		
		for(int i=0;i<size;i++){
			if(i%2==0){
				for(int j=i+2;j<size;j+=2){
					if(array[j]>array[i])
						swap(array,i,j);
				}
			}
			else{
				for(int j=i+2;j<size;j+=2){
					if(array[j]<array[i])
						swap(array,i,j);
				}
			}
		}
		
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
