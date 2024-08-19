
public class Tvs implements Bike {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Kinetic";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Pink";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 90000;
	}

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 150;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice()+"\nBike CC   :"+getCC();
	}

}
