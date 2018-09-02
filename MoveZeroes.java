package pkg;

public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,0,0,3,12};
		int[] array2 = {1,0};
		moveZeroes(array);
		for(int i:array)
			System.out.print(i+" ");
	}

/*	My Solution
 * 
 * private static void moveZeroes(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=nums.length-1;i>=0;i--){
			int index=0;
			if(nums[i]==0){
				index = i;
				int j = i+1;
				while(j<nums.length && nums[j]!=0){
					nums[index] = nums[j];
					j++;
					index++;
				}
				if(index!=0)
					nums[index] = 0;
			}
		}
	}
*/
	
// Efficient Solution
	private static void moveZeroes(int[] nums){
		int index=0;
		for(int i=0;i<nums.length;i++){
			/*if(i==index)
				index++;
			*/
			if(nums[i]!=0){
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index++;
			}
		}
	}
}
