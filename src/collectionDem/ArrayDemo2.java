package collectionDem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDemo2 {

	public static void main(String[] args) {
		ArrayList<Object> s1 = new ArrayList<>();
		 s1.add("X");
		 s1.add("Y");
		 s1.add("Z");
		 s1.add("A");
		 s1.add("B");
		 s1.add("C"); 
		 
		 //System.out.println(s1);
		 
		 ArrayList<Object> s2=new ArrayList<>();
		 s2.addAll(s1);
		 System.out.println("After relaplcing the values in s2 object:"+ s2);
		 
		 s2.removeAll(s1);
		 System.out.println("After removing:" +s2);
		 
		System.out.println(s1);
		
		//Collections.sort((List<T>) s1);
		
		 
		
	}

}
