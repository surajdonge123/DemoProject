package set;

import java.util.HashSet;
import java.util.Set;

public class demo1 {

/*	It is the Child Interface of Collection.
	 If we want to Represent a Group of Individual Objects as a 
	  Single Entity where Duplicates are Not allowed 
	 and Insertion Order is Not Preserved then we should go for Set.
	  Set Interface doesn't contain any New Methods and Hence we have
	 to Use Only Collection Interface Methods */

	public static void main(String[] args) {
	
		Set s=new HashSet();
		s.add(1212);
		s.add("suraj");
		s.add(789);
		s.add(656);
		s.add("donge");
		s.add(101);
		s.add(102);
		System.out.println(s);
//		[656, suraj, donge, 789, 101, 102, 1212] This is how output looks like
	
	}}
