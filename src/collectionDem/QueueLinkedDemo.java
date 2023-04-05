package collectionDem;

import java.util.LinkedList;

public class QueueLinkedDemo {

	public static void main(String[] args) {
		//Queue LinkedList allowed hestrogenious data
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("A");
		ll.offer(10);
		ll.add(12.5F);
		ll.offer('c');
		ll.add(10);
		
		System.out.println(ll); //[A, 10, 12.5, c, 10]
		
		//Linked list element()
		//System.out.println(ll.element()); //A //if the queue is empty element() Exception in thread "main" java.util.NoSuchElementException

		
		//LinkedLIst peek()
		//System.out.println(ll.peek());//A //if the queue is empty peek() will return null
		
		//LinkedList remove()
		//System.out.println(ll.remove());//A //it will remove the first element from the queue //if the queue is empty element() Exception in thread "main" java.util.NoSuchElementException
		//System.out.println(ll);
		
		//Linkedlist poll()
		//System.out.println(ll.poll());////A //if the queue is empty peek() will return null
		
		

	}

}
