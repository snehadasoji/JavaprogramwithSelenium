package collectionDem;

import java.util.HashSet;
import java.util.Iterator;

public class ReadingHashset {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add(100);
		hs.add("Sneha");
		hs.add(13.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		//Reading the elements using for....each
		/*--for(Object e:hs)
		{
			System.out.println(e);
		}--*/
		
		Iterator<Object> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	

}
