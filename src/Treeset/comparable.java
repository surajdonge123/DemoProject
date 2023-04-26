package Treeset;

public class comparable {
 // it contains only one method     CompareTo();
	
	/* whenever we are trying to add object by using default sorting orders 
	then automatically CompareTo() method gets executed*/
	
	
	public static void main(String[] args) {
		System.out.println("a".compareTo("z"));
		System.out.println("a".compareTo("b"));
		System.out.println("l".compareTo("z"));
		System.out.println("z".compareTo("l"));
		
	}
	
}
