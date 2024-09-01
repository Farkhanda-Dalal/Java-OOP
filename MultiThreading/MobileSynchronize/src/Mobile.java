
public class Mobile {
	
	public synchronized void startCall(String str)
	{
		System.out.println("Hello "+str);
		for(int i=0;i<5;i++)
		{
			System.out.println(str+" is busy...."+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void endCall(String str)
	{
		System.out.println("Thank you for calling "+str);
		System.out.println("Please pay you bill "+str);
		System.out.println("============================================");
	}

}
