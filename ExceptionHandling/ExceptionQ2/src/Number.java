
public class Number {

	private int a;
	private int b;
	private double result;

	public Number(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		result=a+b;
		System.out.println("Sum of "+a+" and "+b+" ="+result);
	}
	
	public void sub()
	{
		result=a-b;
		System.out.println("Diff of "+a+" and "+b+" ="+result);
	}
	
	public void multi()
	{
		result=a*b;
		System.out.println("Product of "+a+" and "+b+" ="+result);
	}
	
	public void div()
	{
		try {
			result=a/b;
			System.out.println("Quotient of "+a+" and "+b+" ="+result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
