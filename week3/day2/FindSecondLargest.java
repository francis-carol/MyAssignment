package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		// output= 7;

		/*
		 * Pseudo Code: a) Create a empty Set Using TreeSet 
		 * b) Declare for loop iterator
		 * from 0 to data.length and add into Set
		 *  c) converted Set into List 
		 *  d) Print the second last element from List
		 * 
		 * 
		 */
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		Arrays.sort(data);

		Set<Integer> setNum = new TreeSet<Integer>();

		for (Integer integer : data) {
			setNum.add(integer);
		}
		System.out.println(setNum);

		List<Integer> list = new ArrayList<Integer>(setNum);
		System.out.println(list);
		int size = list.size();
		System.out.println(size);
		System.out.println(list.get(size - 2));
		System.out.println("Second Largest number in the given Array is " + " " + list.get(list.size() - 2));

	}

}
