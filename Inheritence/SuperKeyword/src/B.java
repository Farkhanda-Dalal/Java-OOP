class B extends A
{
	private int x=20;
	
	B()//Default Constructor
	{
		super(100);//Parametric Constructor from class A is called using super keyword
		System.out.println("Class B default constructor");
	}
	
	public void show()
	{
		super.show();//Method Show from Class A is called using super keyword
		System.out.println("Base class var x:"+super.x);
		System.out.println("Base class var x:"+x);
	}
	
}
