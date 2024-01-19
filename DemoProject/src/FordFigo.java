
public class FordFigo {
	String model;
	String color;
	
	public FordFigo(String model, String color) {
		this.model = model;
		this.color = color;
	}

	boolean switchOn() {
		System.out.println(model + " switched on");
		return true;
	}
	
	boolean switchOff() {
		System.out.println(model + " switched off");
		return true;
	}
	
	boolean applyBrake() {
		System.out.println(model + " manual brake applied");
		return true;
	}
}
