
public class RoomDemo {

	public static void main(String[] args) {
		
		Room.computeThickness();
		
		int mathMark = 50;
		
		Room studyRoom = new Room(500, 300, 150);
		// left side studyRoom is a local variable like mathMark.
		// the object is created on the right side, whenever the new key work is used
		// the left side local variable studyRoom points to the address of the Room object created on the right side
		// since the left side variable is a local variable, it takes memory in stack
		// the right side object takes memory in heap since it was created using new
		
//		studyRoom.length = 500;
//		studyRoom.width  = 300;
//		studyRoom.height = 150;
		
		System.out.println("floor area of study room : " + studyRoom.floorArea());
		
		Room diningRoom = new Room(800, 400, 150);
		
		System.out.println("floor area of dining room : " + diningRoom.floorArea());
		
		Room bedroom = new Room(250, 150, 150, 501, "lightpink");
		
		Room studyRoom2 = studyRoom;
		
		Room livingRoom = new Room(800, 400, 150);
		
		// == on reference variable will check for reference equality
		// == does not do content equality
		System.out.println("studyRoom == diningRoom : " + (studyRoom == diningRoom)); // false
		System.out.println("studyRoom2 == studyRoom : " + (studyRoom2 == studyRoom)); // true
		System.out.println("diningRoom == livingRoom : " + (diningRoom == livingRoom)); // false
		
		// but if we want content equality, we can equals() method
		// equals() is in the Object class
		System.out.println("studyRoom.equals(diningRoom : " + (studyRoom.equals(diningRoom))); // false
		System.out.println("studyRoom2.equals(studyRoom) : " + (studyRoom2.equals(studyRoom)));  // true
		System.out.println("diningRoom.equals(livingRoom) : " + (diningRoom.equals(livingRoom))); // false, true after overriding equals method
		
		
	}
}
