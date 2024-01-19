
public class ClassRoom extends Room{
	
	int countOfChairs;
	int countOfTables;
	Projector projector;
	
	public ClassRoom(double length, double width, double height, int countOfChairs, int countOfTables) {
		super(length, width, height);
		// using super() we can call the super class constructor from the sub class constructor
		// this is also called constructor chaining
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.countOfChairs = countOfChairs;
		this.countOfTables = countOfTables;
		projector = new Projector();
		
	}
	
	boolean lockClassRoom() {
		return true;
	}
	
	boolean unlockClassRoom() {
		return true;
	}
}
