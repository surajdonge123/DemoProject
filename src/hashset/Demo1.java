package hashset;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		HashSet h = new HashSet<>();
		h.add(1212);
		h.add(7894);
		h.add("suraj");
		h.add(null);
		h.add(1212);// Duplicates value are not allowed
		h.add(63);
		h.add(85);
		System.out.println(h.add(85));
		h.add(2121);
		h.add(null);//null value is acceptable for 1st time only
		System.out.println(h);
//        [null, suraj, 7894, 1212, 63]==> insetion order and sorting order is not preserved
	}

}
