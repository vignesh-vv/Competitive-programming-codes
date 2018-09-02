package pkg;
import java.io.*;
import java.lang.Math;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class OnceInATram {
	static String onceInATram(int x) {
        // Complete this function
        String tram = Integer.toString(x);
        char ch[] = tram.toCharArray();
        int count=0;
        int num1=0;
        int num2=0;
        
        Math.
        for(int i=0;i<tram.length();i++){
        	num1=num1+(int)(ch[i]);
       		count++;
       		if(count>3){
       			num2=num1;
       			count=0;
       			num1=0;
       		}
        }
        if(num1<num2){
        	Integer.pa
        	
        }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    String result = onceInATram(x);
    result.l
    System.out.println(result);
    }
}
