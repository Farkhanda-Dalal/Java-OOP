
public class SavingsAccount extends Account {
	
	float roi;

	public SavingsAccount(int accNO, double accBal, String accType, Customer cust, Address addr, float roi) {
		super(accNO, accBal, accType, cust, addr);
		this.roi = roi;
	}

	public float getRoi() {
		return roi;
	}

	public void setRoi(float roi) {
		this.roi = roi;
	}

	
}
