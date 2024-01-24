import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		// C - create
		phoneBook.put("Priya", 123456789L);
		phoneBook.put("John", 5555555555l);
		phoneBook.put("Smith", 8888888888L);
		phoneBook.put("Daniel", 3333333333L);
		
		// R -read
		// many ways
		Set<String> allKeys = phoneBook.keySet();
		for(String eachKey: allKeys) {
			System.out.println("using keySet() method : " + eachKey + " - " + phoneBook.get(eachKey));
		}
		
		Set<Entry<String, Long>> allEntries = phoneBook.entrySet();
		for(Entry eachEntry: allEntries) {
			System.out.println("using entrySet() method : " + eachEntry.getKey() + " - " + eachEntry.getValue());
		}
		
		phoneBook.forEach((key, value)->System.out.println("using forEach() method : " + key + " - " + value));
		
		System.out.println("---------------------------------");
		// U- update
		phoneBook.replace("Smith", 1111111111L);
		phoneBook.forEach((key, value)->System.out.println("using forEach() method : " + key + " - " + value));
		
		System.out.println("---------------------------------");

		phoneBook.remove("Daniel");
		phoneBook.forEach((key, value)->System.out.println("using forEach() method : " + key + " - " + value));


	}

}
