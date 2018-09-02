package pkg;

public class FlippingImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,1,0,1},
					 {1,0,1,0},
					 {0,0,0,1}};
		a = flipAndInvertImage(a);
		for(int[] x: a){
			for(int i: x)
				System.out.print(i+" ");
			System.out.println();
		}
	}
	
	public static int[][] flipAndInvertImage(int[][] A) {
		for(int[] innerArray : A){
			int start = 0;
			int end = innerArray.length-1;
			while(start<=end){
				int temp = innerArray[start]^1;
				innerArray[start] = innerArray[end]^1;
				innerArray[end] = temp;
				start++;
				end--;
			}
		}
		return A;
    }

}
