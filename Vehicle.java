
public class Vehicle implements Bus, Aeroplane {
	public static void main(String[] args)
	{
		Bus bus= new Vehicle();
		bus.buswheels();
		Aeroplane aeroplane= new Vehicle();
		aeroplane.airplanewheels();
		
		
	}

	@Override
	public void buswheels() {
		// TODO Auto-generated method stub
		System.out.println("Bus has 6 wheels");
	}
	

	@Override
	public void airplanewheels() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane has 2 wheels");
		
	}
	
}
