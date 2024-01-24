
public record Employee(int empId, String empName, int empSalary) {
	public int compute() {
		return 2 * empSalary;
	}
}
