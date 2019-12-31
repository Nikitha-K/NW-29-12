package nikitha;

public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
	System.out.println("Employee not found");
	// super("Employee not found");
	}
}
