package pkg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[] arrayN = new int[n];
		for (int i = 0; i < n; i++) {
			arrayN[i] = new Integer(br.readLine());
			int seatNo;
			if ((arrayN[i] % 12) != 0)
				seatNo = ((arrayN[i] / 12 + 1) * 12) - (arrayN[i] % 12) + 1;
			else
				seatNo = (arrayN[i] / 12 - 1) * 12 + 1;
			System.out.print(seatNo);
			switch (seatNo % 6) {
			case 0:
				System.out.println(" WS");
				break;
			case 1:
				System.out.println(" WS");
				break;
			case 2:
				System.out.println(" MS");
				break;
			case 3:
				System.out.println(" AS");
				break;
			case 4:
				System.out.println(" AS");
				break;
			case 5:
				System.out.println(" MS");
				break;
			case 6:
				System.out.println(" WS");
				break;
			}
 
		}
	}
}
 