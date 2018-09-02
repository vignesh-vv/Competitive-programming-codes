package pkg;
import java.util.*;

class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			System.out.println(GfG.palinArray(a , n));
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  //121 131 20
                  
                  boolean flag = true;
                  int res = 1;
                  for(int i=0; i<n; i++){
                      int num = a[i];
                      int temp = 0;
                      int val = 0;
                      int count = 0;
                      while(num>0){
                        temp = num%10;
                        num = num/10;
                        val = val*10 + temp;
                        count++;
                      }
                      //System.out.println(val);
                      if(val!=a[i]){
                          res = 0;
                          break;
                      }
                  }
        
               return res;
           }
}
