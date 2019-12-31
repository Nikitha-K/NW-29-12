package nikitha;

public class TestException {

	public static void main(String[] args) {
		
		int x=5;
		int y=0;
		int a[]={2,5,3,6,8,6};
		//DriverManager.getConnection("");
		try{
			int r=x/y;
			System.out.println("result = "+r);
			System.out.println("value = "+a[4]);
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
	//	catch(ArithmeticException|IndexOutOfBoundsException e){
	//		System.out.println("either exception occurs");
	//		e.printStackTrace();
	//	}
		
		System.out.println("Success");
		
	}

}
