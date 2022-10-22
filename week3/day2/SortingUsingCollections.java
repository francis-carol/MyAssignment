package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)

		// get the length of the array

		// sort the array

		// Iterate it in the reverse order

		// print the array

		// Required Output: Wipro, HCL , CTS, Aspire Systems

		List<String> list = new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");

		int size = list.size();
		System.out.println("Size of the given List is::"+" "+size);

		//Collections.sort(list, Collections.reverseOrder());

		for (int i = list.size(); i >= 0; i--) {

		}
		System.out.println("Required output::" + " " + list);

		

	}

}
