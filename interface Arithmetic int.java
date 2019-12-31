
public interface Arithmetic {
	
	int add(int x, int y);
	
	default void output(){
		System.out.println("it is a default method");
		
	}

}
