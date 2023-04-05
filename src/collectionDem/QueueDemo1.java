package collectionDem;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<Object> q=new PriorityQueue<Object>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		q.offer("E");
		
		System.out.println(q);//insertion order preserved & duplications 

		//get head element through element() peek()
		//System.out.println(q.element()); //Exception 
		//System.out.println(q.peek());//null
		
		
		//Return and remove element from Queue remove() poll()
		//System.out.println(q.remove()); //it return the header element from the queue
		//System.out.println(q); //A
		
		//System.out.println(q.poll()); //A
		//System.out.println(q); //[B, D, C, E, E]
		
		/*--Iterator<Object> it=q.iterator();
		
			while(it.hasNext())
			{
				System.out.println(it.next());
			}--*/
		
		for(Object ee:q)
		{
			System.out.println(ee);
			
		}
			
			
		
		
		
		
	}

}
