package collectionDem;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declaretion
		//LinkedList <Integer> ll=new LinkedList <Integer>();
		//LinkedList <String> ll=new LinkedList <String>();
		
		
		LinkedList<Object> ll=new LinkedList<>();
		ll.add(10);
		ll.add("tom");
		ll.add(12.3f);
		ll.add(10);
		ll.add('c');
		ll.add(true);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		ll.add(2,"bob");
		System.out.println(ll);
		
		ll.addFirst("sneha");
		System.out.println(ll);
		
		ll.addLast("sujata");
		System.out.println(ll);
		
		System.out.println(ll);
		
		ll.remove(6);
		System.out.println(ll);
		
		ll.add(6, 'c');
		System.out.println(ll);
		
		ll.remove(5);
		System.out.println(ll);
		
		//retriving value /object
		System.out.println(ll.get(3));
		
		//Change thjs index value
		ll.set(6, 'G');
		System.out.println(ll);
		
		//contains()
		System.out.println(ll.contains("sujata"));
		
		//isEmpty()
		System.out.println(ll.isEmpty());
		

	}

}
