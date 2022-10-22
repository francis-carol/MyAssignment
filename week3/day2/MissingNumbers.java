package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem
		 * 
		 * int[] num = { 1, 4, 6, 2, 5, 7, 8, 9, 10 }; There will be running number
		 * between 1 to 10 One of the unique number will be missing Find the missing
		 * number
		 * 
		 * 
		 */
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set 
		 * b) Make sure the set is in the ascending order 
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] num= {1,2,1,4,6,7,3,4,5,6,7,8,10};
	    //output:1,2,3,4,5,6,7,9
	    
	    //a) Remove the duplicates using Set
	    Set<Integer> uniqueValues=new TreeSet<Integer>();
	    
	    
	    //add the values in empty set
	    for (int i = 0; i < num.length; i++) {
	        uniqueValues.add(num[i]);
	    }
	    
	    System.out.println(uniqueValues);
	    //Convert set into list
	    List<Integer> missingEle=new ArrayList<Integer>(uniqueValues);
	    
	    for (int i = 0; i < missingEle.size()-1; i++) {
	        //If did not match, that is the number
	        if(missingEle.get(i)+1!= missingEle.get(i+1)) {
	            System.out.println(missingEle.get(i)+1);
	            break;
	        }
	    }

		

	}

}
