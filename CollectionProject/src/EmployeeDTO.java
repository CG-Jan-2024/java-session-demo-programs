
public class EmployeeDTO implements Comparable{
	// DTO - Data Transfer Object
	private int empId;
	private String empName;
	private int empSalary;
	
	public EmployeeDTO() {}

	public EmployeeDTO(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Object o) {
		EmployeeDTO otherEmp = (EmployeeDTO)o;
		//return this.empId-otherEmp.empId;
		return this.empName.compareTo(otherEmp.empName);
	}

	@Override
	public String toString() {
		return "[empId: " + empId + ", empName: " + empName + ", empSalary: " + empSalary + "}";
	}
	
	
}
