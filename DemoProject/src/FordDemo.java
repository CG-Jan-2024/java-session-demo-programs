
public class FordDemo {

	public static void main(String[] args) {
		FordFigo figo1 = new FordFigo("FIGO", "Silver");
		figo1.switchOn();
		figo1.applyBrake();
		figo1.switchOff();
		
		System.out.println("========================================");
		
		FordFigo figo2 = new FordFigo("FIGO", "White");
		figo2.switchOn();
		figo2.applyBrake();
		figo2.switchOff();
		
		System.out.println("========================================");
		
		FordFigoTitanium figoTita1 = new FordFigoTitanium("FIGO TITANIUM", "red", 6);
		figoTita1.switchOn();
		figoTita1.powerWindows();
		figoTita1.applyBrake();
		figoTita1.switchOff();
	}

}
