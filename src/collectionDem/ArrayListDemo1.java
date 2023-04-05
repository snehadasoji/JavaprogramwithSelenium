package collectionDem;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		//Arraylist al=new ArrayList();
		//Arraylist <Integer> al=new ArrayList<Integer>();
		//Arraylist <String> al=new ArrayList<String>();
		//List al=new ArrayList();
		ArrayList<Object> al=new ArrayList<>();
		
		//Add new elements to the arraylist
		
		al.add(100);
		al.add("sneha");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//size
		System.out.println("Number of elemts in array list:" + al.size());
		
		//Remove
		
		System.out.println("Removing the second index value:" + al.remove(2));
		System.out.println("After removing the list:"+ al);
		
		//insert the new element
		//add(index,object)
		
		al.add(2,"Swetha");
		System.out.println("After insertion:"+ al);
		
		//retreive specific element
		
		System.out.println(al.get(1));
		
		//change element/replace
		al.set(3, "Python");
		System.out.println("After replacing element:" +al);
		
		//Search - contains()
		System.out.println(al.contains("Swetha"));
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		
		
		
		
		
		}
		
		
		
		
		
		

	}


