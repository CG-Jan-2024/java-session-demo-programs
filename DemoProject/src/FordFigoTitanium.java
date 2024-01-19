
public class FordFigoTitanium extends FordFigo{
	int noOfAirBags;
	String color;
	 
	public FordFigoTitanium(String model, String color, int noOfAirBags) {
		super(model, color);
		this.noOfAirBags = noOfAirBags;
	}

	boolean powerWindows() {
		System.out.println(model + " power windows used");
		return true;
	}
	
	@Override
	boolean applyBrake() {
		//applyBrake(); // this will call the applyBrake of the sub class, be careful- you will end in infinite recursion
		//super.applyBrake();// this will call the applyBrake of the super class
		System.out.println(model + " ABS brakes applied");
		return true;
	}
}
