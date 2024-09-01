
public class AreaThread implements Runnable {
	
	Area a;

	public AreaThread(Area a) {
		super();
		this.a = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.circleArea();
		a.tringleArea();

	}

}
