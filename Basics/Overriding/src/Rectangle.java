
public class Rectangle extends Shape {

	private int l;
	private int b;
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	public void findArea()
	{
		float ra=2*(l+b);
		System.out.println(ra);
	}
}
