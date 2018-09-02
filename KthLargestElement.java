package pkg;

public class KthLargestElement {

	public int findKthLargest(int[] nums, int k) {
        int[] array = quickSort(nums, 0, nums.length-1);
/*        for(int i:array)
         	System.out.print(i+" ");
*/		return array[k-1];        
    }
    
    private static int[] quickSort(int[] a, int left, int right){
        if(left<right){
            int pivotindex = (left+right)/2;
            int pivot = a[pivotindex];
            int index = partition(a, left, right, pivot);
            quickSort(a, left, index-1);
            quickSort(a, index, right);
        }
        return a;
    }
    
    private static int partition(int[] a, int left, int right, int pivot){
        while(left<=right){
            while(a[left]>pivot)    
                left++;
            while(a[right]<pivot)
                right--;
            
            if(left<=right){
                swap(a, left, right);
            	left++;
            	right--;
            }
        }
        return left;
    }
    
    private static void swap(int[] a, int left,int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2,4,5,2,1,3};
		KthLargestElement obj = new KthLargestElement();
		System.out.println(obj.findKthLargest(nums, 2));
	}

}
