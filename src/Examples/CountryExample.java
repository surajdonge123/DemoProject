package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryExample {
public static void main(String[] args) {
	

	List<String> maharashtra=new ArrayList();
	
	maharashtra.add("Nagpur");
	maharashtra.add("Yawatmal");
	
	List<String> gujrat=new ArrayList();
	gujrat.add("Rajkot");
	gujrat.add("Ahmedabad");
	
	
	List<List<String>> india=new ArrayList<>();
	india.add(maharashtra);
	india.add(gujrat);
	System.out.println(india);
	
	System.out.println("by using list iterator");
	
	Iterator<List<String>> iterator = india.iterator();
	while(iterator.hasNext()) {
		List<String> state = iterator.next();
		
		Iterator<String> iterator2 = state.iterator();
		while(iterator2.hasNext()) {
			String city = iterator2.next();
			System.out.println(city);
		}
	}
	System.out.println("by using for each loop");
	for(List<String> state:india) {
		for(String city : state) {
			System.out.println(city);
		}
		
	}
	
	
	
	
}
}