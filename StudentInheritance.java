
package nikitha;
public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	
	/*public Student(){
	 * regno=1234;
	 * stdname ="deloitte";
	 * group="ECE";
	 * }
	 */
	public void display(){
	System.out.println(regno+stdname+group);
	
}
	//Constructors are generated
	
	public Student(int regno, String stdname, String group) {
	//super();
	this.regno = regno;
	this.stdname = stdname;
	this.group = group;
}

}
