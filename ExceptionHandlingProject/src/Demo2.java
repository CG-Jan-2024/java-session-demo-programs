
public class Demo2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = 0;
		
		System.out.println("Going to divide:");
		
		try {
			c = a / b; // here exception object is thrown implicitly
			System.out.println("division over.");
		} catch(ArithmeticException ae) {
			System.out.println("some problem has occurred. dividing the number by 1");
			c = a / 1;
		}
		
		System.out.println("Answer is :" + c);
	}

}
