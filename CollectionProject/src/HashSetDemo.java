import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> allCities = new HashSet<String>();
		
		// C - create
		allCities.add("Chennai");
		allCities.add("Hyderabad");
		allCities.add("Pune");
		allCities.add("Mumbai");
		
		// R - read
		for(String eachCity: allCities) {
			System.out.println("using enhanced for loop : " + eachCity);
		}
		
		allCities.add("Pune"); // duplicate value not added
		
		Iterator<String> itr = allCities.iterator();
		while(itr.hasNext()) {
			System.out.println("using iterator() : " + itr.next());
		}
		
		// U - update, D - delete
		allCities.remove("Mumbai");
		allCities.add("Bombay");
		
		allCities.forEach((eachCity)->System.out.println("using forEach() method : " + eachCity));
		
		System.out.println("--------------------------------------");
		// filter cities starting with C
		allCities.add("Calcutta");
		allCities.forEach((eachCity)->System.out.println("using forEach() method : " + eachCity));
		allCities.removeIf((eachCity)->!eachCity.startsWith("C"));
		
		System.out.println("--------------------------------------");
		allCities.forEach((eachCity)->System.out.println("using forEach() method : " + eachCity));

	}

}
