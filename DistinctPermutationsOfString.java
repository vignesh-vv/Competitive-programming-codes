package pkg;

import java.util.HashSet;
import java.util.Set;

public class DistinctPermutationsOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GOOGLE";
		permute(str);
		
		
	}

	private static void permute(String s) {
		// TODO Auto-generated method stub
		Set<String> chosen = new HashSet<>();
		permuteHelper(s, "", chosen);
		
	}

	private static void permuteHelper(String s, String chosen, Set<String> alreadyPrinted) {
		// TODO Auto-generated method stub
		if(s.isEmpty()){									//base case
			if(!alreadyPrinted.contains(chosen)){
				System.out.println(chosen);		
				alreadyPrinted.add(chosen);
			}
			
		}
					
		else{
			//choose/explore/unchoose
			//Since, string are immutable in java, we create 2 new strings and pass it to the calling function
			for(int i=0;i<s.length();i++){
				//choose
				String chosenLetter = s.substring(i, i+1);
				String newS = s.substring(0, i) + s.substring(i+1, s.length()); //remove first letter from s
				String newChosen = chosen + chosenLetter;
				
				//explore
				permuteHelper(newS, newChosen, alreadyPrinted);
				
				//unchoose
				//nothing to do
			}
		}
	}

}


/*Without caring for strings as immutable
 * for(int i=0;i<s.length();i++){
//choose
String chosenLetter = s.substring(i, i+1);
s = s.substring(0,i) + s.substring(i+1,s.length());
chosen += chosenLetter;

//explore
permuteHelper(s,chosen);

//unchoose
s = s.substring(0,i) + chosenLetter + s.substring(i);
chosen = chosen.substring(0, chosen.length()-1);
}
*/
