package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PayPal India";
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		char[] ch = str.toCharArray();
		
		for(Character char1:ch) {
			if(!charSet.add(char1)) {
				dupcharSet.add(char1);
			}
			
		}
		//remove duplicates
		charSet.removeAll(dupcharSet);
		System.out.println(charSet);
		
		for(Character char2 : charSet) {
			if(char2 !=' ') { 
				System.out.print(char2);
			}
		}
		
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it

	}
}
