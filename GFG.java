package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    in.nextLine();
	    while(t-->0){
	       String str = in.nextLine();
	       char ch[] = new char[str.length()];
	       int index = 0;
	       for(int i=0;i<str.length();i++){
	    	   if(Character.isLetterOrDigit(str.charAt(i))){
	    		   ch[index++] = Character.toLowerCase(str.charAt(i));
	    	   }
	       }
	       
	       int l = 0;
	       int u = index-1;
	       boolean flag = true;
	       while(l<=u){
	    	   if(ch[l++]!=ch[u--]){
	    		   flag = false;
	    		   break;
	    	   }  
	       }
	       if(flag)
	    	   System.out.println("YES");
	       
	       else
	    	   System.out.println("NO");
	    }
	 }
}