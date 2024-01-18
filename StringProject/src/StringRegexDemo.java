import java.util.Scanner;
import java.util.regex.Pattern;

public class StringRegexDemo {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter y or n:");
//		String ch = scan.next();
//		
//		// single character which is y or n
//		boolean result = Pattern.matches("[yn]", ch);
//		System.out.println(result);
		
		// single character in the range a-z or A-Z
		System.out.println("Pattern.matches(\"[a-zA-Z]\", \"g\") : " + Pattern.matches("[a-zA-Z]", "g"));
		
		System.out.println("Pattern.matches(\"A+\", \"AAAAAAAAA\") : " + Pattern.matches("A+", "AAAAAAAAA"));
		
		// a string which starts with A and has any a-z after that
		System.out.println("Pattern.matches(\"A{1}[a-z]*\", \"Anna\") : " + Pattern.matches("A{1}[a-z]*", "Anna"));
		
		// s string has number 0 to 9 and length is exactly 10
		System.out.println("Pattern.matches(\"[0-9]{10}\", \"5566442277\") : " + Pattern.matches("[0-9]{10}", "5566442277"));
		
		// a string which is a valid email - abc@gmail.com
		System.out.println("Pattern.matches(\"[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+\", \"abc123@gmail.com\") : " + Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+", "abc123@gmail.com"));
		
		// a string for first name , starting letter is capital, rest is small letters, minlength is 2 maxlength is 20
		System.out.println("Pattern.matches(\"[A-Z][a-z]{1,19}\", \"Priya\")" + Pattern.matches("[A-Z][a-z]{1,19}", "Priya"));

		// a string for fullname
		//		- two words, each starting with capital letter
		//		- a space between 2 word
		System.out.println("Pattern.matches(\"[A-Z][a-z]{1,19} [A-Z][a-z]{1,19}\", \"Priya Raj\") : " + Pattern.matches("[A-Z][a-z]{1,19} [A-Z][a-z]{1,19}", "Priya Raj"));
		
	}

}
