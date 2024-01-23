
// Functional interface - interfaces with exactly one abstract method, 
//						- but they can have any number of default and static methods

@FunctionalInterface
public interface Operation {
	int operate(int num1, int num2);
}
