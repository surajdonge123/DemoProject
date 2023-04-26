package vector;

import java.util.Vector;

public class demo1 {


// Insertion Order is Preserved.
// Implements Serializable, Cloneable and RandomAccess interfaces.
// Every Method Present Inside Vector is Synchronized and Hence Vector Object is
//Thread Safe.
// Vector is the Best Choice if Our Frequent Operation is Retrieval.
// Worst Choice if Our Frequent Operation is Insertion OR Deletion in the Middle.
	
	public static void defaultcapacity() {
// Creates an Empty Vector Object with Default Initial Capacity 10.
//Once Vector Reaches its Max Capacity then a New Vector Object will be Created with

//new Capacity = current capacity *2;

		Vector v=new Vector();
		System.out.println(v.capacity());//10
		System.out.println(v.size());//0
		v.add(123);
		v.add(321);
		v.add(null);// null Insertion is Possible.
		v.add(0);
		v.add("1suraj");// Heterogeneous Objects are allowed.
		v.add(123);// Duplicate Objects are allowed.
		v.add(321);
		v.add(null);
		v.add(0);
		v.add("suraj");
		v.add("hi");//The Underlying Data Structure is Resizable Array OR Growable Array.
		System.out.println(v.capacity());//20
		System.out.println(v.size());//11
	
	}
	
	public static void initialcapacity(){
		Vector v1=new Vector(12);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		v1.add(66);
		v1.add("hi");
		System.out.println(v1.size());//13
		System.out.println(v1.capacity());//24
		
	}

	public static void incrementalcapacity(){
		Vector v1=new Vector(12,50);
		System.out.println(v1.capacity());//12
		
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		v1.add(66);
		v1.add("1suraj");
		v1.add(123);
		v1.add("12suraj");
		v1.add(1234);
		v1.add(3455);
		v1.add(66);
		v1.add("hi");
		System.out.println(v1.size());//13
		System.out.println(v1.capacity());//62
	}
	
	
	public static void main(String[] args) {
//		defaultcapacity();
//		initialcapacity();
		incrementalcapacity();
	}
}
