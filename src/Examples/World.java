package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {

	public static void main(String[] args) {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("Nagpur");
		maharashtra.add("pune");
		List<String> Uttarakhand = new ArrayList<>();
		Uttarakhand.add("Rishikesh");
		Uttarakhand.add("haridwar");
		List<String> Florida = new ArrayList<>();
		Florida.add("miami");
		Florida.add("st.petersburg");
		List<String> Nevada = new ArrayList<>();
		Nevada.add("Las vegas");
		Nevada.add("paradise");

		List<List<String>> india = new ArrayList<>();
		india.add(maharashtra);
		india.add(Uttarakhand);

		List<List<String>> USA = new ArrayList<>();
		USA.add(Nevada);
		USA.add(Florida);

		List<List<List<String>>> world = new ArrayList<>();
		world.add(india);
		world.add(USA);

		System.out.println(world);
		Iterator<List<List<String>>> iterator = world.iterator();
		while (iterator.hasNext()) {
			List<List<String>> country = iterator.next();
			Iterator<List<String>> iterator2 = country.iterator();
			while (iterator2.hasNext()) {
				List<String> state = iterator2.next();
				Iterator<String> iterator3 = state.iterator();
				while (iterator3.hasNext()) {
					String city = iterator3.next();
					System.out.println(city);

				}
			}
		}
		System.out.println("***** By for each loop*****");
		for(List<List<String>> country :world) {
			for(List<String> state:country) {
				for(String city:state) {
					System.out.println(city);			
				}
			}
		}
		
		
	}

}
