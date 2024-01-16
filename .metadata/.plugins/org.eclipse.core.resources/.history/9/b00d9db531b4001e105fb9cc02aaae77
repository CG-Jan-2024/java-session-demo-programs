public class Room{
	double length;
	double height;
	double width;
	int roomNo;
	String roomColor;
	
	static int wallThickness; // made it static because the value is the same for any object create
	
	static {
		wallThickness = 30;
	}
	// constructor
	//	- a special method
	//  - it has the same name as the class name
	//  - it does not have return type, not even void
	//  - it is called automatically when the object is created
	//  - purpose is to intialize instance variables
	//  - if we do not provide a constructor, a default
				//constructor(a constructor with no arguments) is automatically provided after the class is compile
	//  - the moment you provide a constructor, the default constructor is no longer provided
	//  - we can overload the constructors
	// 				- constructors with either different no of arg or order of arg or type of args	
	//  - we can do constructor chaining
	//				- calling one constructor from another constructor
	//				- it is done using this()
	
	// this - this refers to the current object
	
	public Room(double length, double width, double height) {
		this.length = length; // assigning local variable length to instance variable length
		this.width = width;
		this.height = height;
	}
	
	public Room(double length, double width, double height, int roomNo) {
		this(length, width, height);
		this.roomNo = roomNo;
	}
	
	public Room(double length, double width, double height, int roomNo, String roomColor) {
//		this.length = length; 
//		this.width = width;
//		this.height = height;
		this(length, width, height, roomNo); // this is constructor chaining, 
											// here the above constructor is called
											// this has to be the first line in your constructor
		this.roomColor = roomColor;
	}
	
	public static double computeThickness() {
		double thickness = 1.5 * wallThickness;
		return thickness;
	}
	
	public double floorArea(){
		double fArea = length * width;
		return fArea;
	}
	public double costOfPaintingWalls(){
		double wallArea = (2 * length * height) + (2 * width * height);
		double costOfPainting = wallArea * 2;
		return costOfPainting;
	}
}
