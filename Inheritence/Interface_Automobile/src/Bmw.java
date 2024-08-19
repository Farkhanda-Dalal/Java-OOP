
public class Bmw implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW MayBach";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "BlACK";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 4500000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice();
	}

}
