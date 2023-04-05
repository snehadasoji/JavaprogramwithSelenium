package collectionDem;

import java.util.ArrayList;

public class ReadingDataFromArray {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		
		//Add new elements to the arraylist
		
		al.add(100);
		al.add("sneha");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//For loop
				/*---for(int i=0; i<=al.size(); i++)
				{
					System.out.println(al.get(i));
				}---*/
		
		//for..each
		System.out.println("Reading elements using for ....each loop");
		for(Object e:al)
		{
			System.out.println(e);
		}
	}

}
