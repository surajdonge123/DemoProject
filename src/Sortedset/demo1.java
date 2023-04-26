package Sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class demo1 {

	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		s.add(600);
		s.add(700);
		s.add(800);
		
		System.out.println(s.first());//100
		System.out.println(s.last());
		System.out.println(s.headSet(400));//100,200,300
		System.out.println(s.tailSet(500));//500,600,700,800
		System.out.println(s.subSet(200, 700));//200,300,400,500,600
		System.out.println(s.comparator());
		
	}
}
