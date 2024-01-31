
public class Demo {

	// exception  - occurs at runtime, not at compile time
	// problems - the lines after the line which caused exception does not execute
	//			- the program terminates abruptly
	
	// 5 keywords
	// try
	//		- the suspicious code is writtern inside the try block
	// catch
	//		- this is the handler
	//		- can a try block have multiple catch blocks? yes
	// 		- if so ,is there a sequence of the catch blocks? yes
	//		- what is the sequence? the subclass exceptions should be the first catch block
	// finally
	//		- a block, which executes whether an exception is thrown or not thrown
	//		- comes after the catch block
	//		- resources that were opened in the try block will be closed in the finally block.
	// throw
	//		- to throw an exception explicitly
	//		- here we create an excpetion object and throws it
	//		- throw is used to throw custom/user defined exception
	// throws
	//		- used to propagate an exception
	//		- we can progragate more than one exception using throws seperated cy comma
	// checked exceptions and unchecked exceptions
	//			unchecked exception
	//					- RuntimeException and all its sub classes come under unchecked exception
	//					- these exceptions are not enforced by the compiler to be handled
	//			checked exceptions
	//					- Exception and all its sublassses(excluding RuntimeException) are checked exceptions
	//					- these exceptions are compiler enforced exception
	
	// custom/ user defined exceptions
	// exception heirarchy
	
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int c = 0;
		System.out.println("Going to divide:");
		
		c = a / b;
		// in the above line an exception has occured
		// 1. the JRE identifies that an exception has occured : ArithmeticException
		// 2. JRE creates an object of the exception
		// 3. the exception object is thrown
		// 4. this exception object is caught by the default handler(another program, part of JRE meant to catch excpetions)
		// 5. after catching exception, the defaulter display the exception message on the console.
		// 6. when the control goes from the program to default handler, the control can never come back to the program
		
		System.out.println("Answer is: " + c);
	}

}
