//exception handling using throws

package nikitha;

public class UserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empcode=12345;
		int code=Integer.parseInt(args[0]);
		
		try{
			if(code!=empcode)
				throw new EmployeeNotFoundException();
			System.out.println("employee exists");
		}
		catch(EmployeeNotFoundException e){
			System.out.println(e.getMessage());
			
		}
	}

}
