package collectionDem;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReadingLinkedElem {

	public static void main(String[] args) {
		
		//Reading LinkedList Elements using forloop
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(4);
		ll.add(7);
		ll.add(5);
		ll.add(6);
		ll.add(8);
		ll.add(9);
		
		
		//System.out.println(ll.pop());
		//System.out.println(ll.peek());
		//System.out.println(ll.poll());
		
		
		/*--for(int i=0; i<=ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}--*/
		
		
		//for..... each loop
		
		/*---for(Object e:ll)
		{
			System.out.println(e);
			
		}--*/
		
		//Iterator()method
		/*---Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.hasNext());
		}--*/
		
		
		//sort()
		
		Collections.sort(ll);
		System.out.println("After sorting:" + ll); //After sorting:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		//Reverse()
		
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("Reverse order:" + ll);//Reverse order:[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		Collections.shuffle(ll);
		System.out.println("After shuffling:" +ll);//After shuffling:[6, 3, 5, 1, 2, 10, 4, 9, 8, 7]
		
		
		
		


	}

}
