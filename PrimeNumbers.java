package pkg;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PrimeNumbers {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        // Write your code here
        int count = 0;
        
        int rem=0;
        for(int i=2;i<N;i++){
        	//System.out.println("hi");
        	boolean flag=true;
        	if((i==2) || (i==3)){
                System.out.print(i + " ");
                count++;
        	}
            for(int j=2;j<=i/2;j++){
                rem = i%j;
                if(rem==0){
                	flag=false;
                	break;
                }
                if((j==i/2) && (flag==true)){
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
    }
}