import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	// in a TreeSet we can add objects whose class implements Comparable interface
	// but if the object of the class to be added is provided by a 3rd party, we cannot make the class implement Comparable
	// so what is an alternate solution for this?
	
	// Comparable interface
	// Comparator interface
	// overiding toString() method
	// overiding equals() and hashcode() - defenitly explore and use it
	public static void main(String[] args) {
		SortedSet<String> allNames = new TreeSet<String>();
		
		//C - create
		allNames.add("John");
		allNames.add("Smith");
		allNames.add("Priya");
		allNames.add("Anna");
		allNames.add("Xavier");
		allNames.add("Ram");
		
		allNames.forEach((eachName)->System.out.println(eachName));
		
		SortedSet<Integer> allMarks = new TreeSet<Integer>((obj1, obj2)->obj2.compareTo(obj1));
		
		allMarks.add(50);
		allMarks.add(70);
		allMarks.add(20);
		allMarks.add(90);
		allMarks.add(10);
		allMarks.add(30);
		allMarks.add(80);
		
		allMarks.forEach((eachMark)->System.out.println(eachMark));
		
		SortedSet<EmployeeDTO> allEmployees = new TreeSet<EmployeeDTO>();
		
		EmployeeDTO emp1 = new EmployeeDTO(101, "Karthik", 20000);
		allEmployees.add(emp1);
		allEmployees.add(new EmployeeDTO(104, "Raj", 30000));
		allEmployees.add(new EmployeeDTO(103, "Kumar", 35000));
		allEmployees.add(new EmployeeDTO(102, "Ram", 25000));
		
		allEmployees.forEach((eachEmployee)->System.out.println(eachEmployee));
		
		
	}

}
