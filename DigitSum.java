package pkg;

import java.util.*;
import java.io.*;
import java.lang.*;
class DigitSum
{
    // Driver Code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Testcase input
        int t = sc.nextInt();
        
        // Loop to iterate for all testcases
        while(t-- > 0)
        {
            // Input N, integer to check sum
            int n = sc.nextInt();
            
            check(n);
        }
    }

//Position this line where user code will be pasted.

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//User function Template for Jav
    // Function to check whether sum of
    // first and last digit is equal to
    // sum of remaining digit
    // Here, n is the integer on which sum
    // operation is to be performed
    public static void check(int n)
    {
        // Your code here
        String num = String.valueOf(n);
        int index = 0;
        int sum1 = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(num.length()-1));
        if(num.length()>1)
        	num = num.substring(1, num.length()-1);
        int sum2 = 0;
        for(int i=0;i<num.length();i++){
        	sum2 += Character.getNumericValue(num.charAt(i));
        }
        
        if(sum1==sum2)
        	System.out.println("YES");
        else
        	System.out.println("NO");
           
    }
    
}
