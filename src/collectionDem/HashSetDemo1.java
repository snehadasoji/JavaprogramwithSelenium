package collectionDem;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>(); //default capacity 16 LoadFactor 0.75
		//HashSet<Object> hs=new HashSet<Object>(100); //Initial capacity 100
		//HashSet<Object> hs=new HashSet<Object>(100,0.90f); //Increased LoadFactor 0.90f
		//HashSet<Integer> has=new HashSet<Integer>();
		
		//Add objects into the HashSet
		
		hs.add(100);
		hs.add("Sneha");
		hs.add(13.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.remove(13.5));
		System.out.println(hs);
		
		
		System.out.println(hs.contains("sneha"));
		System.out.println(hs.containsAll(hs));
		System.out.println(hs.isEmpty());
		
		

	}

}
