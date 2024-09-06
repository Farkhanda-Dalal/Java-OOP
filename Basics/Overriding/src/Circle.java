
public class Circle extends Shape {

	private float r;

	public Circle(float r) {
		super();
		this.r = r;
	}
	
	public void findArea()
	{
		float ca=3.14f*r*r;
		System.out.println(ca);
		
	}
}
