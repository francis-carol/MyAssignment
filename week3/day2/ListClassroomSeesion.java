package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListClassroomSeesion {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(54);
		list.add(67);
		list.add(55);
		list.add(66);
		list.add(42);
		list.add(27);
		list.add(89);
		
		System.out.println(list);
		
		for(Integer i: list ) {			
			if(i%2!=0) {
				System.out.println("The odd numbers are " +  i);
			}
		
		}
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Arun");
		list2.add("Deepa");
		list2.add("Maria");
		list2.add("Muthu");
		list2.add("Sharmila");
		list2.add("Chinrasu");
		list2.add("Maran");
			
		System.out.println(list2);
		
		for(String name: list2 ) {	
			
			if(name.startsWith("M")) {
				System.out.println("The name starts with M  are " +  name);
			}
		
		}
		


	}

}
