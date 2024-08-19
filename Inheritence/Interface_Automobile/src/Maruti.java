
public class Maruti implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Maruti Swift";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice();
	}

}
