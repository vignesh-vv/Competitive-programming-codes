package pkg;

import java.util.Scanner;

public class PermutationsOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		permute(str);
	}

	private static void permute(String str) {
		// TODO Auto-generated method stub
		permuteHelper(str, "");
	}

	private static void permuteHelper(String s, String chosen) {
		// TODO Auto-generated method stub
		if(s.isEmpty()){
			System.out.println(chosen);
		}
		else{
			//choose/explore/unchoose
			for(int i=0;i<s.length();i++){
				//choose
				String chosenLetter = s.substring(i, i+1);
				String newS = s.substring(0, i) + s.substring(i+1, s.length());
				String newChosen = chosen + chosenLetter;
				
				//explore
				permuteHelper(newS, newChosen);
				
				//unchoose
				//no need to!
			}
		}
	}

}
