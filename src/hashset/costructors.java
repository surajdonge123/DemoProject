package hashset;

import java.util.HashSet;

public class costructors {

	public static void main(String[] args) {
    HashSet h=new HashSet<>();
/*   Crate an empty hashset object with deault initial capacity **16**
    and default fill ratio 0.75*/
    HashSet h1=new HashSet(20);;;
	/*Crate an empty hashset object with specified initial capacity and default
	  fill ratio is 0.75*/
	 
	 HashSet h3=new HashSet<>(50,70);
//	            (initialcapacity,float fillratio)
	 
//	 HashSet h4=new HashSet<>(collection c);
	}
}
