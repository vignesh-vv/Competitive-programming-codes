package pkg;

import java.util.Scanner;

public class arraymergewithoutdupe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int size1,size2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Size of arr1:");
		size1 = in.nextInt();
		System.out.println("Size of arr2:");
		size2 = in.nextInt();
		System.out.println("input array1:");
		for(int i=0;i<size1;i++){
			arr1[i]=in.nextInt();
		}
		System.out.println("input array2:");
		for(int i=0;i<size2;i++){
			arr2[i]=in.nextInt();
		}
		
		//logic
		int mergearr[] = new int[30];
		int index=0;
		int i=0,j=0;
		while(i<size1 && j<size2){
			if(arr1[i]<arr2[j]){
				mergearr[index++]=arr1[i++];
			}
			else if(arr1[i]>arr2[j]){
				mergearr[index++]=arr2[j++];
			}
			else{
				i++;
			}
		}
		
		while(i<size1){
			mergearr[index++]=arr1[i++];
		}
		
		while(j<size2){
			mergearr[index++]=arr2[j++];
		}
		
		//display
		for(int k=0;k<index;k++){
			System.out.println(mergearr[k]);
		}
		
	}

}
