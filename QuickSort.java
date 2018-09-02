package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    
    public static void quickSort(int[] arr, int left, int right){
        if(left<right){
            int pivot_index = (left+right)/2;
            int pivot = arr[pivot_index];
            int index = partition(arr, left, right, pivot);
            quickSort(arr, left, index-1);
            quickSort(arr, index, right);
        }
    }
    
    public static int partition(int[] arr, int left, int right, int pivot){
        while(left<=right){
            while(arr[left]<pivot)
                left++;
            while(arr[right]>pivot)
                right--;
            if(left<=right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
	public static void main (String[] args)
	 {
	 //code
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0){
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = in.nextInt();
	        
	        quickSort(arr);
	        
	        for(int i : arr)
	            System.out.print(i+" ");
	    }
	    
	    System.out.println();
	 }
}
