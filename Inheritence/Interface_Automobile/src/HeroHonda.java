
public class HeroHonda implements Bike {
	//this can also be written as public class HeroHonda implements Bike,Automobile{}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Splender";
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 180;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nModel Name:"+getModel()+"\nColour    :"+getColour()+"\nPrice     :"+getPrice()+"\nBike CC   :"+getCC();
	}

}
