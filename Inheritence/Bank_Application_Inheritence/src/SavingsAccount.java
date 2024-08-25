
public class SavingsAccount extends Account {
	
	float roi;

	public SavingsAccount(int accNO, double accBal, String accType, float roi) {
		super(accNO, accBal, accType);
		this.roi = roi;
	}

	public float getRoi() {
		return roi;
	}

	public void setRoi(float roi) {
		this.roi = roi;
	}
	
	

}
