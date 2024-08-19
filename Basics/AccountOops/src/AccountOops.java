
public class AccountOops {

	private int accNo;
	private String accName;
	private String accType;
	private double accBal;
	
	public AccountOops(int accNo, String accName, String accType, double accBal) 
	{
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
}
