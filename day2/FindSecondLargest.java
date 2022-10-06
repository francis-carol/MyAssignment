package week1.day2;

import java.sql.Array;
import java.util.Arrays;

////Here is the input
//		int[] data = {3,2,11,4,6,7};
//
//		
//		/*
//		 Pseudo Code:
//		 1) Arrange the array in ascending order
//		 2) Pick the 2nd element from the last and print it
//		 */
public class FindSecondLargest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		System.out.println("The length of the array" + length);
		Arrays.sort(data);
		System.out.println("The ascending order of the array");
		for(int i = 0; i < length; i++)
		System.out.println(data[i]);
		
		System.out.println("The Second Largest number is " + data[length-2]);


	}

}
