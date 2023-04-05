package collectionDem;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		//Hastable ht=new (initial capacity);
		//Hashtable ht=new hashtable(initial capacity,fill ratio)
		ht.put(101, "sneha");
		ht.put(102, "neha");
		ht.put(103, "swati");
		ht.put(104, "rai");
		//ht.put(105, null);  Exception in thread  
		
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		System.out.println(ht.remove(102));
		System.out.println(ht);
		System.out.println(ht.contains(102));
		System.out.println(ht.isEmpty());
		System.out.println(ht.keySet());
		System.out.println(ht.containsKey(101));
		System.out.println(ht.values());
		System.out.println(ht.keySet());
		
		for(int i:ht.keySet())
		{
			System.out.println(i+"  "+ht.get(i));
		}
		
	}

}
