package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Fazil");
		list.add("Pradeep");
		list.add("Siva");
		list.add("Azar");
		list.add("Srisha");
		list.add("Siva");
		list.add("Dinesh");
		
		//Insertion in list
		list.add(2, "Prakash Raj");
		
		//update in list
		list.set(0, "udhay");
		
		//delete a vale
		
		list.remove("Siva");
		
		list.remove(5);
		
		//System.out.println(list);
		System.out.println(list.size());
		//Collections.sort(list);
		
		//for (int i = 0; i < list.size();  i++) {
		//	System.out.println(list.get(i));
			
		//}
		//Collections.reverse(list);
		//System.out.println("----------------------");
		
		//for(String name:list) {
		///	System.out.println(name);
		//}
		

	}

}
