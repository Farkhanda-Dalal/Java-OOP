
public class UserTrail {
	
	private int val1;
	private int val2;
	
	public UserTrail(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void show()
	{
		if(val1<0||val2<0)
		{
			try {
				throw new IllegalValue();
			} catch (IllegalValue e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
		else
		{
			System.out.println("no1="+val1);
			System.out.println("no1="+val2);
		}
	}

}
