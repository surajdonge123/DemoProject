package queue;

import java.util.PriorityQueue;

public class PrioritiesQueue {

	/*
	 * This is a Data Structure which can be used to Represent a Group of Individual
	 * Objects Prior to processing according to Some Priority.
	 * 
	 * The Priority Order can be Either Default Natural Sorting Order OR Customized
	 * Sorting Order specified by Comparator Object.
	 * 
	 * If we are Depending on Natural Sorting Order then the Objects should be
	 * Homogeneous and Comparable otherwise we will get ClassCastException.
	 * 
	 * If we are defining Our Own Sorting by Comparator then the Objects Need Not
	 * beHomogeneous and Comparable.
	 * 
	 * Duplicate objects are Not Allowed.
	 * 
	 * Insertion Order is Not Preserved and it is Based on Some Priority.
	 * 
	 * null Insertion is Not Possible Even as 1st Element Also
	 * 
	 * 
	 * **Constructors** * Constructors
	 * 
	 *PriorityQueue q=new PriorityQueue(); Creates a empty hashmap object with default
	 * initial capacity 11 and all object will be inserted according to default natural sorting orders
	 * 
	 * PriorityQueue q=new PriorityQueue(initialCapacity);
	 * 
	 * PriorityQueue q=new PriorityQueue(initialcapacity,Comparator c);
	 * 
	 * PriorityQueue q=new PriorityQueue(Sortedset s);
	 * 
	 * PriorityQueue q=new PriorityQueue(Collection c);
	 */
	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		System.out.println(q.peek());//gives head element of the queue
		for(int i=0;i<=15;i++) {
			q.offer(i);//to add an object to the queue
		}
		
		q.offer(25);
		System.out.println(q);
		System.out.println(q.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
