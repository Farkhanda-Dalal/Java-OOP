
public class Dev {
	
	int cans;
	int coins;
	
	public Dev(int cans, int coins) {
		super();
		this.cans = cans;
		this.coins = coins;
	}

	public int getCans() {
		return cans;
	}

	public void setCans(int cans) {
		this.cans = cans;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	public void dispense(int ucoins)
	{
		Dev d=new Dev(20, 0);
		if(cans>0)
		{
			if(ucoins%2==0)
			{
				cans=cans-(ucoins/2);
				System.out.println("No of cans dispensed :"+(ucoins/2));
				System.out.println("No of cans left      :"+cans);
				
				coins=(coins+ucoins);
				System.out.println("Total coins collected:"+coins);
				d.setCans(cans);
				d.setCoins(coins);
			}
			else
			{
				System.out.println("Enter even no of coins");
			}
		}
		else
		{
			System.out.println("Warning:Refill Cans");
		}
	}

}
