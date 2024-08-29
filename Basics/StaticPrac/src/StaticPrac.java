import static java.lang.System.out;

public class StaticPrac {
	
	static int collegeId=3;//allocates memory only once for whole class
	int studId=103;
	
	static 
	{
		out.println("this is a static block");
	}
	
	{
		out.println("this is default block.it executes everytime before constructor.");
	}
	
	public void College()
	{
		out.println("this is default constructor");
	}
	
	public void Display()
	{
		out.println("--------------------------------------------------------");
		out.println("College Id  :  "+collegeId);
		out.println("Student Id  :  "+studId);
		out.println("--------------------------------------------------------");
	}
	
	public static void Show()
	{
		out.println("--------------------------------------------------------");
		StaticPrac temp=new StaticPrac();
		//object has to be created for using non-static variable in static method
		out.println("College Id  :  "+collegeId);
		out.println("Student Id  :  "+temp.studId);
		out.println("--------------------------------------------------------");
	}
	

}
