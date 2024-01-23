import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuntionalInterfacesDemo {

	public static void main(String[] args) {
		// find the greater of 2 numbers
		BiFunction<Integer, Integer, Integer> greaterOf2Numbers = (num1, num2) -> num1>num2?num1:num2;
		System.out.println("Greater of 2 numbers: " + greaterOf2Numbers.apply(8, 3));
		
		// check if a number is odd or even
		Predicate<Integer> oddOrEven = (num) -> num%2==0;
		System.out.println("Odd(false) or even(true): " + oddOrEven.test(8));
		
		// generate a random number between 1 and 100
		Supplier<Integer> randomNumber = () -> (int)(Math.random() * 100);
		System.out.println("Random number: " + randomNumber.get());
		
		// print on console a string in capital letters
		Consumer<String> capitals = (str) -> System.out.println("Capital letters : " +  str.toUpperCase());
		capitals.accept("This is a sentence.");
		
		// find the cube of a number
		Function<Integer, Integer> cube = (num) -> num * num * num;
		System.out.println("Cube : " + cube.apply(4));
	}

}
