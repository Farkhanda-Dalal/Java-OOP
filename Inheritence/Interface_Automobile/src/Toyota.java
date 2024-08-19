
public class Toyota implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota Innova";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice();
	}
}
