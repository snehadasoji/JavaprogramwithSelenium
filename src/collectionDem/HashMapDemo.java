package collectionDem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(101, "sneha");
		m.put(102, "sujoy");
		m.put(103, "neha");
		m.put(104, "rati");
		m.put(105, "rohini");
		m.put(103, "X");
		m.put(null, "Like");
		m.put(106, null);
		m.put(107, "null");//multiple time null not allowed in key
		
		
		System.out.println(m);
		
		System.out.println(m.get(105));
		
		System.out.println(m.remove(103));
		System.out.println(m);
		
		System.out.println(m.containsKey(107));
		System.out.println(m.containsValue("sneha"));
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet()); //it will return all the keys in set format
		System.out.println(m.values());// it will return all the values [sneha, sujoy, rati, rohini]
		
		System.out.println(m.entrySet());//it will return all the entries set [101=sneha, 102=sujoy, 104=rati, 105=rohini]
		
		
		
		//Individual read the keys
		
			for(int i:m.keySet())
		{
			System.out.println(i);
		}
			
		//individual read the values	
			for(Object j:m.values())
			{
				System.out.println(j);
			}
		
		//captured the keys and values pairs
			/*for(Object k:m.keySet())
			{
				System.out.println(k+"    "+m.get(k));
				
					
				}*/
			
			//Entry Methods
			//*************
			/*for(Map.Entry entry:m.entrySet())
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			}*/
			
			
			
			}
	}


