public class Room{
	double length;
	double height;
	double width;

	// constructor
	//	- a special method
	//  - it has the same name as the class name
	//  - it does not have return type, not even void
	//  - it is called automatically when the object is created
	//  - purpose is to intialize instance variables
	//  - if we do not provide a constructor, a default
				//constructor(a constructor with no arguments) is automatically provided after the class is compile
	//  - the moment you provide a constructor, the default constructor is no longer provided
	
	public Room(double lenght, double width, double height) {
		this.length = lenght; // assigning local variable length to instance variable length
		this.width = width;
		this.height = height;
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
