
// InvalidOptionException is checked or unchecked exception? - checked
// how do we create unchecked custom exception? - by extending RuntimeException 
public class InvalidOptionException extends Exception{
	
	int opt;
	
	public InvalidOptionException(int opt) {
		this.opt = opt;
	}
	
	@Override
	public String getMessage() {
		return (opt + " is an invalid menu option!");
	}

}
