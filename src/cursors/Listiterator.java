package cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

/*	Listiterator is a child class of iterator
	by using ListIterator we can move mor either to foreward direction OR o the backward direction
	it is a Bi-directional

    By using ListIterator we can Able to Perform Addition of New Objects and Replacing
existing Objects. In Addition to Read and Remove Operations.
	we ca create listoterator object nby using listitertor().*/
	
	
	/* ***ListIteratorDefines the following 9 Methods***

    **forwaed direction
	public boolean hasNext()
	public Object next()
	public int nextIndex()


    ***backward direction
	public boolean hasPrevious()
	public Object previous()
	public int previousIndex()
    
    
    ***extra operation
	public void remove()
	public void set(Object new)
	public void add(Object new)*/
	
	public static void method1() {
		
		ArrayList al=new ArrayList();
		al.add(1212);
		al.add(5212);
		al.add(7845);
		al.add(52);
		al.add("suraj");
		System.out.println(al);
		
		ListIterator listIterator = al.listIterator();
		
		while(listIterator.hasNext()) {
			Object next = listIterator.next();
		
			System.out.println(next);
		}}
	
	
		public static void remove() {
			
			ArrayList al=new ArrayList();
			al.add("suraj");
			al.add("abc");
			al.add("xyz");
			al.add(52);
			al.add("pqr");
			System.out.println(al);
			ListIterator listIterator = al.listIterator();
			while(listIterator.hasNext()) {
				Object next = listIterator.next();
			if(next.equals(52)) {
				listIterator.remove();
			}
			}System.out.println(al);
		
	}
		public static void direction() {

			ArrayList al=new ArrayList();
			al.add("suraj");
			al.add("abc");
			al.add("xyz");
			al.add(52);
			al.add("pqr");
			System.out.println(al);
			ListIterator listIterator = al.listIterator();
			System.out.println("forward direction");
			while(listIterator.hasNext()) {
				Object next = listIterator.next();
				System.out.println(next);
			}
			System.out.println("backword direction");
			while(listIterator.hasPrevious()) {
				Object previous = listIterator.previous();
				System.out.println(previous);
			}
			
		}
		public static void index() {
			ArrayList al=new ArrayList();
			al.add("suraj");
			al.add("abc");
			al.add("xyz");
			al.add(52);
			al.add("pqr");
			System.out.println(al);
			ListIterator li = al.listIterator();
			System.out.println("forward direction");
			
			while(li.hasNext()) {
				Object next = li.next();
				int nextIndex = li.nextIndex();
				System.out.println(nextIndex);
				System.out.println(next);
				
			}
			System.out.println("backward direction");

			while(li.hasPrevious()) {
				Object previous = li.previous();
				int nextIndex = li.nextIndex();
				System.out.println(nextIndex);
				System.out.print(previous);
			}
			System.out.println(al);
		}
		
		
		public static void main(String[] args) {
//		method1();
//		remove();
//		direction();
		index();
	}

}
