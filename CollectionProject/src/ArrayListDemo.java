import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	
	// CRUD operations
	// C - create(add)
	// R - read
	// U - update
	// D - delete
	// we have o know how to perform the CRUD operation on a data structure
	public static void main(String[] args) {
		int[] myMarks = new int[5];
		myMarks[0] = 40;
		myMarks[1] = 80;
		myMarks[2] = 50;
		myMarks[3] = 40;
		myMarks[4] = 70;

		//ArrayList<Integer> allMarks = new ArrayList<Integer>();
		List<Integer> allMarks = new ArrayList<Integer>(); // correct way
		
		// C - create
		allMarks.add(myMarks[0]); // beacuse of autoboxing, we can add a primitive type to a collection. 
									// JAVA WILL AUTOMATICALLY CONVERT PRIMITIVE TO ITS WRAPPER TYPE
		allMarks.add(myMarks[1]);
		allMarks.add(myMarks[2]);
		allMarks.add(myMarks[3]);
		allMarks.add(myMarks[4]);
		System.out.println("----------------------------------------");
		// R - read
		// many ways
		for(int i=0; i<allMarks.size();i++) {
			System.out.println("using for loop: " + allMarks.get(i));
		}
		
		for(Integer mark: allMarks) {
			System.out.println("using enhanced for loop : " + mark);
		}
		
		Iterator<Integer> itr = allMarks.iterator();
		while(itr.hasNext()) {
			System.out.println("using iterator() : " + itr.next());
		}
		
		allMarks.forEach((eachObj)->System.out.println("using forEach() method: " + eachObj));
		
		System.out.println("----------------------------------------");
		// U - update
		allMarks.set(3, 90);
		allMarks.forEach((eachObj)->System.out.println("using forEach() method: " + eachObj));
		
		System.out.println("----------------------------------------");
		allMarks.remove(3);
		allMarks.forEach((eachObj)->System.out.println("using forEach() method: " + eachObj));

		
	}

}
