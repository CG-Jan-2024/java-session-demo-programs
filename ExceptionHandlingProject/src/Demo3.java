
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Start...");
		
//		ArithmeticException ae = new ArithmeticException();
//		throw ae; // used to explicitly throw an exception object
//					// used for custom/user defined exception
		
		int option = 9; // menu option should be from 1 to 5
		try {
			if(option <=0 || option >5) {
				InvalidOptionException ie = new InvalidOptionException(option);
				throw ie;
			}
		}catch(InvalidOptionException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println("Stop...");

		
	}

}
