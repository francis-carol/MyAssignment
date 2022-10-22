package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		
		//regular for loop
		 for(int i = 0; i < data.length; i++) {  
	            for(int j = i + 1; j < data.length; j++) {  
	                if(data[i] == data[j])  
	                    System.out.println("Duplicate numbers in the given integer array is"+" "+data[i]);  
	            }  
	        }  
		 
		 //using set
		 Set<Integer> charSet = new LinkedHashSet<Integer>();
		 
		 for (int i = 0; i < data.length; i++) {
			 int value = data[i];
			 if(charSet.add(value)==false) {
				 System.out.println("Duplicate numbers in the given integer array is"+" "+value);
			 }
			
		}
		 
		 
			/*
			 * for (Integer integer : data) { charSet.add(integer); }
			 * System.out.println(charSet);
			 */

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */


	}


}
