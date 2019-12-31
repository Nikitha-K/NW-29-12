
public class ArithmeticApplication {
	
	
	public static void main(String[] args) {
		Arithmetic arithmetic = (x,y)->{
			System.out.println("add method");
			return x+y;
		};
		System.out.println(arithmetic.add(10,20));
		arithmetic.output();

	}

}
