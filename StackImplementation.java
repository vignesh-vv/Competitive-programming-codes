package pkg;

import java.util.Stack;

public class StackImplementation {

	/**
	 * @param args
	 */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(hammingDistance(100, 45));
	}
	
	public static int hammingDistance(int x, int y) {
		if(x>y){
			int temp = x;
			x = y;
			y = temp;
		}
		
		int countPos = 0;
        Stack<Integer> bin1 = convertToBinary(x);
        Stack<Integer> bin2 = convertToBinary(y);
		
        
        while(!(bin1.size()==bin2.size())){
        	bin1.push(0);
        }
        
        
        while(!bin1.isEmpty() || !bin2.isEmpty()){
        	if(bin1.pop()!= bin2.pop()){
        		countPos++;
        	}
        }
        return countPos;
    }
    
    public static Stack<Integer> convertToBinary(int a){
        Stack<Integer> stack = new Stack<Integer>();
        int rem = 0;
        while(a>0){
            rem = a%2;
            stack.push(rem);
            a /= 2;
        }
		return stack;
    }

}
