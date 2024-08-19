
public class RoyalEnfield implements Bike {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Bullet Meteor";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 230;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice()+"\nBike CC   :"+getCC();
	}

}
