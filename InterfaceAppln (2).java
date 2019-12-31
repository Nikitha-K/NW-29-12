
public class InterfaceAppln implements One,Three{
	public static void main(String[] args)
	{
		One one=new InterfaceAppln();
		int x=20;
		System.out.println(x);
		one.methodOne();
	}

	

	@Override
	public void methodOne(){
		System.out.println("method one");
}


	@Override
	public void methodTwo(){
		System.out.println("method two");
}
	

	@Override
	public void methodThree(){
		System.out.println("method three");
}
	
}
