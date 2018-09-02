package pkg;

import java.util.Scanner;

public class maxminsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int size;
		
		Scanner in = new Scanner(System.in);
		System.out.println("size of array:");
		size = in.nextInt();
		
		System.out.println("input array:");
		for(int i=0;i<size;i++){
			arr[i]= in.nextInt();
		}
		
		//logical coding
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int temparr[] = new int[10];
		int index=0;
		int j=0;
		for(int i=size-1;i>=0 && j<size;i--,j++){
			if(i<j){
				break;
			}
			else if(i==j){
				temparr[index]=arr[i];
			}
			else{
			temparr[index]=arr[i];
			index++;
			temparr[index]=arr[j];
			index++;
			}
		}
		
		for(int i=0;i<size;i++){
			arr[i]=temparr[i];
		}
		
		//display
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}

	
}
