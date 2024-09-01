
public class AreaThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a=new Area();
		
		AreaThread at=new AreaThread(a);
		Thread t1=new Thread(at);
		t1.start();

	}

}
