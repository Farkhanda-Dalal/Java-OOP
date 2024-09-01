
public class Person extends Thread {
	
	private Mobile mobj;
	private String str;
	
	public Person(Mobile mobj, String str) {
		super();
		this.mobj = mobj;
		this.str = str;
	}
	
	public void run()
	{
		mobj.startCall(str);
		mobj.endCall(str);
	}

}
