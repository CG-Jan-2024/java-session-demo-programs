import java.util.function.BiFunction;

public class Demo {

	public static void main(String[] args) {
		
		// 1st way of implementing functional interface - conventional way, usual way
		//Addition add = new Addition(); // here implementation class reference variable points to implementation class' object
		Operation add = new Addition(); // here the interface reference variable points to the implementation class' object
		System.out.println("SUM : " + add.operate(4, 5));
		
		Operation multiply = new Multiplication();
		System.out.println("PRODUCT : " + multiply.operate(4, 5));
		
		// 2nd way of implementing functional interface - anonymous classes
		// anonymous classes - classes which do not have a name
		// we need an anonymous class implmemtation of the function interface Operation
		Operation add1 = new Operation() {

			@Override
			public int operate(int num1, int num2) {
				return (num1 + num2);
			}	
			
		};
		System.out.println("SUM - Using anonymous class implementation : " + add1.operate(2, 5));
		
		Operation multiply1 = new Operation() {

			@Override
			public int operate(int num1, int num2) {
				return (num1 * num2);
			}
			
		};
		
		System.out.println("PRODUCT  - using anonymous class implementation : " + multiply1.operate(2, 5));
		
		// 3rd way of implementing functional interface - lambda expressions
		Operation add2 = (num1, num2) -> (num1 + num2);
		System.out.println("SUM - Using lambda expressions : " + add2.operate(3, 5));
		
		Operation multiply2 = (number1, number2) -> number1 * number2;
		System.out.println("PRODUCT - Using lambda expressions : " + multiply2.operate(3, 5));
		
		// here Operation is a user-defined functional interface
		// we can for the huge list of inbuilt functional interfaces provided by 
		//			java in java.util.function package instead user defined functional interface
		// the basic functional interfaces are Supplier, Consumer, Predicate, Function
		// all other functional interfaces are variations of the above 4
		
		BiFunction<Integer, Integer, Integer> add3 = (num1, num2) -> num1 + num2;
		System.out.println("SUM - Using inbuilt functional inetrface: " + add3.apply(7, 2));
		
		BiFunction<Double, Double, Double> multiply3 = (n1, n2) -> n1 * n2;
		System.out.println("MULTIPLY - Using inbuilt functional inetrface: " + multiply3.apply(7.2, 2.1));
	}

}
