package pkg;

public class MultiplesOf3And5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfMult(1000);
	}

	private static void sumOfMult(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=3; i<n; i++){
			if(i%3 == 0 || i%5==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
