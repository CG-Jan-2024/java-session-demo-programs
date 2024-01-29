import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo4 {

	public static void main(String[] args) {
		//... lines of code
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//... lines of code
	}
	
	public static void method1() throws FileNotFoundException {
		//... lines of code
		method2();
		//... lines of code
	}
	
	public static void method2() throws FileNotFoundException{
		//... lines of code
		method3();
		//... lines of code
	}
	
	public static void method3() throws FileNotFoundException{
		//... lines of code
		FileOutputStream fos = new FileOutputStream("sample.txt");
		// this line throws a check exception called FileNotFoundException
		//... lines of code
	}

}
